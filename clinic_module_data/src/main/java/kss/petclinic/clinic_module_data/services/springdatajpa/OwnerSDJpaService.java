package kss.petclinic.clinic_module_data.services.springdatajpa;

import kss.petclinic.clinic_module_data.exceptions.NotFoundException;
import kss.petclinic.clinic_module_data.model.Owner;
import kss.petclinic.clinic_module_data.repositories.OwnerRepository;
import kss.petclinic.clinic_module_data.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;

    }

    @Override
    public Owner findByLastName(String lastName) {

        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Owner findById(Long id) {
        Owner owner = ownerRepository.findById(id).orElse(null);

        return owner;
    }

    @Override
    public Owner save(Owner entity) {
        return ownerRepository.save(entity);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }


}
