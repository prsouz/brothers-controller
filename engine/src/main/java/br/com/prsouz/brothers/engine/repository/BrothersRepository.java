package br.com.prsouz.brothers.engine.repository;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;

public interface BrothersRepository {

    BrotherModel CreateNewBrother(BrotherModel brotherModel);
    Iterable<BrothersEntity> GetAllBrothers();

}
