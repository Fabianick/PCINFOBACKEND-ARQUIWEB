package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.dtos.UsuarioComentarioDTO;
import pe.edu.upc.pcinfo.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
    List<Usuario> list();

    public List<UsuarioComentarioDTO> consulta01();

    public List<UsuarioComentarioDTO> consulta02();

}
