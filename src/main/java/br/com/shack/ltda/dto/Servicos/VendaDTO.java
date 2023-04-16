package br.com.shack.ltda.dto.Servicos;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Veiculo.VeiculoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VendaDTO {

    private VeiculoDTO veiculoDTO;

    private AtendenteDTO atendenteDTO;

    private boolean financiamento;
}
