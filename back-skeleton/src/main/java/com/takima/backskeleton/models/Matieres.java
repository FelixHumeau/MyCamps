package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Matieres")
@Getter
@NoArgsConstructor
public class Matieres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matiere")
    private Long id;

    @Column(name = "nom_matiere")
    private String nomMatiere;

    @Column(name = "description")
    private String description;

    // Assuming there is a relationship between Matieres and Utilisateurs
    @OneToMany(mappedBy = "matieres")
    private List<Utilisateurs> utilisateurs;
}