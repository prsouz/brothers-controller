package br.com.prsouz.brothers.engine.repository;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Endereco {

    @Getter @Setter
    private String logradouro;

    @Getter @Setter
    private String cep;

    @Getter @Setter
    private Integer numero;

    @Getter @Setter
    private String municipio;

    @Getter @Setter
    private String bairro;

    @Getter @Setter
    private String estado;

    @Getter @Setter
    private String pais;
}
