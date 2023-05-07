package pe.edu.cibertec.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.examen.models.bd.Especialidad;
@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Integer>{

}
