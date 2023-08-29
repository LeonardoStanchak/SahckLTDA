package br.com.shack.ltda.service;

import br.com.shack.ltda.dto.Cliente.ClienteDTO;
import br.com.shack.ltda.model.ClienteAluguelModel;
import br.com.shack.ltda.model.ClienteModel;

public interface ClienteService {

    ClienteModel novoCliente(ClienteModel model);

    ClienteAluguelModel novoClienteParaAlugar(ClienteDTO clienteDTO);
}
