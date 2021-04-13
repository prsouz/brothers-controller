package br.com.prsouz.brothers.engine.repository;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
@Builder
public class Brothers {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Integer cim;


}
