package gestionnotes;

import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Note {
    private final Examen examen;
    private final Etudiants etudiants;
    private final double valeurInitiale;
    private final List<Historique> historique = new ArrayList<>();

    public Note(Examen examen, Etudiants etudiants, double valeurInitiale) {
        this.examen = examen;
        this.etudiants = etudiants;
        this.valeurInitiale = valeurInitiale;
        this.historique.add(new Historique(Instant.now(), valeurInitiale, "Note initial"));
    }

    public void changerNote(double nouvelleValeur, String motif) {
        historique.add(new Historique(Instant.now(), nouvelleValeur, motif));
    }

    public double getValeurA(Instant t) {
        Historique derniere = null;
        for (Historique h : historique) {
            if (!h.date.isAfter(t) && (derniere == null || h.date.isAfter(derniere.date))) {
                derniere = h;
            }
        }
        return derniere != null ? derniere.valeur : valeurInitiale;
    }
    private static class Historique {
        Instant date;
        double valeur;
        String motif;

        Historique(Instant date, double valeur, String motif) {
            this.date = date;
            this.valeur = valeur;
            this.motif = motif;
        }
    }
}