package br.com.prsouz.brothers.engine.service;

import br.com.prsouz.brothers.engine.entity.Brothers;
import br.com.prsouz.brothers.engine.entity.Endereco;
import br.com.prsouz.brothers.engine.repository.BrothersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BrothersTools {

    public void createNewBrother(String name, String cpf, Integer cim, BrothersRepository repository){
        Brothers brothers = new Brothers();
        brothers.setName(name);
        brothers.setCpf(cpf);
        brothers.setCim(cim);
        brothers.setBirthDate(LocalDate.now());
        System.out.println(brothers);

        repository.save(brothers);
    }


}
