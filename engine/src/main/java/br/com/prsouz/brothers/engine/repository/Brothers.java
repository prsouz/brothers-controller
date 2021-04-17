package br.com.prsouz.brothers.engine.repository;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Accessors
@Component
@ToString
public class Brothers extends People{

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private Integer cim;


}
