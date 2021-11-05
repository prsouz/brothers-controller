package br.com.prsouz.brothers.engine.core.usecase;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;

public interface ProcessBrothers {

    BrotherModel saveNewBrother(BrotherModel brotherModel);
}
