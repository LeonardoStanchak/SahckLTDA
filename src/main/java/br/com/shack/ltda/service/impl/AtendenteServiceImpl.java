package br.com.shack.ltda.service.impl;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.mapper.AtendenteMapper;
import br.com.shack.ltda.model.AtendenteModel;
import br.com.shack.ltda.repository.AtendenteRepository;
import br.com.shack.ltda.service.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AtendenteServiceImpl implements AtendenteService{
    private AtendenteRepository atendenteRepository;
    private AtendenteMapper atendenteMapper;
    @Autowired
    public AtendenteServiceImpl(AtendenteRepository atendenteRepository, AtendenteMapper atendenteMapper){

        this.atendenteMapper = atendenteMapper;
        this.atendenteRepository = atendenteRepository;

    }

    @Override
    public AtendenteModel novoAtendente(AtendenteModel atendenteModel) {
            return atendenteRepository.save(atendenteModel);
    }

    @Override
    public AtendenteDTO buscaAtendestes(AtendenteDTO atendenteDTO) {

    return null;
    }

    @Override
    public GerenteDTO novoGerente(AtendenteDTO atendenteDTO, boolean venda) {
        return null;
    }

    @Override
    public GerenteDTO buscaGerente(AtendenteDTO atendenteDTO) {
        return null;
    }


    private AtendenteDTO newAttendant(AtendenteDTO atendenteDTO){

        AtendenteModel atendenteModel = atendenteMapper.toAttendant(atendenteDTO);
        atendenteModel.setNome(atendenteDTO.getNome());
        atendenteModel.setSobrenome(atendenteDTO.getSobrenome());
        atendenteModel.setMatricula(atendenteDTO.getMatricula());
        atendenteModel.setCargo(atendenteDTO.getCargo());
        atendenteModel = novoAtendente(atendenteModel);
        return atendenteMapper.toNewAttendant(atendenteModel);




    }

}
