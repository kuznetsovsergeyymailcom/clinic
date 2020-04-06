package kss.petclinic.clinic_module_data.services.map;

import kss.petclinic.clinic_module_data.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {
    OwnerMapService ownerMapService;
    private final Long ownerId = 1L;

    @BeforeEach
    void setup(){
        ownerMapService = new OwnerMapService(new PetMapService(), new PetTypeMapService());
        ownerMapService.save(Owner.builder().build());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(1L, owner.getId());
    }

    @Test
    void save() {
        Owner owner = ownerMapService.save(Owner.builder().build());
        assertEquals(2L, owner.getId());
    }

    @Test
    void saveWithExistedId() {

        Owner build = Owner.builder().build();
        build.setId(23L);
        Owner owner = ownerMapService.save(build);
        assertEquals(23L, owner.getId());
    }

    @Test
    void findAll() {
        Set<Owner> all = ownerMapService.findAll();
        assertEquals(1, all.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(1L));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        String name = "leonid";
        Owner leonid = new Owner();
        leonid.setLastName(name);

        ownerMapService.save(leonid);
        Owner byLastName = ownerMapService.findByLastName(name);

        assertEquals("leonid", byLastName.getLastName());
    }
}