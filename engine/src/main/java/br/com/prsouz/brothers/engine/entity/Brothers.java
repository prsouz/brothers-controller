package br.com.prsouz.brothers.engine.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Accessors
@Component
@ToString
@Entity(name = "BROTHERS")
public class Brothers {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Integer cim;

    @Getter @Setter
    private LocalDate birthDate;

    @Getter @Setter
    private String cpf;

    @OneToOne
    @Getter @Setter
    private Endereco end;

}
