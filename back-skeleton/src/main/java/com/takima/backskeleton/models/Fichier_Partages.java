package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "Fichiers_Partagés")
@Getter
public class Fichier_Partages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fichier")
    private Long id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "date_de_partage")
    private LocalDate dateDePartage;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateurs utilisateur;

    public Fichier_Partages() {
    }

    // Add your setters and getters here
}