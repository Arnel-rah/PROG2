package gestionnotes;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Tuteur extends Personne{
    private String lienAvecEtudiant;
    public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone) {
        super(id, nom, prenom, dateNaissance, email, telephone);
    }
}
