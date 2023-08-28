package br.com.shack.ltda.repository;

import br.com.shack.ltda.model.VeiculoAluguelModel;
import br.com.shack.ltda.model.VeiculoVendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoAluguelRepository extends JpaRepository<VeiculoAluguelModel, Long> {
}
