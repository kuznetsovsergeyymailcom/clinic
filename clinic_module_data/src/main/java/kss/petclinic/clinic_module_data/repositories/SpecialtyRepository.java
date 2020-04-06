package kss.petclinic.clinic_module_data.repositories;


import kss.petclinic.clinic_module_data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
