package br.com.prsouz.brothers.engine.controller;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.core.ports.in.transfobject.BrotherTO;
import br.com.prsouz.brothers.engine.core.usecase.ProcessBrothers;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import br.com.prsouz.brothers.engine.repository.BrothersRepository;
import br.com.prsouz.brothers.engine.utility.BrotherConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrothersController {

    @Autowired
    private BrothersRepository repository;

    @Autowired
    private BrothersRepository brothersRepository;

    @Autowired
    BrotherConverter brotherConverter;

    @Autowired
    ProcessBrothers processBrothers;

    @PostMapping(path = "/add")
    public BrotherModel createUser(@RequestBody BrotherTO brother) {
        BrotherModel brotherModel = brotherConverter.convertBrotherTOToModel(brother);
        brotherModel = processBrothers.saveNewBrother(brotherModel);
        return brotherModel;
    }

    @GetMapping(path = "/get")
    public List<BrotherModel> consultaUsers(){
    Iterable<BrothersEntity> brotherEntity = brothersRepository.GetAllBrothers();
    List<BrotherModel> brotherModel = new ArrayList<>();
    brotherEntity.forEach(brother -> brotherModel.add(brotherConverter.convertBrotherEntityToModel(brother)));
    return brotherModel;

    }

     /* @GetMapping(path = "/brothers")
    public BrothersEntity getBrother(){

        BrothersEntity brother = new BrothersEntity();
        Endereco end = new Endereco();
        end.setLogradouro("Av. Dom Jaime de Barros Camara");
        brother.setName("Paulo");
        brother.setCpf("299.023.498-54");
        brother.setBirthDate(LocalDate.now());

        brother.setEnd(end);



        System.out.println(brother);
        System.out.println(brother.getName());

        return brother;

    }*/


}
