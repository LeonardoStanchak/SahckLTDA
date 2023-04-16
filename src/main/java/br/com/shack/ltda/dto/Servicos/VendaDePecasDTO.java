package br.com.shack.ltda.dto.Servicos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Builder
public class VendaDePecasDTO {

    private String nome_da_peca;

    private ArrayList <ModeloDTO> modelos;

    private boolean nossa_peca;
}
