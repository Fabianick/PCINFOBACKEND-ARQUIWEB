package pe.edu.upc.pcinfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pcinfo.entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
}
