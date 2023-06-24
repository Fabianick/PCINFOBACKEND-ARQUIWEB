package pe.edu.upc.pcinfo.controllers;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.ComponenteDTO;
import pe.edu.upc.pcinfo.entities.Componente;
import pe.edu.upc.pcinfo.services.IComponenteService;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/componente")
public class ComponenteController {

    @Autowired
    private IComponenteService cS;

    @PostMapping
    public void insert(@RequestBody ComponenteDTO dto){
        ModelMapper m = new ModelMapper();
        Componente c=m.map(dto,Componente.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<ComponenteDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ComponenteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("{id}")
    public ComponenteDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ComponenteDTO dto=m.map(cS.listId(id),ComponenteDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComponenteDTO dto){
        ModelMapper m=new ModelMapper();
        Componente c=m.map(dto,Componente.class);
        cS.insert(c);
    }

}
