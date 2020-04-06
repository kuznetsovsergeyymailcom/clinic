package kss.petclinic.clinic_module_data.repositories;

import kss.petclinic.clinic_module_data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
