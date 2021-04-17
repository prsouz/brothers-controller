package br.com.prsouz.brothers.engine.repository;

import lombok.Builder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CrudRepository {

    private List<People> peopleList = new ArrayList();

    public void createBrother(String name, String cpf, String logradouro, LocalDate birthdate){
        Brothers brother = new Brothers();
        Endereco end = new Endereco();
        brother.setName(name);
        brother.setCpf(cpf);
        brother.setBirthDate(birthdate);
        end.setLogradouro(logradouro);
        brother.setEnd(end);


    }

    public Brothers consultBrohter(){
        Brothers brother = new Brothers();

        return brother;
    }
}
