package br.com.shack.ltda.mapper;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import br.com.shack.ltda.model.GerenteModel;
import org.springframework.stereotype.Component;

@Component
public class GerenteMapper {

    public GerenteModel toManagerDTO(AtendenteDTO atendenteDTO){
        var gerenteList = GerenteModel.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .cargo(atendenteDTO.getCargo())
                .cpf(atendenteDTO.getCpf())
                .codigo(atendenteDTO.getCodigo())
                .promocao(true)
                .build();
        return gerenteList;
    }


    public AtendenteModel toManager(AtendenteDTO atendenteDTO){
        return AtendenteModel.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .cargo(atendenteDTO.getCargo())
                .cpf(atendenteDTO.getCpf())
                .codigo(atendenteDTO.getCodigo())
                .build();

    }
}
