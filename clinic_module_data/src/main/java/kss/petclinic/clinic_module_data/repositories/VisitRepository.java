package kss.petclinic.clinic_module_data.repositories;


import kss.petclinic.clinic_module_data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
