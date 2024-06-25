package com.example.maratona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
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

    @Min(value = 10, message = "O número minimo é 10")
    @Max(value = 50, message = "O numero maximo é 50")
    private int idade;

@Size(min = 1,max = 2, message = "O grupo sanguineo deve conter 1 a 2 caracteres" )
    private String grupoSanguineo;

    @Size(min = 2, max = 100, message = "O nome deve conter de 2 a 100 caracteres")
    private String nome;

    @Size(min = 1, max = 9,message = "O numero deve estar em 1 a 9")
    private int numeroCelular;

    @Size(min = 1, max = 9, message = "O numero deve estar em 1 a 9")
    private int numeroEmergencia;

    @Size(min = 1, max = 9, message = "O numero deve estar em 1 a 9")
    private int rg;

    @Size(min = 2, max = 100, message = "O nome deve conter de 2 a 100 caracteres")
    private String sobrenome;
}
