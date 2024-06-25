package com.example.maratona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Maratona {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    @Size(min = 2, max = 100, message = "O nome deve conter de 2 a 100 caracteres")
private String nome;
}
