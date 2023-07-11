package br.com.shack.ltda.service.impl;

import br.com.shack.ltda.dto.mecanico.LiderMecanicoDTO;
import br.com.shack.ltda.model.LiderMecanicoModel;
import br.com.shack.ltda.model.MecanicoModel;
import br.com.shack.ltda.repository.LiderMecanicoRepository;
import br.com.shack.ltda.repository.MecanicoRepository;
import br.com.shack.ltda.service.MecanicoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MecanicoSeriveImpl implements MecanicoService {

    private final MecanicoRepository mecanicoRepository;
    private final LiderMecanicoRepository liderMecanicoRepository;

    public MecanicoSeriveImpl(MecanicoRepository mecanicoRepository, LiderMecanicoRepository liderMecanicoRepository) {
        this.mecanicoRepository = mecanicoRepository;
        this.liderMecanicoRepository = liderMecanicoRepository;
    }

    @Override
    public MecanicoModel novoMecanico(MecanicoModel mecanicoModel) {
        return mecanicoRepository.save(mecanicoModel);
    }

    public LiderMecanicoModel novoLiderMecanico(LiderMecanicoModel liderMecanicoModel) {
        return liderMecanicoRepository.save(liderMecanicoModel);
    }
}
