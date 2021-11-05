package br.com.prsouz.brothers.engine.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrotherModel {

    private Long id;

    private String name;

    private Integer cim;

    private LocalDateTime birthDate;

    private String cpf;

}
