package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UtilisateursDao est l'interface pour l'accès aux données des utilisateurs.
 * Elle étend JpaRepository qui fournit des méthodes CRUD pour la classe Utilisateurs.
 */
@Repository
public interface UtilisateursDao extends JpaRepository<Utilisateurs, Long> {

    // Ici, vous pouvez ajouter d'autres méthodes spécifiques pour interroger la base de données,
    // par exemple, trouver un utilisateur par son adresse e-mail ou son rôle.
    Utilisateurs findByAdresseMail(String adresseMail);
}
