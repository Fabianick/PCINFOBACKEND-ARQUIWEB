package pe.edu.upc.pcinfo.servicesimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.pcinfo.entities.Role;
import pe.edu.upc.pcinfo.repositories.RoleRepository;
import pe.edu.upc.pcinfo.services.IRoleService;


@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}