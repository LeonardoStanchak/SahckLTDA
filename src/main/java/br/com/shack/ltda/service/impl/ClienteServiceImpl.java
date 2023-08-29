package br.com.shack.ltda.service.impl;

import br.com.shack.ltda.dto.Cliente.ClienteAlugelDTO;
import br.com.shack.ltda.dto.Cliente.ClienteDTO;
import br.com.shack.ltda.mapper.ClienteAluguelMapper;
import br.com.shack.ltda.model.ClienteAluguelModel;
import br.com.shack.ltda.model.ClienteModel;
import br.com.shack.ltda.repository.ClienteAluguelRepository;
import br.com.shack.ltda.repository.ClienteRepository;
import br.com.shack.ltda.service.ClienteService;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteAluguelMapper mapper;

    @Autowired
    private ClienteAluguelRepository repository;
    public ClienteServiceImpl(ClienteRepository clienteRepository, ClienteAluguelMapper mapper, ClienteAluguelRepository repository){
        this.clienteRepository = clienteRepository;
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public ClienteModel novoCliente(ClienteModel model) {
        return clienteRepository.save(model);
    }

    @Override
    public ClienteAluguelModel novoClienteParaAlugar(ClienteDTO clienteDTO) {
        if (clienteDTO.getIdade() >= 18 || clienteDTO.isMaiorDeIdade()){
            var novoAluguel = mapper.toNewClient(clienteDTO);
            return repository.save(novoAluguel);
        }else{
            return new ClienteAluguelModel();
        }
    }
}
