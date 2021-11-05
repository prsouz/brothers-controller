package br.com.prsouz.brothers.engine.repository;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import br.com.prsouz.brothers.engine.utility.BrotherConverter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class BrotherRepositoryImpl implements BrothersRepository{

    @Autowired
    BrotherConverter brotherConverter;

    @Autowired
    BrotherCrud brotherCrud;

    @Override
    public BrotherModel CreateNewBrother(BrotherModel brotherModel) {

        BrothersEntity brothersEntity = brotherConverter.convertBrotherModelToEntity(brotherModel);
        brothersEntity.setCim(288);
        brotherCrud.save(brothersEntity);

        return brotherConverter.convertBrotherEntityToModel(brothersEntity);
    }

    @Override
    public Iterable<BrothersEntity> GetAllBrothers() {
        return brotherCrud.findAll();

    }


}
