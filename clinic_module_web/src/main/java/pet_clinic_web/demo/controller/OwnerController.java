package pet_clinic_web.demo.controller;

import kss.petclinic.clinic_module_data.exceptions.NotFoundException;
import kss.petclinic.clinic_module_data.exceptions.NumberFormatException;
import kss.petclinic.clinic_module_data.model.Owner;
import kss.petclinic.clinic_module_data.services.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfOwners(Owner owner, Model model, BindingResult bindingResult){

        model.addAttribute("owners", ownerService.findAll());

        return "/owners/index";
    }
    @RequestMapping("/error")
    public String notImplemented(){
        return "notimplemented";
    }

    @GetMapping("/{id}")
    public String showOwner(@PathVariable String id, Model model){
        Long temp_id = 0l;
        try{
            temp_id = Long.decode(String.valueOf(id));

        }catch(java.lang.NumberFormatException exception){
            throw new NumberFormatException("ID must be input is number format");
        }

        Owner owner = ownerService.findById(temp_id);
        if(owner == null){
            throw new NotFoundException("Owner not found");
        }
        model.addAttribute("owner", owner);

        return "/owners/ownerDetails";
    }

    @GetMapping("/find")
    public String findOwners(Model model){
        model.addAttribute("owner", Owner.builder().build());
        return "/owners/ownerDetails";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public String notFoundHandler(Exception exception, Model model){
        model.addAttribute("exception", exception);
        return "/errors/404notFound";
    }


}
