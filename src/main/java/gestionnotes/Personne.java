package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected String email;
    protected String telephone;
}
