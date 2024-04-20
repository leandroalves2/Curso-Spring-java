package com.remedios.leandro.curso.Curso.Spring.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.remedios.leandro.curso.Curso.Spring.Remedio.Laboratorio;
import com.remedios.leandro.curso.Curso.Spring.Remedio.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DadosCadastroRemedioDTO {

    @NotBlank
    private String nome;
    @Enumerated
    private Via via;
    @NotBlank
    private String lote;
    private int quantidade;
    @Future
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate validade;
    @Enumerated
    private Laboratorio laboratorio;

}
