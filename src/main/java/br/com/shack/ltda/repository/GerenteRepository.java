package br.com.shack.ltda.repository;

import br.com.shack.ltda.model.GerenteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenteRepository extends JpaRepository<GerenteModel, Long> {
}
