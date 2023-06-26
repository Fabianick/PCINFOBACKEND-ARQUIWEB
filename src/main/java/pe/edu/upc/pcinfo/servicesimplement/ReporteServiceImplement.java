package pe.edu.upc.pcinfo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pcinfo.dtos.UsuarioReporteDTO;
import pe.edu.upc.pcinfo.entities.Reporte;
import pe.edu.upc.pcinfo.repositories.IReporteRepository;
import pe.edu.upc.pcinfo.services.IReporteService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReporteServiceImplement implements IReporteService {
    @Autowired
    private IReporteRepository reR;

    @Override
    public void insert(Reporte reporte) {
        reR.save(reporte);
    }

    @Override
    public List<Reporte> list() {
        return reR.findAll();
    }

    @Override
    public void delete(int id) {
        reR.deleteById(id);
    }

    @Override
    public Reporte listId(int id) {
        return reR.findById(id).orElse(new Reporte());
    }

    @Override
    public List<UsuarioReporteDTO> consulta01() {
        List<String[]> countReporteByUsuario = reR.getCountReporteByUsuario();
        List<UsuarioReporteDTO> usuarioReporteDTOs = new ArrayList<>();

        for (String[] data : countReporteByUsuario) {
            UsuarioReporteDTO dto = new UsuarioReporteDTO();
            dto.setNombre(data[0]);
            dto.setApellidop(data[1]);
            dto.setReporteCount(Integer.parseInt(data[2]));
            usuarioReporteDTOs.add(dto);
        }

        return usuarioReporteDTOs;
    }

    @Override
    public List<UsuarioReporteDTO> consulta02() {
        List<String[]> ReporteByUsuario = reR.getReporteByUsuario();
        List<UsuarioReporteDTO> usuarioReporteDTOs = new ArrayList<>();

        for (String[] data : ReporteByUsuario) {
            UsuarioReporteDTO dto = new UsuarioReporteDTO();
            dto.setNombre(data[0]);
            dto.setApellidop(data[1]);
            dto.setDescripcion(data[2]);
            usuarioReporteDTOs.add(dto);
        }

        return usuarioReporteDTOs;
    }


}
