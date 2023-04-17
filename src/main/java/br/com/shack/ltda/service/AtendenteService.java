package br.com.shack.ltda.service;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.model.AtendenteModel;

public interface AtendenteService {

    AtendenteModel novoAtendente(AtendenteModel atendenteModel);

    AtendenteDTO buscaAtendestes(AtendenteDTO atendenteDTO);

    GerenteDTO novoGerente(AtendenteDTO atendenteDTO, boolean venda);

    GerenteDTO buscaGerente(AtendenteDTO atendenteDTO);
}
