package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Maratona;
import com.example.maratona.repository.CircuitoRepository;
import com.example.maratona.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonaService {
    @Autowired
    MaratonaRepository maratonaRepository;

    public List<Maratona> buscarMaratona() {
        return maratonaRepository.findAll();
    }

    public Maratona cadastrarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }

    public Maratona atualizarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }

    public void delete(Long id) {
        maratonaRepository.deleteById(id);
    }
}
