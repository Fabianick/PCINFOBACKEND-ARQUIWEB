package pe.edu.upc.pcinfo.services;

import java.util.List;
import pe.edu.upc.pcinfo.entities.Reporte;

public interface IReporteService{
        public void insert(Reporte reporte);
        List<Reporte> list();
        public void delete(int id);
        public Reporte listId(int id);
}
