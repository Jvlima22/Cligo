package tglsolutions.Cligo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tglsolutions.Cligo.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
