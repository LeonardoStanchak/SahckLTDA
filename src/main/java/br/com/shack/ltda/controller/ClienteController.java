package br.com.shack.ltda.controller;

import br.com.shack.ltda.dto.Cliente.ClienteAlugelDTO;
import br.com.shack.ltda.dto.Cliente.ClienteDTO;
import br.com.shack.ltda.model.ClienteAluguelModel;
import br.com.shack.ltda.service.AtendenteService;
import br.com.shack.ltda.service.ClienteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/Shack/cliente", produces = {MediaType.APPLICATION_JSON_VALUE})
@Log4j2
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/alugel")
    public ResponseEntity<ClienteAluguelModel> responseEntity(@RequestBody ClienteDTO clienteDTO){
        var clienteAluguel = clienteService.novoClienteParaAlugar(clienteDTO);
        return ResponseEntity.ok().body(clienteAluguel);
    }
}
