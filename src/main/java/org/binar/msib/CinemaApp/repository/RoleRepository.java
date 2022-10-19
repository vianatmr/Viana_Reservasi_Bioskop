package org.binar.msib.CinemaApp.repository;

import org.binar.msib.CinemaApp.entity.ERole;
import org.binar.msib.CinemaApp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
