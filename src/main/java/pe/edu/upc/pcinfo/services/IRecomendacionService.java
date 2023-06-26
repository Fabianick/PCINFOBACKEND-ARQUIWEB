package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.dtos.RecomendacionCuestionarioDTO;
import pe.edu.upc.pcinfo.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {

    public void insert(Recomendacion recomendacion);
    List<Recomendacion> list();
    public void delete(int id);
    public Recomendacion listId(int id);

    public List<RecomendacionCuestionarioDTO> consulta02();
    public List<RecomendacionCuestionarioDTO> consulta01();

}
