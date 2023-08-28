package br.com.shack.ltda.service;

import br.com.shack.ltda.model.VeiculoAluguelModel;
import br.com.shack.ltda.model.VeiculoModel;
import br.com.shack.ltda.model.VeiculoVendaModel;

import java.util.List;

public interface VeiculoService {

    VeiculoModel novoVeiculo(VeiculoModel model);

    VeiculoAluguelModel novoVeiculoAluguel(VeiculoAluguelModel veiculoAluguelModel);

    VeiculoVendaModel novoVeiculoVenda(VeiculoVendaModel veiculoVendaModel);

    List<VeiculoModel> buscaTodosOsCarros();

    List<VeiculoVendaModel> buscaTodosOsCarrosVenda();
}
