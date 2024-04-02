package com.remedios.leandro.curso.Curso.Spring.DTO;

import com.remedios.leandro.curso.Curso.Spring.Remedio.Laboratorio;
import com.remedios.leandro.curso.Curso.Spring.Remedio.Via;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DadosCadastroRemedioDTO {

    private String nome;
    private Via via;
    private String lote;
    private int quantidade;
    private String validade;
    private Laboratorio laboratorio;

    @Override
    public String toString() {
        return "name: " + nome + "\nvia: " + via + "\nlote: " + lote + "\nquantidade: " + quantidade +
                "\nvalidade: " + validade + "\nlaboratorio: " + laboratorio;
    }

}
