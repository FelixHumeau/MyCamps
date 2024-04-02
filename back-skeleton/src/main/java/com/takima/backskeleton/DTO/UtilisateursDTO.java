package com.takima.backskeleton.DTO;

/**
 * UtilisateurDTO est un objet de transfert de données pour la classe Utilisateurs.
 * Il est utilisé pour transporter les informations d'un utilisateur sans exposer les détails sensibles tels que le mot de passe.
 */
public class UtilisateursDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String adresseMail;
    private String role;

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Constructeur sans arguments
    public UtilisateursDTO() {
    }

    // Constructeur avec arguments
    public UtilisateursDTO(Long id, String nom, String prenom, String adresseMail, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.role = role;
    }

    // toString, hashCode, equals, etc. si nécessaire
}
