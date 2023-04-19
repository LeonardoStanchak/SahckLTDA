package br.com.shack.ltda.dto.Atendente;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AtendenteDTO {

    private Integer id;

    private String nome;
    private String sobrenome;
    private int matricula;
    private String cargo ;
}
