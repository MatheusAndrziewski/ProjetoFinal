package com.example.maratona.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Maratona {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nome;
@JsonBackReference
@OneToMany(mappedBy = "maratona")
private List<Circuito> circuitos;

}
