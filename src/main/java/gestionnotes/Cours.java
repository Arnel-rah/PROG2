package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cours {
    private int id;
    private String label;
    private int credits;
    private Enseignants enseignant;
}