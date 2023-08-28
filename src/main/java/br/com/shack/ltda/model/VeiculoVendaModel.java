package br.com.shack.ltda.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculo_venda_model")
public class VeiculoVendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String marca;
    private String modelo;
    private String km;
    private String motor;
    private String color;
    private String valor;
    private boolean vendido;
    private String cambio;
    private String placa;
}
