package kss.petclinic.clinic_module_data.services;


import kss.petclinic.clinic_module_data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
