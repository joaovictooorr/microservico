package br.com.loja.ProdutoService.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Document(collection = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    public enum Status {
        ATIVO, INATIVO;
    }

    @Id
    private String id;

    @NotNull
    @Size(min = 2, max = 10)
    @Indexed(unique = true, background = true)
    private String codigo;

    @NotNull
    @Size(min = 1, max = 50)
    private String nome;

    private BigDecimal valor;

    private Status status;

}