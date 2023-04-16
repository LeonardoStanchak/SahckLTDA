package br.com.shack.ltda.dto.Cliente;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FinanciamentoDTO {
    private ClienteDTO clienteDTO;

    private String banco;

    private String renda;

    private boolean inss;

    private String parcelas;
}
