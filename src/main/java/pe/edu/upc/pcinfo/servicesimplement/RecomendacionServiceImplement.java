package pe.edu.upc.pcinfo.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.dtos.RecomendacionCuestionarioDTO;
import pe.edu.upc.pcinfo.entities.Recomendacion;
import pe.edu.upc.pcinfo.repositories.IRecomendacionRepository;
import pe.edu.upc.pcinfo.services.IRecomendacionService;

import java.util.ArrayList;
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

    @Override
    public List<RecomendacionCuestionarioDTO> consulta02() {
        List<String []> topProgramasUsed=rR.getRecomendacionxCuestionario();
        List<RecomendacionCuestionarioDTO> recomendacionCuestionarioDTOS=new ArrayList<>();

        for (String [] data:topProgramasUsed){
            RecomendacionCuestionarioDTO dto=new RecomendacionCuestionarioDTO();
            dto.setValoracion_user(Integer.parseInt(data[0]));
            dto.setProgramas_used(data[1]);
            recomendacionCuestionarioDTOS.add(dto);
        }
        return recomendacionCuestionarioDTOS;
    }
}
