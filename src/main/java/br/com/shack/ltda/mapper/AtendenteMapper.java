package br.com.shack.ltda.mapper;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import org.springframework.stereotype.Component;

@Component
public class AtendenteMapper {

    public AtendenteModel toAttendant(AtendenteDTO atendenteDTO) {

        return AtendenteModel.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .cargo(atendenteDTO.getCargo())
                .build();

    }

    public AtendenteDTO buscaFuncionario(AtendenteDTO atendenteDTO) {
        return AtendenteDTO.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .build();
    }

    public AtendenteDTO toNewAttendant(AtendenteModel atendenteModel) {

        return AtendenteDTO.builder()
                .nome(atendenteModel.getNome())
                .sobrenome(atendenteModel.getSobrenome())
                .matricula(atendenteModel.getMatricula())
                .build();


    }

}
