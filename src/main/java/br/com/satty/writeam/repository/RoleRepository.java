package br.com.satty.writeam.repository;

import br.com.satty.writeam.enums.ERole;
import br.com.satty.writeam.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
