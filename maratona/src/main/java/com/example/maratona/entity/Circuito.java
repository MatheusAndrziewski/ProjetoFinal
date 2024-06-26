package com.example.maratona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Circuito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Min(value = 100, message = "Você pode correr 100 metros" )
    @Max(value = 200, message = "Você pode correr 200 metros")
    private int distancia;

    private Categoria categoria;

    @OneToMany(mappedBy = "circuito")
    private List<Inscricao> inscricoes;

    @ManyToOne
    private Maratona maratona;
}
