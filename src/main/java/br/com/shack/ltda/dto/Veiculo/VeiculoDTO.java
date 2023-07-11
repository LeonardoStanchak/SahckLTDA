package br.com.shack.ltda.dto.Veiculo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VeiculoDTO {

    private String marca;
    private String modelo;
    private String km;
    private String motor;
    private String color;


}
