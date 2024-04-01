package com.remedios.leandro.curso.Curso.Spring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Teste1 {

    @GetMapping
    public String teste1()
    {
        return "Teste 1";
    }
}