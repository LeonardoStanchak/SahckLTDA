package br.com.shack.ltda.dto.Servicos;

import br.com.shack.ltda.dto.Veiculo.VeiculoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class LavagemDto {

    private VeiculoDTO veiculoDTO;

    private String valor;

    private String dia;

    private Date date;
}
