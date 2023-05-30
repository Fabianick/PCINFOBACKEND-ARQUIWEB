package pe.edu.upc.pcinfo.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.entities.Recomendacion;
import pe.edu.upc.pcinfo.repositories.IRecomendacionRepository;
import pe.edu.upc.pcinfo.services.IRecomendacionService;

import java.util.List;

@Service
public class RecomendacionServiceImplement implements IRecomendacionService {

    @Autowired
    private IRecomendacionRepository rR;
    @Override
    public void insert(Recomendacion recomendacion) {
        rR.save(recomendacion);
    }

    @Override
    public List<Recomendacion> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Recomendacion listId(int id) {
        return rR.findById(id).orElse(new Recomendacion());
    }
}
