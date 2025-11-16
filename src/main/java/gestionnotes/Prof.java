package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Getter
public class Prof extends Personne{
    public Prof(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone) {
        super(id, nom, prenom, dateNaissance, email, telephone);
    }
}
