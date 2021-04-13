package br.com.prsouz.brothers.engine.controller;

import br.com.prsouz.brothers.engine.repository.Brothers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrothersController {

    @GetMapping(path = "/brothers")
    public Brothers getBrother(){
        Brothers brother = Brothers.builder().name("Paulo").cim(20210412).build();
        //Brothers brother = new Brothers(10, "Paulo", 2020212);
        System.out.println(brother);
        System.out.println(brother.getName());

        return brother;

    }


}
