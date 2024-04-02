package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Classe")
@Getter
@NoArgsConstructor
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classe")
    private Long id;

    @Column(name = "nom_classe")
    private String nomClasse;

    // Assuming there is a relationship between Classe and Utilisateurs
    @OneToMany(mappedBy = "classe")
    private List<Utilisateurs> utilisateurs;
}