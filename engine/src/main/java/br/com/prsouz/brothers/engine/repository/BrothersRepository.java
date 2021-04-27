package br.com.prsouz.brothers.engine.repository;

import br.com.prsouz.brothers.engine.entity.Brothers;
import org.springframework.data.repository.CrudRepository;

public interface BrothersRepository extends CrudRepository<Brothers, Long> {

}
