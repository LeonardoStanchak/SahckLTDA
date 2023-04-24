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
public class AtendenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String sobrenome;
    @Column(unique = true)
    private String cpf;
    private String cargo;
    @Column(unique = true)
    private int matricula;
    private Long codigo;
}

