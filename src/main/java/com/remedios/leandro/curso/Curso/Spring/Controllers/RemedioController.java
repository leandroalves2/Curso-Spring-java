package com.remedios.leandro.curso.Curso.Spring.Controllers;

import com.remedios.leandro.curso.Curso.Spring.DTO.DadosCadastroRemedioDTO;
import com.remedios.leandro.curso.Curso.Spring.Remedio.Remedio;
import com.remedios.leandro.curso.Curso.Spring.Remedio.RemedioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroRemedioDTO dados)
    {
        repository.save(new Remedio(dados));
    }
}