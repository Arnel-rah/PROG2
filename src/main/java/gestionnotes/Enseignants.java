package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Enseignants {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String telephone;
    private String specialite;
}

