package br.com.shack.ltda.dto.Veiculo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VeiculoVendaDTO {
    private VeiculoDTO veiculoDTO;

    private String valor;

    private boolean vendido;

    private String placa;

}
