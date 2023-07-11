package br.com.shack.ltda.dto.mecanico;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LiderMecanicoDTO {

    private MecanicoDTO mecanicoDTO;

    private boolean lider;
}
