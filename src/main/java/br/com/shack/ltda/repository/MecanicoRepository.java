package br.com.shack.ltda.repository;

import br.com.shack.ltda.model.MecanicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MecanicoRepository extends JpaRepository<MecanicoModel, Long> {
}
