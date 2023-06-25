package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.dtos.UsuarioComentarioDTO;
import pe.edu.upc.pcinfo.entities.Usuario;
import pe.edu.upc.pcinfo.repositories.IUsuarioRepository;
import pe.edu.upc.pcinfo.services.IUsuarioService;

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
}
