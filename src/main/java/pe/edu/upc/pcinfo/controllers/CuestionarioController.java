package pe.edu.upc.pcinfo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.CuestionarioDTO;
import pe.edu.upc.pcinfo.entities.Cuestionario;
import pe.edu.upc.pcinfo.services.ICuestionarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cuestionario")
public class CuestionarioController {
    @Autowired
    private ICuestionarioService cS;
    @PostMapping
    public void insert(@RequestBody CuestionarioDTO dto){
        ModelMapper m=new ModelMapper();
        Cuestionario c=m.map(dto,Cuestionario.class);
        cS.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<CuestionarioDTO>list(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CuestionarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("{id}")
    public CuestionarioDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CuestionarioDTO dto=m.map(cS.listId(id),CuestionarioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CuestionarioDTO dto){
        ModelMapper m=new ModelMapper();
        Cuestionario c=m.map(dto,Cuestionario.class);
        cS.insert(c);
    }

}
