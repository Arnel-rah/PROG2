package gestionnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class Examen {
    private int id;
    private String titre;
    private Cours cours;
    private Instant dateHeure;
    private int coefficient;
}