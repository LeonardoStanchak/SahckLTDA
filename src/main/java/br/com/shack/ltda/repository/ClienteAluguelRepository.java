package br.com.shack.ltda.repository;

import br.com.shack.ltda.model.ClienteAluguelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteAluguelRepository extends JpaRepository<ClienteAluguelModel, Long> {
}
