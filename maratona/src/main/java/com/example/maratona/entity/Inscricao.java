package com.example.maratona.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double valorInscricao;

    @ManyToOne
    private Maratonista maratonista;

    @ManyToOne
    private Circuito circuito;

}
