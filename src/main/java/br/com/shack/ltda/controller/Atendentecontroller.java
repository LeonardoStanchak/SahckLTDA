package br.com.shack.ltda.controller;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import br.com.shack.ltda.model.GerenteModel;
import br.com.shack.ltda.service.AtendenteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Shack/Atendente", produces = {MediaType.APPLICATION_JSON_VALUE})
@Log4j2
public class Atendentecontroller {

    @Autowired
    private AtendenteService atendenteService;

    @GetMapping(value = "/funcionarios")
    public ResponseEntity<List<AtendenteDTO>> buscaAtentendes() {

        List<AtendenteDTO> atendenteDTOS = atendenteService.buscaAtentendes();

        return ResponseEntity.ok().body(atendenteDTOS);
    }

    @PostMapping(value = "/novo")
    public ResponseEntity<AtendenteModel> novoFuncionario(@RequestBody AtendenteModel atendenteModel) {
        atendenteModel = atendenteService.novoAtendente(atendenteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(atendenteModel);

    }

    @PostMapping(value = "/novo/gerente")
    public ResponseEntity<GerenteModel> novoGerente(@RequestBody AtendenteDTO atendenteDTO, boolean promocao) {
        GerenteModel gerenteDTO = atendenteService.novoGerente(atendenteDTO, promocao);
        return ResponseEntity.status(HttpStatus.CREATED).body(gerenteDTO);
    }

}
