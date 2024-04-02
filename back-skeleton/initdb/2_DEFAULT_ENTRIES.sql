INSERT INTO Utilisateurs (id_utilisateur, nom, prenom, adresse_mail, rôle, mot_de_passe) VALUES (1, 'Dupont', 'Jean','dupont.jean', 'admin', 'admin');
INSERT INTO Utilisateurs (id_utilisateur, nom, prenom, adresse_mail, rôle, mot_de_passe) VALUES (2, 'Durand', 'Paul','durant.paul', 'étudiant', 'étudiant');
INSERT INTO Utilisateurs (id_utilisateur, nom, prenom, adresse_mail, rôle, mot_de_passe) VALUES (3, 'Dujardin', 'Jean','dujardin.jean', 'professeur', 'professeur');

INSERT INTO Fichiers_Partagés (id_fichier, titre, description, url, date_de_partage,id_utilisateur) VALUES (1, 'Cours de mathématiques', 'Cours de mathématiques pour la classe de 3ème', 'https://www.coursdemath.com', '2021-01-01', 3);

INSERT INTO matieres (id_matiere, nom_matiere,description) VALUES (1, 'Mathématiques', 'Cours de mathématiques pour la classe de 3ème');

INSERT INTO classe (id_classe, nom_classe,description) VALUES (1, '3ème', 'Classe de 3ème');

INSERT INTO notes (id_note, id_utilisateur, id_matiere, note, commentaires,date) VALUES (1, 2, 1, 15, 'Bien', '2021-01-01');

INSERT INTO emplois_du_temps (id_emploi_du_temps, id_matiere, jour_de_la_semaine, heure_debut, heure_fin, salle) VALUES (1, 1, 'Lundi', '08:00', '10:00', 'A1');

INSERT INTO associations_utilisateur_matiere (id_utilisateur, id_matiere) VALUES (2, 1);

INSERT INTO associations_utilisateur_classe (id_utilisateur, id_fichier, role) VALUES (2, 1, 'étudiant');

INSERT INTO permissions_fichiers (id_utilisateur, id_fichier, role) VALUES (2, 1, 'étudiant');



