package br.com.shack.ltda.mapper;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.dto.Atendente.GerenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import br.com.shack.ltda.model.GerenteModel;
import org.springframework.stereotype.Component;

@Component
public class AtendenteMapper {

    public AtendenteDTO toAttendantDTO(AtendenteModel atendenteModel) {

        return AtendenteDTO.builder()
                .nome(atendenteModel.getNome())
                .sobrenome(atendenteModel.getSobrenome())
                .matricula(atendenteModel.getMatricula())
                .cargo(atendenteModel.getCargo())
                .codigo(atendenteModel.getCodigo())
                .cpf(atendenteModel.getCpf())
                .build();

    }

    public AtendenteModel toAttendantModel(AtendenteDTO atendenteDTO) {

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

    public GerenteModel toNewManager(AtendenteDTO atendenteDTO, boolean promocao){
        return GerenteModel.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .cargo(atendenteDTO.getCargo())
                .cpf(atendenteDTO.getCpf())
                .codigo(atendenteDTO.getCodigo())
                .promocao(promocao)
                .build();
    }

    public GerenteModel toPromotedAttendant(AtendenteDTO atendenteDTO, boolean promocao){
        return GerenteModel.builder()
                .nome(atendenteDTO.getNome())
                .sobrenome(atendenteDTO.getSobrenome())
                .matricula(atendenteDTO.getMatricula())
                .cargo(atendenteDTO.getCargo())
                .cpf(atendenteDTO.getCpf())
                .codigo(atendenteDTO.getCodigo())
                .promocao(promocao)
                .build();

    }


}
