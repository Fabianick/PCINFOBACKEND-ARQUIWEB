package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Cliente;

import java.util.List;

public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente> list();
    public void delete(int idCliente);
    public Cliente listId(int idCliente);
}
