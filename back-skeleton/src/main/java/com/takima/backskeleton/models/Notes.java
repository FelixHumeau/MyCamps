package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notes")
@Getter
@NoArgsConstructor
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_note")
    private Long id;

    @Column(name = "note")
    private Double note;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateurs utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matieres matiere;
}