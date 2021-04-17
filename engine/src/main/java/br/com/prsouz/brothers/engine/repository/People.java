package br.com.prsouz.brothers.engine.repository;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Accessors
@NoArgsConstructor
@Getter @Setter
public class People {

    private String name;

    private LocalDate birthDate;

    private String cpf;

    private Endereco end;

 /*   public People (String name){
        this.name = name;
    }
*/

}
