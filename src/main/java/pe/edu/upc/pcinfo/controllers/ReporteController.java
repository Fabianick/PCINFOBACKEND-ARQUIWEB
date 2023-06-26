package pe.edu.upc.pcinfo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pcinfo.dtos.ReporteDTO;
import pe.edu.upc.pcinfo.dtos.UsuarioReporteDTO;
import pe.edu.upc.pcinfo.entities.Reporte;
import pe.edu.upc.pcinfo.services.IReporteService;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = "http://localhost:4200/administradores/mostrar",maxAge = 36000)
@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    private IReporteService reS;

    @PostMapping
    public void insert(@RequestBody ReporteDTO dto) {
        ModelMapper m = new ModelMapper();
        Reporte a = m.map(dto, Reporte.class);
        reS.insert(a);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<ReporteDTO> list() {
        return reS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReporteDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")  Integer id){
        reS.delete(id);

    }
    @GetMapping("/{id}")
    public ReporteDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ReporteDTO dto=m.map(reS.listId(id),ReporteDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody ReporteDTO dto) {
        ModelMapper m = new ModelMapper();
        Reporte a = m.map(dto, Reporte.class);
        reS.insert(a);

    }
    @GetMapping("/reporte-count")
    public List<UsuarioReporteDTO> getReporteCountByUsuario() {
        List<UsuarioReporteDTO> usuarioReporteDTOs = reS.consulta01();
        return usuarioReporteDTOs;
    }
    @GetMapping("/reporte-count2")
    public List<UsuarioReporteDTO> getReporteByUsuario() {
        List<UsuarioReporteDTO> usuarioReporteDTOs = reS.consulta02();
        return usuarioReporteDTOs;
    }
    }

