package pe.edu.upc.pcinfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pcinfo.entities.Recomendacion;

import java.util.List;

@Repository
public interface IRecomendacionRepository extends JpaRepository<Recomendacion,Integer> {




    //CONSULTA 1 WEDY
    @Query(value= "SELECT AVG(valoracion_user) AS promedio_calificacion\n" +
            "FROM recomendacion;\n", nativeQuery = true)
    List<String[]> getPromedioRecomendacion();

    //CONSULTA 2 WEDY

    @Query(value = "SELECT c.valoracion_user, p.programas_used\n" +
            "FROM recomendacion c\n" +
            "INNER JOIN cuestionario p ON c.id = p.id\n" +
            "WHERE c.valoracion_user >= (\n" +
            "  SELECT MAX(c2.valoracion_user)\n" +
            "  FROM recomendacion c2\n" +
            "  WHERE (\n" +
            "    SELECT COUNT(DISTINCT c3.valoracion_user)\n" +
            "    FROM recomendacion c3\n" +
            "    WHERE c3.valoracion_user >= c2.valoracion_user\n" +
            "  ) <= 5\n" +
            ")\n" +
            "ORDER BY c.valoracion_user DESC",nativeQuery = true )
    List<String[]> getRecomendacionxCuestionario();

}
