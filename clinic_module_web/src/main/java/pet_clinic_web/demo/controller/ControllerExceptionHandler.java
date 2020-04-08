package pet_clinic_web.demo.controller;

import kss.petclinic.clinic_module_data.exceptions.NumberFormatException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatExceptionHandler(Exception exception, Model model){
        model.addAttribute("exception", exception);
        return "/errors/400BadRequest";
    }
}
