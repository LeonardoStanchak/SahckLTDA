package br.com.shack.ltda.mapper;

import br.com.shack.ltda.dto.Cliente.ClienteAlugelDTO;
import br.com.shack.ltda.dto.Cliente.ClienteDTO;
import br.com.shack.ltda.model.ClienteAluguelModel;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;

@Component
public class ClienteAluguelMapper {

    public ClienteAluguelModel toNewClient(ClienteDTO dto){
        return ClienteAluguelModel.builder()
                .nome(dto.getNome())
                .sobrenome(dto.getSobrenome())
                .cpf(dto.getCpf())
                .maiorDeIdade(dto.isMaiorDeIdade())
                .idade(dto.getIdade())
                .build();

    }

}
