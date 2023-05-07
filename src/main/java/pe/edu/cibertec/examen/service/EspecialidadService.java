package pe.edu.cibertec.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.examen.models.bd.Especialidad;
import pe.edu.cibertec.examen.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	@Autowired
	private EspecialidadRepository especialidadRepository;
	public  List<Especialidad> listarEspecialidad(){
		return EspecialidadRepository.findAll();
	}
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
}
