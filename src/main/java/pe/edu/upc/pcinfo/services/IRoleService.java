package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Role;

import java.util.List;



public interface IRoleService {
    public void insert(Role role);

    List<Role> list();

}