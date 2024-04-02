package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Associations_Utilisateur_Matiere")
@Getter
@NoArgsConstructor
public class Associations_Utilisateur_Matiere {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateurs utilisateur;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matieres matiere;
}