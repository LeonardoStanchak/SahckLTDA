package br.com.shack.ltda.dto.Cliente;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClienteDTO {

    private String nome;
    private String sobrenome;
    private String cpf;
}
