package br.com.prsouz.brothers.engine.core.ports.out.transfobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrotherResponse {

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "cim")
    private Integer cim;

    @JsonProperty(value = "birthdate")
    private LocalDateTime birthDate;

    @JsonProperty(value = "cpf")
    private String cpf;
}
