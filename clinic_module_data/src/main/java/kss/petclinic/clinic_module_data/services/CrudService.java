package kss.petclinic.clinic_module_data.services;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);
    T save(T entity);
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
