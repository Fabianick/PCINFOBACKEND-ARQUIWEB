package pe.edu.upc.pcinfo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.pcinfo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}