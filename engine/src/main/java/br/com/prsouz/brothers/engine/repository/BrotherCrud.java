package br.com.prsouz.brothers.engine.repository;

import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrotherCrud extends CrudRepository<BrothersEntity, Long> {
}
