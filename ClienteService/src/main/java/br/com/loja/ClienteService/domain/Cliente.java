package br.com.loja.ClienteService.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name="Cliente", description="Cliente")
public class Cliente {

    @Id
    @Schema(description="Identificador único")
    private String id;

    @NotNull
    @Size(min = 1, max = 50)
    @Schema(description="Nome", minLength = 1, maxLength=50, nullable = false)
    private String nome;

    @NotNull
    @Indexed(unique = true, background = true)
    @Schema(description="CPF", nullable = false)
    private Long cpf;


}