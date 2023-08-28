package br.com.shack.ltda.dto.Veiculo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.StreamingHttpOutputMessage;

@Getter
@Setter
public class VeiculoAluguelDTO {
    private VeiculoDTO veiculoDTO;

    private String placa;

    private boolean alugado;

    private boolean seraAlugado;


}
