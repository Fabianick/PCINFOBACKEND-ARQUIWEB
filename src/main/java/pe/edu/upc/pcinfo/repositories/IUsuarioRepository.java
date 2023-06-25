package pe.edu.upc.pcinfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.pcinfo.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {


    //CONSULTA 1 CAMILO
    @Query(value= "SELECT u.apellidop, u.apellidom, COUNT(*) AS TotalComentarios\n" +
            "FROM usuario u\n" +
            "JOIN comentario c ON u.ID = c.id_usuario\n" +
            "GROUP BY u.apellidop, u.apellidom", nativeQuery = true)
    List<String[]> getComentariosByUsuario();
}
