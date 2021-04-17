package br.com.prsouz.brothers.engine.controller;

import br.com.prsouz.brothers.engine.repository.Brothers;
import br.com.prsouz.brothers.engine.repository.CrudRepository;
import br.com.prsouz.brothers.engine.repository.Endereco;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class BrothersController {

    @GetMapping(path = "/brothers")
    public Brothers getBrother(){
        Brothers brother = new Brothers();
        Endereco end = new Endereco();
        end.setLogradouro("Av. Dom Jaime de Barros Camara");
        brother.setName("Paulo");
        brother.setCpf("299.023.498-54");
        brother.setBirthDate(LocalDate.now());

        brother.setEnd(end);



        System.out.println(brother);
        System.out.println(brother.getName());

        return brother;

    }


}
