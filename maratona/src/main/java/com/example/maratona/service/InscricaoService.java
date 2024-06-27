package com.example.maratona.service;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Inscricao;
import com.example.maratona.entity.Maratonista;
import com.example.maratona.repository.CircuitoRepository;
import com.example.maratona.repository.InscricaoRepository;
import com.example.maratona.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscricaoService {

    @Autowired
    CircuitoRepository circuitoRepository;
    MaratonaRepository maratonaRepository;
    InscricaoRepository inscricaoRepository;

    public Inscricao criarInscricao(Inscricao inscricao) throws Exception {
        Double valorInscricao = calcularValorInscricao(inscricao);
        if (valorInscricao == inscricao.getValorInscricao()) {
            inscricao.setValorInscricao(valorInscricao);
            return inscricaoRepository.save(inscricao);
        } else {
            throw new Exception("Valor da inscrição incorreto");
        }

    }

    private double calcularValorInscricao(Inscricao inscricao) throws Exception {
        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();
        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();
        if (maratonista.getIdade() < 18) {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1300;
                case MEDIO:
                    return 2000.0;
                default:
                    throw new Exception("Não é permitido fazer inscrição para menores nesta categoria");
            }
        } else {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1500;
                case MEDIO:
                    return 2300.0;
                default:
                    return 2800.0;

            }
        }
    }
}