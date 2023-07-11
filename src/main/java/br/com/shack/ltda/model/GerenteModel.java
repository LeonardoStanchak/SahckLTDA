package br.com.shack.ltda.model;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
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
@Table(name = "gerente_model")
public class GerenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String sobrenome;
    private int matricula;
    private String cargo;

    private String cpf;

    private Long codigo;

    private boolean promocao;
}
