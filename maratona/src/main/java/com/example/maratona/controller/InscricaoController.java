package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Inscricao;
import com.example.maratona.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inscricao")
public class InscricaoController {
    @Autowired
    InscricaoService inscricaoService;

    @PostMapping("cadastrar")
    public String cadastrarInscricao(@RequestBody Inscricao inscricao) {
        inscricaoService.criarInscricao(inscricao) ;
        return "Circuito cadastrado com sucesso";
    }
}
