package kss.petclinic.clinic_module_data.repositories;

import kss.petclinic.clinic_module_data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
