package br.com.shack.ltda.controller;

import br.com.shack.ltda.model.LiderMecanicoModel;
import br.com.shack.ltda.model.MecanicoModel;
import br.com.shack.ltda.service.MecanicoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/Shack/mecanico", produces = {MediaType.APPLICATION_JSON_VALUE})
@Log4j2
public class MecanicoController {

    @Autowired
    private MecanicoService mecanicoService;

    @PostMapping(value = "/novo")
    public ResponseEntity<MecanicoModel>mecanicoModelResponseEntity(@RequestBody MecanicoModel mecanicoModel){
        mecanicoModel = mecanicoService.novoMecanico(mecanicoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(mecanicoModel);
    }

    @PostMapping(value = "/novo/lider")
    public ResponseEntity<LiderMecanicoModel>liderMecanicoModelResponseEntity(@RequestBody LiderMecanicoModel liderMecanicoModel) {
        if (liderMecanicoModel.getCodigo() == 30) {
            if (liderMecanicoModel.isLider()) {
                liderMecanicoModel = mecanicoService.novoLiderMecanico(liderMecanicoModel);
                return ResponseEntity.status(HttpStatus.CREATED).body(liderMecanicoModel);
            }
        } else {
           return null;
        }
        return null;
    }
}
