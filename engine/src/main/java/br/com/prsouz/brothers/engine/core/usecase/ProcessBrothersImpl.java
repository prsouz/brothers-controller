package br.com.prsouz.brothers.engine.core.usecase;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.repository.BrotherRepositoryImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProcessBrothersImpl implements ProcessBrothers{

    @Autowired
    BrotherRepositoryImpl brotherRepositoryImpl;

    @Override
    public BrotherModel saveNewBrother(BrotherModel brotherModel) {
        try {
            return brotherRepositoryImpl.CreateNewBrother(brotherModel);
        }catch (Exception e){
            log.error("Error to create a new brother");
        }
        return brotherModel;
    }
}
