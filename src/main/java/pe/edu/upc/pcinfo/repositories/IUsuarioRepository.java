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




    //CONSULTA 2 CAMILO
    @Query(value = "select u.nombre, c.comentario, c.fecha\n" +
            "from usuario u\n" +
            "join comentario c ON u.id = c.id_usuario\n" +
            "order by c.fecha desc\n" +
            "limit 5", nativeQuery = true)
    List<String[]> getComentariosByUsuario2();
}
