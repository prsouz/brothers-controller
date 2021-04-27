package br.com.prsouz.brothers.engine.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity(name = "ENDERECO")
public class Endereco {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
