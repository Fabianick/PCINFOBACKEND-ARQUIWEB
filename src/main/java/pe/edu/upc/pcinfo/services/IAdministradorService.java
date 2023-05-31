package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Administrador;

import java.util.List;

public interface IAdministradorService {
    public void insert (Administrador administrador);
    List<Administrador> list();
    public void delete (int id);
    public Administrador listId(int id);
}
