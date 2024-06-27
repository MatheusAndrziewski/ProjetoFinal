package com.example.maratona.controller;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Maratona;
import com.example.maratona.service.CircuitoService;
import com.example.maratona.service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maratona")
public class MaratonaController {
        @Autowired
        MaratonaService maratonaService;

        @GetMapping("buscar")
        public List<Maratona> buscarMaratona() {
            return maratonaService.buscarMaratona();
        }

        @PostMapping("cadastrar")
        public String cadastrarMaratona(@RequestBody Maratona maratona) {
            maratonaService.cadastrarMaratona(maratona);
            return "Maratona cadastrado com sucesso";

        }

        @PutMapping("atualizar")
        public String atualizarMaratona(@RequestBody Maratona maratona) {
            maratonaService.atualizarMaratona(maratona);
            return "Maratona atualizado com sucesso";
        }
        @DeleteMapping("deletar/{id}")
        public String apagarMaratona(@PathVariable Long id) {
            maratonaService.delete(id);
            return "Deletado com Sucesso";

        }
}
