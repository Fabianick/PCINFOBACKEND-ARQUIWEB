package pe.edu.upc.pcinfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pcinfo.entities.Reporte;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte,Integer> {
}
