package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("circuito")

public class CircuitoController {
    @Autowired
    CircuitoService circuitoService;

    @GetMapping("buscar")
    public List<Circuito> buscarCircuito() {
        return circuitoService.buscarCircuito();
    }

    @PostMapping("cadastrar")
    public String cadastrarCircuito(@RequestBody Circuito circuito) {
        circuitoService.cadastrarCircuito(circuito);
        return "Circuito cadastrado com sucesso";

    }

    @PutMapping("atualizar")
    public String atualizarCircuito(@RequestBody Circuito circuito) {
        circuitoService.atualizarCircuito(circuito);
        return "Circuito atualizado com sucesso";
    }
    @DeleteMapping("deletar/{id}")
    public String apagarCircuito(@PathVariable Long id) {
        circuitoService.delete(id);
        return "Deletado com Sucesso";

    }
    }
