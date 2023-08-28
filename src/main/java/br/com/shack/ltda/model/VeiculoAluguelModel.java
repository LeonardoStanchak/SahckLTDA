package br.com.shack.ltda.model;

import br.com.shack.ltda.dto.Veiculo.VeiculoAluguelDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculo_aluguel_model")
@NotNull
public class VeiculoAluguelModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @NotNull
    private String marca;
    @NotNull
    private String modelo;
    @NotNull
    private String km;
    @NotNull
    private String motor;
    @NotNull
    private String color;
    @NotNull
    private String placa;
    @NotNull
    private String cambio;
    @NotNull
    private boolean alugado;
    @NotNull
    private boolean seraAlugado;
}
