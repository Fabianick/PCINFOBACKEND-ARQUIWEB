package pe.edu.upc.pcinfo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.AdministradorDTO;
import pe.edu.upc.pcinfo.entities.Administrador;
import pe.edu.upc.pcinfo.services.IAdministradorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    private IAdministradorService aS;
    @PostMapping
    public void insert(@RequestBody AdministradorDTO dto){
        ModelMapper m = new ModelMapper();
        Administrador a = m.map(dto,Administrador.class);
        aS.insert(a);
    }
    @GetMapping
    public List<AdministradorDTO> list(){
        return  aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,AdministradorDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public AdministradorDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        AdministradorDTO dto = m.map(aS.listId(id),AdministradorDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody AdministradorDTO dto){
        ModelMapper m = new ModelMapper();
        Administrador a = m.map(dto,Administrador.class);
        aS.insert(a);
    }


}
