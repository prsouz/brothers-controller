package br.com.prsouz.brothers.engine.utility;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.core.ports.in.transfobject.BrotherTO;
import br.com.prsouz.brothers.engine.core.ports.out.transfobject.BrotherResponse;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

public interface BrotherConverter {

    BrotherModel convertBrotherTOToModel(BrotherTO brotherTO);
    BrotherTO convertBrotherModelToTO(BrotherModel brotherModel);
    BrotherModel convertBrotherEntityToModel(BrothersEntity brothersEntity);
    BrothersEntity convertBrotherModelToEntity(BrotherModel brotherModel);
    BrotherModel convertBrotherResponseToModel(BrotherResponse brotherResponse);
    BrotherResponse convertBrotherModelToResponse(BrotherModel brotherModel);

}
