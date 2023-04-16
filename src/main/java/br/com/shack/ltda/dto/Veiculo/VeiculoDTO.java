package br.com.shack.ltda.dto.Veiculo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VeiculoDTO {

    private String marca;
    private String modelo;
    private String km;
    private String motor;

    private String valor;

    private boolean vendido;

}
