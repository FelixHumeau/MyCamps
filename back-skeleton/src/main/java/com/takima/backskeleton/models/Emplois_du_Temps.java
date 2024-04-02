package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Emplois_du_temps")
@Getter
@NoArgsConstructor
public class Emplois_du_Temps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emploi_du_temps")
    private Long id;

    @Column(name = "jour_de_la_semaine")
    private LocalDate date;

    @Column(name = "heure_debut")
    private String heureDebut;

    @Column(name = "heure_fin")
    private String heureFin;

    @Column(name = "salle")
    private String salle;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Classe classe;

    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matieres matiere;
}