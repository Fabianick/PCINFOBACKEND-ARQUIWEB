package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.entities.Comentario;
import pe.edu.upc.pcinfo.repositories.IComentarioRepository;
import pe.edu.upc.pcinfo.services.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService{
    @Autowired
    private IComentarioRepository cmR;

    @Override
    public void insert(Comentario comentario) {
        cmR.save(comentario);
    }

    @Override
    public List<Comentario> list() {
        return cmR.findAll();
    }

    @Override
    public void delete(int idComentario) {
        cmR.deleteById(idComentario);
    }

    @Override
    public Comentario listId(int idComentario) {
        return cmR.findById(idComentario).orElse(new Comentario());
    }
}
