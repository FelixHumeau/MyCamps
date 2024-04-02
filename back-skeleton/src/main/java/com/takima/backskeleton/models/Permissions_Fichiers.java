package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Permissions_Fichiers")
@Getter
@NoArgsConstructor
public class Permissions_Fichiers {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateurs utilisateur;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_fichier")
    private Fichier_Partages fichier;

    @Column(name = "role")
    private String role;
}