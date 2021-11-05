package br.com.prsouz.brothers.engine.utility;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.core.ports.in.transfobject.BrotherTO;
import br.com.prsouz.brothers.engine.core.ports.out.transfobject.BrotherResponse;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class BrotherConverterImpl implements BrotherConverter{
    @Override
    public BrotherModel convertBrotherTOToModel(BrotherTO brotherTO) {

        BrotherModel brother = new BrotherModel();
        brother.setName(brotherTO.getName());
        brother.setCim(brotherTO.getCim());
        brother.setCpf(brotherTO.getCpf());
        brother.setBirthDate(brotherTO.getBirthDate());
        return brother;
    }

    @Override
    public BrotherTO convertBrotherModelToTO(BrotherModel brotherModel) {
        return null;
    }

    @Override

    public BrotherModel convertBrotherEntityToModel(BrothersEntity brothersEntity) {

        BrotherModel brotherModel = new BrotherModel();
        brotherModel.setId(brothersEntity.getId());
        brotherModel.setName(brothersEntity.getName());
        brotherModel.setCpf(brothersEntity.getCpf());
        brotherModel.setCim(brothersEntity.getCim());
        brotherModel.setBirthDate(brothersEntity.getBirthDate());

        return brotherModel;
    }

    @Override
    public BrothersEntity convertBrotherModelToEntity(BrotherModel brotherModel) {
        BrothersEntity brothersEntity = new BrothersEntity();
        brothersEntity.setName(brotherModel.getName());
        brothersEntity.setCim(brotherModel.getCim());
        brothersEntity.setCpf(brotherModel.getCpf());
        brothersEntity.setBirthDate(brotherModel.getBirthDate());
        return brothersEntity;
    }

    @Override
    public BrotherModel convertBrotherResponseToModel(BrotherResponse brotherResponse) {
        return null;
    }

    @Override
    public BrotherResponse convertBrotherModelToResponse(BrotherModel brotherModel) {
        return null;
    }
}
