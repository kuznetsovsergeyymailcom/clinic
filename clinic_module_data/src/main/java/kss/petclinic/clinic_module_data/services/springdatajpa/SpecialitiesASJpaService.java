package kss.petclinic.clinic_module_data.services.springdatajpa;

import kss.petclinic.clinic_module_data.model.Speciality;
import kss.petclinic.clinic_module_data.repositories.SpecialtyRepository;
import kss.petclinic.clinic_module_data.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitiesASJpaService implements SpecialitiesService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialitiesASJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality entity) {
        return specialtyRepository.save(entity);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
