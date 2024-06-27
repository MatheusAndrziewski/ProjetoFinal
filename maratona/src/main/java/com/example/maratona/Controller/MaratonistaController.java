package com.example.maratona.Controller;

import com.example.maratona.Service.MaratonistaService;
import com.example.maratona.entity.Maratonista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maratonista")
public class MaratonistaController {
    @Autowired
    MaratonistaService maratonistaService;

    @PostMapping("cadastrar")
    public Maratonista cadrastarMaratonista(@RequestBody Maratonista maratonista) {
        return maratonistaService.cadastrarMaranistonista(maratonista);
    }

    @PutMapping("atualizar")
    public String atualiazarMaratonista(@RequestBody Maratonista maratonista) {
        maratonistaService.atualizarMaratonista(maratonista);
        return "Time atualizado com sucesso";

    }

    @DeleteMapping("deletar/{id}")
    public String deletarMaratonista(@PathVariable Long id) {
        maratonistaService.deletarMaratonista(id);
        return "Maratonista deletado com sucesso";
    }

    @GetMapping("buscar/{id}")
    public Maratonista buscarMaratonista(@PathVariable Long id) {
        return  maratonistaService.buscarMaratonista(id);

    }
    }
