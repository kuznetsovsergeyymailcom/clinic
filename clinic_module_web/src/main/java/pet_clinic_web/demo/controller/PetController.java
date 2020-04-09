package pet_clinic_web.demo.controller;

import kss.petclinic.clinic_module_data.model.Pet;
import kss.petclinic.clinic_module_data.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/api/pets")
    public @ResponseBody Set<Pet> getAllPets(){
        Set<Pet> all = petService.findAll();

        return all;
    }
}
