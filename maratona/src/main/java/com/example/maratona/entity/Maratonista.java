package com.example.maratona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Maratonista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    private int idade;

    private String grupoSanguineo;

    private String nome;

    private int numeroCelular;

    private int numeroEmergencia;

    private int rg;

    private String sobrenome;
}
