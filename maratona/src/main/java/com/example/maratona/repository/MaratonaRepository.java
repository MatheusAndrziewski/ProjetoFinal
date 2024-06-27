package com.example.maratona.repository;

import com.example.maratona.entity.Circuito;
import com.example.maratona.entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonaRepository extends JpaRepository<Maratona, Long> {
}
