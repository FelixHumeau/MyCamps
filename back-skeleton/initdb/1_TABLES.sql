create table utilisateurs
(
    id_utilisateur INT primary key,
    nom VARCHAR(250) not null,
    prenom VARCHAR(250) not null,
    adresse_mail VARCHAR(250) not null,
    rôle varchar(250) not null,
    mot_de_passe VARCHAR(250) not null
);

create table Fichiers_partagés
(
    id_fichier INT PRIMARY KEY,
    titre VARCHAR(250) not null,
    description TEXT not null,
    chemin TEXT not null,
    date_de_partage DATE not null,
    id_utilisateur INT not null,
    FOREIGN KEY (ID_Utilisateur) REFERENCES Utilisateurs(ID_Utilisateur)
);

CREATE TABLE Matieres (
    ID_matiere INT PRIMARY KEY,
    Nom_matiere VARCHAR(255) NOT NULL,
    Description TEXT
);

CREATE TABLE Classe (
    ID_classe INT PRIMARY KEY,
    Nom_classe VARCHAR(255) NOT NULL,
    Description TEXT
);

CREATE TABLE Notes (
    ID_note INT PRIMARY KEY,
    ID_utilisateur INT,
    ID_matiere INT,
    Note DECIMAL(5,2),
    Commentaires TEXT,
    Date DATE NOT NULL,
    FOREIGN KEY (ID_utilisateur) REFERENCES Utilisateurs(ID_utilisateur),
    FOREIGN KEY (ID_matiere) REFERENCES Matieres(ID_matiere)
);

CREATE TABLE Emplois_du_temps (
    ID_emploi_du_temps INT PRIMARY KEY,
    ID_matiere INT,
    ID_utilisateur INT,
    Heure_debut TIME NOT NULL,
    Heure_fin TIME NOT NULL,
    Jour_de_la_semaine VARCHAR(255) NOT NULL,
    Salle VARCHAR(255),
    FOREIGN KEY (ID_matiere) REFERENCES Matieres(ID_matiere),
    FOREIGN KEY (ID_utilisateur) REFERENCES Utilisateurs(ID_utilisateur)
);


CREATE TABLE Associations_Utilisateur_Matiere (
    ID_utilisateur INT,
    ID_matiere INT,
    PRIMARY KEY (ID_utilisateur, ID_matiere),
    FOREIGN KEY (ID_utilisateur) REFERENCES Utilisateurs(ID_utilisateur),
    FOREIGN KEY (ID_matiere) REFERENCES Matieres(ID_matiere)
  );


CREATE TABLE Associations_Utilisateur_classe (
    ID_utilisateur INT,
    ID_fichier INT,
    Role varchar(255) NOT NULL,
    PRIMARY KEY (ID_utilisateur, ID_fichier),
    FOREIGN KEY (ID_utilisateur) REFERENCES Utilisateurs(ID_utilisateur),
    FOREIGN KEY (ID_fichier) REFERENCES Fichiers_partagés(ID_fichier)
);

CREATE TABLE Permissions_Fichiers (
    ID_utilisateur INT,
    ID_fichier INT,
    Role varchar(255) NOT NULL,
    PRIMARY KEY (ID_utilisateur, ID_fichier),
    FOREIGN KEY (ID_utilisateur) REFERENCES Utilisateurs(ID_utilisateur),
    FOREIGN KEY (ID_fichier) REFERENCES Fichiers_partagés(ID_fichier)

);




