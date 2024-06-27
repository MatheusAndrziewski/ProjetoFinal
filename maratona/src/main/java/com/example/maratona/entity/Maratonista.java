package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


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


    private String numeroCelular;
    private String numeroEmergencia;
    private String rg;

    private String sobrenome;

    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricoes;

}

