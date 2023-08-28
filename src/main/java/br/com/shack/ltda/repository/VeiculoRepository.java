package br.com.shack.ltda.repository;

import br.com.shack.ltda.dto.Veiculo.VeiculoDTO;
import br.com.shack.ltda.model.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
}
