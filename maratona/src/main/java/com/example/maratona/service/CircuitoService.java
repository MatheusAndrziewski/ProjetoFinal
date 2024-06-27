package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    @Autowired
    CircuitoRepository circuitoRepository;

    public List<Circuito> buscarCircuito() {
        return circuitoRepository.findAll();
    }
    public Circuito cadastrarCircuito(Circuito circuito){
            return circuitoRepository.save(circuito);
    }
    public Circuito atualizarCircuito(Circuito circuito){
        return circuitoRepository.save(circuito);
    }
    public void delete(Long id){
        circuitoRepository.deleteById(id);
    }
}
