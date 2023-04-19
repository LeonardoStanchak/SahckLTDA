package br.com.shack.ltda.dto.Atendente;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GerenteDTO {
    private AtendenteDTO dto;

    private boolean promocao;

}
