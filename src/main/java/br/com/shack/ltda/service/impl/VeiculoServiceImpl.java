package br.com.shack.ltda.service.impl;

import br.com.shack.ltda.model.VeiculoAluguelModel;
import br.com.shack.ltda.model.VeiculoModel;
import br.com.shack.ltda.model.VeiculoVendaModel;
import br.com.shack.ltda.repository.VeiculoAluguelRepository;
import br.com.shack.ltda.repository.VeiculoRepository;
import br.com.shack.ltda.repository.VeiculoVendaRepository;
import br.com.shack.ltda.service.VeiculoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class VeiculoServiceImpl implements VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final VeiculoAluguelRepository veiculoAluguelRepository;
    private final VeiculoVendaRepository veiculoVendaRepository;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository, VeiculoAluguelRepository veiculoAluguelRepository,VeiculoVendaRepository veiculoVendaRepository) {
        this.veiculoRepository = veiculoRepository;
        this.veiculoAluguelRepository = veiculoAluguelRepository;
        this.veiculoVendaRepository = veiculoVendaRepository;
    }

    @Override
    public VeiculoModel novoVeiculo(VeiculoModel model) {
        return veiculoRepository.save(model);
    }

    @Override
    public VeiculoAluguelModel novoVeiculoAluguel(VeiculoAluguelModel veiculoAluguelModel) {
        if (veiculoAluguelModel.isSeraAlugado()){
            VeiculoAluguelModel save = veiculoAluguelRepository.save(veiculoAluguelModel);
            log.debug(save.toString());
            return save;
        }
        return null;
    }

    @Override
    public VeiculoVendaModel novoVeiculoVenda(VeiculoVendaModel veiculoVendaModel) {
        if (veiculoVendaModel.isVendido()){
            var id = veiculoVendaModel.getId();
              veiculoVendaRepository.deleteById(id);
              return veiculoVendaModel;
        }
        return veiculoVendaRepository.save(veiculoVendaModel);
    }

    @Override
    public List<VeiculoModel> buscaTodosOsCarros() {
        return veiculoRepository.findAll();
    }

    @Override
    public List<VeiculoVendaModel> buscaTodosOsCarrosVenda() {
        return veiculoVendaRepository.findAll();
    }
}
