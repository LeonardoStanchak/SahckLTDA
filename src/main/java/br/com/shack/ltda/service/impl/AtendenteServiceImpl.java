package br.com.shack.ltda.service.impl;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.mapper.AtendenteMapper;
import br.com.shack.ltda.mapper.GerenteMapper;
import br.com.shack.ltda.model.AtendenteModel;
import br.com.shack.ltda.model.GerenteModel;
import br.com.shack.ltda.repository.AtendenteRepository;
import br.com.shack.ltda.repository.GerenteRepository;
import br.com.shack.ltda.service.AtendenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AtendenteServiceImpl implements AtendenteService{
    private AtendenteRepository atendenteRepository;
    private AtendenteMapper atendenteMapper;

    private GerenteRepository gerente;

    private GerenteMapper gerenteMapper;
    @Autowired
    public AtendenteServiceImpl(AtendenteRepository atendenteRepository, AtendenteMapper atendenteMapper,GerenteMapper gerenteMapper, GerenteRepository gerente){

        this.atendenteMapper = atendenteMapper;
        this.atendenteRepository = atendenteRepository;
        this.gerente = gerente;
        this.gerenteMapper = gerenteMapper;

    }

    @Override
    public AtendenteModel novoAtendente(AtendenteModel atendenteModel) {
            return atendenteRepository.save(atendenteModel);
    }

    @Override
    public List<AtendenteDTO> buscaAtentendes() {
        List<AtendenteModel> atendenteDTOS = atendenteRepository.findAll();
        return atendenteDTOS.stream().map(x -> atendenteMapper.toAttendantDTO(x)).collect(Collectors.toList());
    }

    @Override
    public GerenteModel novoGerente(AtendenteDTO atendenteDTO, boolean promocao) {
        if (atendenteDTO.getCodigo() == 2) {
            var novo = atendenteMapper.toNewManager(atendenteDTO, true);
            return gerente.save(novo);
        } else {
            return atendenteMapper.toPromotedAttendant(atendenteDTO, promocao);
        }
    }

    @Override
    public GerenteDTO buscaGerente() {
        List<AtendenteModel> gerenteModels = atendenteRepository.findAll();
        return (GerenteDTO) gerenteModels.stream().map(gerenteModel -> gerenteMapper.toManagerDTO((AtendenteDTO) gerenteModels)).collect(Collectors.toList());
    }


    private AtendenteDTO newAttendant(AtendenteDTO atendenteDTO){

        AtendenteModel atendenteModel = atendenteMapper.toAttendantModel(atendenteDTO);
        atendenteModel.setNome(atendenteDTO.getNome());
        atendenteModel.setSobrenome(atendenteDTO.getSobrenome());
        atendenteModel.setMatricula(atendenteDTO.getMatricula());
        atendenteModel.setCargo(atendenteDTO.getCargo());
        atendenteModel.setCodigo(atendenteDTO.getCodigo());
        atendenteModel = novoAtendente(atendenteModel);
        return atendenteMapper.toNewAttendant(atendenteModel);

    }

}
