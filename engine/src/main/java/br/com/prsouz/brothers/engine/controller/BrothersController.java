package br.com.prsouz.brothers.engine.controller;

import br.com.prsouz.brothers.engine.entity.Brothers;
import br.com.prsouz.brothers.engine.entity.Endereco;
import br.com.prsouz.brothers.engine.repository.BrothersRepository;
import br.com.prsouz.brothers.engine.service.BrothersTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class BrothersController {

    @Autowired
    private BrothersRepository repository;

    @Autowired
    private BrothersTools brothersTools;

    @GetMapping(path = "/add")
    public void createUser() {
        brothersTools.createNewBrother("Pedro O Lindão",
                "299.023.498-54",
                289560,
                repository);
        System.out.println("testando");


    }

    @GetMapping(path = "/consulta")
    public Iterable<Brothers> consultaUsers(){

        return repository.findAll();
    }

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
