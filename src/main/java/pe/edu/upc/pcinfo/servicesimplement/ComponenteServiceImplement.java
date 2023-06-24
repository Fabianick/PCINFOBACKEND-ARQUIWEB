package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.pcinfo.entities.Componente;
import pe.edu.upc.pcinfo.repositories.IComponenteRepository;
import pe.edu.upc.pcinfo.services.IComponenteService;

import java.util.List;


@Service
public class ComponenteServiceImplement implements IComponenteService {

    @Autowired
    private IComponenteRepository cmR;

    @Override
    public void insert(Componente componente) {
        cmR.save(componente);
    }

    @Override
    public List<Componente> list() {
        return cmR.findAll();
    }

    @Override
    public void delete(int idComponente) {
        cmR.deleteById(idComponente);
    }

    @Override
    public Componente listId(int idComponente) {
        return cmR.findById(idComponente).orElse(new Componente());
    }
}
