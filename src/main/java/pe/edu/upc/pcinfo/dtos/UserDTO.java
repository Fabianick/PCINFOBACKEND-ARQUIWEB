package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Role;

import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String password;
    private Boolean enabled;

    private List<Role> roles;
}
