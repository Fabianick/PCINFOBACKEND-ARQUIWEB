package pe.edu.upc.pcinfo.services;

import java.util.List;

import pe.edu.upc.pcinfo.entities.Users;


public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}