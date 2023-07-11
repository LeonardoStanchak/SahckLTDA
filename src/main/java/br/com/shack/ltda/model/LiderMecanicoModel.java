package br.com.shack.ltda.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "liderMecanico_model")
public class LiderMecanicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nome;
    private String sobrenome;
    @Column(unique = true)

    private int matricula;
    private String cargo;
    @Column(unique = true)
    private String cpf;
    private Long codigo;
    @NotNull
    private String especialidade;
    @NotNull
    private boolean lider;
}
