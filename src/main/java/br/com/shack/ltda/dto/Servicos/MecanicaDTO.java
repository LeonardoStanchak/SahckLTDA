package br.com.shack.ltda.dto.Servicos;

import br.com.shack.ltda.dto.Veiculo.VeiculoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MecanicaDTO {

    private VeiculoDTO veiculoDTO;

    private String diagnostico;

    private String pecas;

    private boolean nossa;

    private String mao_de_obra;

}
