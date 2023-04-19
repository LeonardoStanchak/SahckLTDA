package br.com.shack.ltda.service;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.model.AtendenteModel;

import java.util.List;

public interface AtendenteService {

    AtendenteModel novoAtendente(AtendenteModel atendenteModel);

    List<AtendenteModel> buscaAtendestes(AtendenteDTO atendenteDTO);

    GerenteDTO novoGerente(AtendenteDTO atendenteDTO, boolean promocao);

    GerenteDTO buscaGerente(AtendenteDTO atendenteDTO);
}
