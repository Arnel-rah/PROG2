package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private int numeroDeTelephone;
    private String groupe;
    private String tuteur;

}
