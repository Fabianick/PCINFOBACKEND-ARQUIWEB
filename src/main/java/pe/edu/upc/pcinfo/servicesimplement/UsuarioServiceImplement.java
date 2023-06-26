package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.dtos.UsuarioComentarioDTO;
import pe.edu.upc.pcinfo.entities.Usuario;
import pe.edu.upc.pcinfo.repositories.IUsuarioRepository;
import pe.edu.upc.pcinfo.services.IUsuarioService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public List<UsuarioComentarioDTO> consulta01() {
        List<String[]> countComentariosByUsuario = uR.getComentariosByUsuario();
        List<UsuarioComentarioDTO> usuarioComentarioDTOs = new ArrayList<>();

        for (String[] data: countComentariosByUsuario) {
            UsuarioComentarioDTO dto = new UsuarioComentarioDTO();
            dto.setApellidop(data[0]);
            dto.setApellidom(data[1]);
            dto.setComentarioCount(Integer.parseInt(data[2]));
            usuarioComentarioDTOs.add(dto);
        }

        return usuarioComentarioDTOs;
    }

    @Override
    public List<UsuarioComentarioDTO> consulta02() {
        List<String[]> comentariosByUsuario = uR.getComentariosByUsuario2();
        List<UsuarioComentarioDTO> usuarioComentarioDTOs = new ArrayList<>();

        for (String[] data: comentariosByUsuario) {
            UsuarioComentarioDTO dto = new UsuarioComentarioDTO();
            dto.setNombre(data[0]);
            dto.setComentario(data[1]);
            dto.setFecha(LocalDate.parse(data[2]));
            usuarioComentarioDTOs.add(dto);
        }

        return usuarioComentarioDTOs;
    }
}
