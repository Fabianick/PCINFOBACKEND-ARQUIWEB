package pe.edu.upc.pcinfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pcinfo.entities.Reporte;

import java.util.List;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte,Integer> {
    @Query(value = "SELECT a.nombre, COUNT(b.id)\n" +
            "FROM reporte b\n" +
            "JOIN usuario a ON b.id_usuario = a.id\n" +
            "GROUP BY a.nombre\n" +
            "ORDER BY COUNT(b.id) DESC", nativeQuery = true)
    List<String[]> getCountReporteByUsuario();
}
