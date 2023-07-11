package br.com.shack.ltda.service;

import br.com.shack.ltda.model.LiderMecanicoModel;
import br.com.shack.ltda.model.MecanicoModel;

public interface MecanicoService {

    MecanicoModel novoMecanico(MecanicoModel mecanicoModel);

     LiderMecanicoModel novoLiderMecanico(LiderMecanicoModel liderMecanicoModel);
}
