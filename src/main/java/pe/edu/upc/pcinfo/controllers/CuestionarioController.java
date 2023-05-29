package pe.edu.upc.pcinfo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.CuestionarioDTO;
import pe.edu.upc.pcinfo.entities.Cuestionario;
import pe.edu.upc.pcinfo.services.ICuestionarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cuestionarios")
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
    public List<CuestionarioDTO>list(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CuestionarioDTO.class);
        }).collect(Collectors.toList());
    }
}
