package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.entities.Cuestionario;
import pe.edu.upc.pcinfo.repositories.ICuestionarioRepository;
import pe.edu.upc.pcinfo.services.ICuestionarioService;

import java.util.List;

@Service
public class CuestionarioServiceImplement implements ICuestionarioService {
    @Autowired
    private ICuestionarioRepository cR;

    @Override
    public void insert(Cuestionario cuestionario) {
        cR.save(cuestionario);
    }

    @Override
    public List<Cuestionario> list() {
        return cR.findAll();
    }
}
