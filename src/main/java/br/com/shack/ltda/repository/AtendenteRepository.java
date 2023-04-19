package br.com.shack.ltda.repository;

import br.com.shack.ltda.dto.Atendente.AtendenteDTO;
import br.com.shack.ltda.model.AtendenteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface AtendenteRepository extends JpaRepository<AtendenteModel, Long> {
}
