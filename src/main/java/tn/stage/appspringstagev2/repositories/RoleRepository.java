package tn.stage.appspringstagev2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.stage.appspringstagev2.entities.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);

}
