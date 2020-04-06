package kss.petclinic.clinic_module_data.repositories;

import kss.petclinic.clinic_module_data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
