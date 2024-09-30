package tn.stage.appspringstagev2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.stage.appspringstagev2.entities.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
