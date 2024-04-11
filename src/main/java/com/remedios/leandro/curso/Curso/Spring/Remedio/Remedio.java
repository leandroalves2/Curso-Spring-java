package com.remedios.leandro.curso.Curso.Spring.Remedio;

import com.remedios.leandro.curso.Curso.Spring.DTO.DadosCadastroRemedioDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tb_remedios")
public class Remedio {

    public Remedio(DadosCadastroRemedioDTO dados)
    {
        this.nome=dados.getNome();
        this.via=dados.getVia();
        this.lote=dados.getLote();
        this.quantidade=dados.getQuantidade();
        this.validade=dados.getValidade();
        this.laboratorio=dados.getLaboratorio();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Via via;

    private String lote;
    private int quantidade;
    private String validade;

    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;

}
