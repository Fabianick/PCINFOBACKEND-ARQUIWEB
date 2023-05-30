package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Cuestionario;

import java.util.List;

public interface ICuestionarioService {
    public void insert(Cuestionario cuestionario);
    List<Cuestionario> list();
    public void delete(int id);
    public Cuestionario listId(int id);
}
