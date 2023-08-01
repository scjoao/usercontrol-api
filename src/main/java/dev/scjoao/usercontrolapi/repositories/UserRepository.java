package dev.scjoao.usercontrolapi.repositories;

import dev.scjoao.usercontrolapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
