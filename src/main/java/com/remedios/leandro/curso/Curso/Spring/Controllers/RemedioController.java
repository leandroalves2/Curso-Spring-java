package com.remedios.leandro.curso.Curso.Spring.Controllers;

import com.remedios.leandro.curso.Curso.Spring.DTO.DadosCadastroRemedioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedioDTO dados)
    {
        System.out.println(dados);
    }
}
