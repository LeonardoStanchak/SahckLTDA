package br.com.shack.ltda.dto.Cliente;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteAlugelDTO {
    private ClienteDTO clienteDTO;
    private boolean maiorDeIdade;
}
