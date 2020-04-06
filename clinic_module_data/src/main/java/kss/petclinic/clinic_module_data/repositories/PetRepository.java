package kss.petclinic.clinic_module_data.repositories;


import kss.petclinic.clinic_module_data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
