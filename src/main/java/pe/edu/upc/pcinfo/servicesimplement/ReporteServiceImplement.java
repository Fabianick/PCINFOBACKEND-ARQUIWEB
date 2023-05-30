package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.entities.Reporte;
import pe.edu.upc.pcinfo.repositories.IReporteRepository;
import pe.edu.upc.pcinfo.services.IReporteService;

import java.util.List;
@Service
public class ReporteServiceImplement implements IReporteService {
    @Autowired
    private IReporteRepository reR;

    @Override
    public void insert(Reporte reporte) {

    }

    @Override
    public List<Reporte> list() {
        return reR.findAll();
    }

    @Override
    public void delete(int id) {
        reR.deleteById(id);
    }

    @Override
    public Reporte listId(int id) {
        return reR.findById(id).orElse(new Reporte());
    }
}
