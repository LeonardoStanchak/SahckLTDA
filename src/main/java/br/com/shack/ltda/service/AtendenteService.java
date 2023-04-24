package br.com.shack.ltda.service;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AtendenteService {

    AtendenteModel novoAtendente(AtendenteModel atendenteModel);

    List<AtendenteDTO> buscaAtentendes();

    GerenteDTO novoGerente(AtendenteDTO atendenteDTO, boolean promocao);

    GerenteDTO buscaGerente();
}
