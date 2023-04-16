package br.com.shack.ltda.dto.Servicos;

import br.com.shack.ltda.dto.Veiculo.VeiculoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class AluguelDTO {

    private VeiculoDTO veiculoDTO;

    private String Diaria;

    private Date date;

    private String cupom;

}
