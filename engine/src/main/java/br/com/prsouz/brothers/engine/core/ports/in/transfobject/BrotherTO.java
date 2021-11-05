package br.com.prsouz.brothers.engine.core.ports.in.transfobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrotherTO {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "cim")
    private Integer cim;

    @JsonProperty(value = "birthdate")
    private LocalDateTime birthDate;

    @JsonProperty(value = "cpf")
    private String cpf;
}
