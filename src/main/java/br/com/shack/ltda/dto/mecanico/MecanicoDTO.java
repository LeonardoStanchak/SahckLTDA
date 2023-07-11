package br.com.shack.ltda.dto.mecanico;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MecanicoDTO {
    private AtendenteDTO dto;
    private String especialidade;

}
