package com.example.maratona.Service;

import com.example.maratona.Repository.MaratonaRepository;
import com.example.maratona.Repository.MaratonistaRepository;
import com.example.maratona.entity.Maratona;
import com.example.maratona.entity.Maratonista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {
    @Autowired
    MaratonistaRepository maratonistaRepository;

    public Maratonista cadastrarMaranistonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }
        public void deletarMaratonista(Long id) {
            maratonistaRepository.deleteById(id);
        }

        public Maratonista atualizarMaratonista(Maratonista maratonista) {
            return maratonistaRepository.save(maratonista);

        }
    public Maratonista buscarMaratonista(Long id) {
        return maratonistaRepository.findById(id).get();
    }




    }


