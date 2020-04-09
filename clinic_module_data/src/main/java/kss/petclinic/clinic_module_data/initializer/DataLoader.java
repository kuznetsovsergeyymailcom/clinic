package kss.petclinic.clinic_module_data.initializer;

import kss.petclinic.clinic_module_data.model.*;
import kss.petclinic.clinic_module_data.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
//@Profile({"dev", "prod"})
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;
    private final VisitService visitService;

    public DataLoader(VetService vetService, OwnerService ownerService, PetService petService, PetTypeService petTypeService,
                      SpecialitiesService specialitiesService, VisitService visitService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) {

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCat = petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDog = petTypeService.save(dog);

        Owner owner = new Owner();
        owner.setFirstName("first name 1");
        owner.setLastName("last name 1");
        owner.setAddress("address 1");
        owner.setCity("city 1");
        owner.setTelephone("9 678-978-783");
        ownerService.save(owner);

        Pet pet1 = new Pet();
        pet1.setPetType(savedCat);
        pet1.setOwner(owner);
        pet1.setName("pet 1");
        pet1.setLocalDate(LocalDate.now());

        Pet savedPet1 = petService.save(pet1);

        owner.getPets().add(savedPet1);

        Speciality specialityRadiology = new Speciality();
        specialityRadiology.setDescription("Radiology");
        Speciality savedRadiology = specialitiesService.save(specialityRadiology);

        Speciality specialityDentistry = new Speciality();
        specialityDentistry.setDescription("Radiology");
        Speciality savedDentistry = specialitiesService.save(specialityDentistry);

        Speciality specialitySurgery = new Speciality();
        specialitySurgery.setDescription("Radiology");
        Speciality savedSurgery = specialitiesService.save(specialitySurgery);


        Owner owner1 = new Owner();
        owner1.setFirstName("first name 2");
        owner1.setLastName("last name 2");
        owner1.setAddress("address 2");
        owner1.setCity("city 2");
        owner1.setTelephone("7 892 6745 672");
        ownerService.save(owner1);

        Pet pet2 = new Pet();
        pet2.setPetType(savedDog);
        pet2.setOwner(owner1);
        pet2.setName("pet 2");
        pet2.setLocalDate(LocalDate.now());
        Pet savedPet2 = petService.save(pet2);

        owner1.getPets().add(savedPet2);

        Visit catVisit = new Visit();
        catVisit.setDescription("visit of cat");
        catVisit.setLocalDate(LocalDate.now());
        catVisit.setPet(pet1);

        visitService.save(catVisit);

        Visit dogVisit = new Visit();
        dogVisit.setDescription("visit of dog");
        dogVisit.setLocalDate(LocalDate.now());
        dogVisit.setPet(pet2);

        visitService.save(dogVisit);

        Owner owner2 = new Owner();
        owner2.setFirstName("first name 3");
        owner2.setLastName("last name 3");
        owner2.setAddress("address 3");
        owner2.setCity("city 3");
        owner2.setTelephone("7 8937 8793");
        this.ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("first name 4");
        owner3.setLastName("last name 4");
        owner3.setAddress("address 4");
        owner3.setCity("city 4");
        owner3.setTelephone("7 7839 7893 67");
        this.ownerService.save(owner3);

        System.out.println("Loaded owners .. ");

        Vet vet1 = new Vet();
        vet1.setFirstName("vet name 1");
        vet1.setLastName("vet last name 1");
        vet1.getSpecialities().add(savedDentistry);
        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet name 2");
        vet2.setLastName("vet last name 2");
        vet2.getSpecialities().add(savedRadiology);
        this.vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("vet name 3");
        vet3.setLastName("vet last name 3");
        vet3.getSpecialities().add(savedSurgery);
        this.vetService.save(vet3);

        System.out.println("Loaded vets ...");
    }
}
