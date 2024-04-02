package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Utilisateurs")
@NoArgsConstructor
@Getter
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse_mail")
    private String adresseMail;

    @Column(name = "rôle")
    private String role;

    @Column(name = "mot_de_passe")
    private String motDePasse;
}