package br.com.shack.ltda.controller;

import br.com.shack.ltda.model.VeiculoAluguelModel;
import br.com.shack.ltda.model.VeiculoModel;
import br.com.shack.ltda.model.VeiculoVendaModel;
import br.com.shack.ltda.service.VeiculoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Shack/veiculo", produces = {MediaType.APPLICATION_JSON_VALUE})
@Log4j2
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService){
        this.veiculoService = veiculoService;
    }

    @PostMapping(value = "/novo")
    public ResponseEntity<VeiculoModel> veiculoModelResponseEntity(@RequestBody VeiculoModel veiculoModel){
        var veiculo = veiculoService.novoVeiculo(veiculoModel);
        return ResponseEntity.ok().body(veiculo);
    }

    @PostMapping(value = "/novo/aluguel")
    public ResponseEntity<VeiculoAluguelModel> veiculoModelResponseEntity(@RequestBody VeiculoAluguelModel veiculoAluguelModel) {
        var veiculo = veiculoService.novoVeiculoAluguel(veiculoAluguelModel);
        return ResponseEntity.ok().body(veiculo);
    }

    @PostMapping(value = "/novo/veiculo")
    public ResponseEntity<VeiculoVendaModel> veiculoVendaModelResponseEntity(@RequestBody VeiculoVendaModel veiculoVendaModel){
        var novoCarro = veiculoService.novoVeiculoVenda(veiculoVendaModel);
        return ResponseEntity.ok().body(novoCarro);
    }

    @GetMapping(value = "todos/veiculos")
    public ResponseEntity<List<VeiculoModel>> responseEntity(){
        List<VeiculoModel> list = veiculoService.buscaTodosOsCarros();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "todos/veiculos/venda")
    public ResponseEntity<List<VeiculoVendaModel>> listResponseEntity(){
        List<VeiculoVendaModel> list = veiculoService.buscaTodosOsCarrosVenda();
        return ResponseEntity.ok().body(list);
    }
}
