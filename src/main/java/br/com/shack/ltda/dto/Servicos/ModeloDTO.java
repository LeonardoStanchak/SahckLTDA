package br.com.shack.ltda.dto.Servicos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ModeloDTO {

    private String marca;

    private String versao;

    private String modelo;

    private String preco;

}
