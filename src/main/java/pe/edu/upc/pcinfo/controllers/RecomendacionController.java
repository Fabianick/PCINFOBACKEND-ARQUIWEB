package pe.edu.upc.pcinfo.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.CuestionarioDTO;
import pe.edu.upc.pcinfo.dtos.RecomendacionDTO;
import pe.edu.upc.pcinfo.entities.Cuestionario;
import pe.edu.upc.pcinfo.entities.Recomendacion;
import pe.edu.upc.pcinfo.services.IRecomendacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recomendaciones")
public class RecomendacionController {

    @Autowired
    private IRecomendacionService rS;


    @PostMapping
    public void insert(@RequestBody RecomendacionDTO dto){
        ModelMapper m=new ModelMapper();
        Recomendacion c=m.map(dto,Recomendacion.class);
        rS.insert(c);
    }
    @GetMapping
    public List<RecomendacionDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecomendacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        rS.delete(id);
    }
    @GetMapping("{id}")
    public RecomendacionDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RecomendacionDTO dto=m.map(rS.listId(id),RecomendacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody RecomendacionDTO dto){
        ModelMapper m=new ModelMapper();
        Recomendacion c=m.map(dto,Recomendacion.class);
        rS.insert(c);
    }
}
