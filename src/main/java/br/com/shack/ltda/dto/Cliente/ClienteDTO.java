package br.com.shack.ltda.dto.Cliente;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    private boolean maiorDeIdade;
}
