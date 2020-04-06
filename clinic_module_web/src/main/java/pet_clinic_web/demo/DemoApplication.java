package pet_clinic_web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"kss.petclinic.clinic_module_data.initializer",
        "kss.petclinic.clinic_module_data.services", "pet_clinic_web.demo.controller"})
@EntityScan("kss.petclinic.clinic_module_data.model")
@EnableJpaRepositories("kss.petclinic.clinic_module_data.repositories")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
