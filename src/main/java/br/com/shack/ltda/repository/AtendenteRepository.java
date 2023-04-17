package br.com.shack.ltda.repository;

import br.com.shack.ltda.model.AtendenteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendenteRepository extends JpaRepository<AtendenteModel, Long> {
}
