package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Componente;

import java.util.List;

public interface IComponenteService {
    public void insert(Componente componente);

    List<Componente> list();

    public void delete(int idComponente);

    public Componente listId(int idComponente);


}
