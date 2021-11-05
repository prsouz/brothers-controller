package br.com.prsouz.brothers.engine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Accessors
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "brothers")
public class BrothersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer cim;

    private LocalDateTime birthDate;

    private String cpf;



}
