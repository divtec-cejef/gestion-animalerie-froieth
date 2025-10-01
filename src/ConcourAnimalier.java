import java.util.ArrayList;
import java.util.List;

public class ConcourAnimalier {

    private String nom;
    private String lieu;
    private int capacitéMax;
    private List<Animal> animauxInscrits = new ArrayList<>();

    /**
     * Constructeur d'un concour animalier
     * @param nom         Nom du concour
     * @param lieu        Lieu du concour
     * @param capacitéMax Capacité maximum du concour
     */
    public ConcourAnimalier(String nom, String lieu, int capacitéMax) {
        this.nom = nom;
        this.lieu = lieu;
        this.capacitéMax = capacitéMax;
    }

    public String getNom() {
        return nom;
    }

    public String getLieu() {
        return lieu;
    }

    /**
     * Permet d'inscrire un animal au concour
     * @param animal
     */
    public String inscrireAnimal(Animal animal) {
        boolean peutEtreInscrit = true;
        String message = "\t\t";

        if (animal == null || animal.getSanté() != étatSanté.SAIN || animauxInscrits.size() >= capacitéMax) {
            peutEtreInscrit = false;
            message += animal.getNom() + " ne peut pas être inscrit";
            if(animal.getSanté() != étatSanté.SAIN) {
                message += ", son état de santé n'est pas sain.";
            } else if (animauxInscrits.size() >= capacitéMax){
                message += ", le concour est plein.";
            }
        }

        // Vérifie si l'animal est déjà inscrit
        for (Animal a : animauxInscrits) {
            if (animal.equals(a)) {
                peutEtreInscrit = false;
                message += animal.getNom() + " est déjà inscrit à ce concour.";
            }
        }

        // Ajoute l'animal dans la première case vide
        if (peutEtreInscrit) {
            animauxInscrits.add(animal);
            message += "\t\t" + animal.getNom() + " à été inscrit au concour \"" + nom + "\"";
        }

        return message;
    }

    @Override
    public String toString() {
        String message = "\t\tConcour : " + nom +
                "\n\t\tLieu : " + lieu + "\n";
        message += "\t\tAnimaux inscrits : ";
        if (animauxInscrits.size() == 0) {
            message += "aucun\n";
        } else {
            for (int i = 0; i < animauxInscrits.size(); i++) {
                if (animauxInscrits.get(i) != null) {
                    message += "\n\t\t\t" + animauxInscrits.get(i).getNom() + " (" + animauxInscrits.get(i).getRace() + ")";
                }
            }
        }

        return message;
    }

    public String lancerConcour() {
        String message = "";
        List<Animal> animalsInscritsTemp = new ArrayList<>();

        if (animauxInscrits.size() > 1) {

            message += "\n\tClassement : ";

            for (int i = 0; i < animauxInscrits.size(); i++) {
                if (animauxInscrits.get(i) != null) {
                    animalsInscritsTemp.add(animauxInscrits.get(i));
                }
            }

            for (int i = 0; i < animauxInscrits.size(); i++) {

                int indexAléa = (int) (Math.random() * animalsInscritsTemp.size());
                Animal choisi = animalsInscritsTemp.remove(indexAléa);

                if (choisi != null) {
                    message += "\n\t\t" + (i + 1) + ") " + choisi.getNom();
                }
            }
        } else {
            message += "Le concour \"" + nom + "\" ne peut pas être lancé car ";
            if(animauxInscrits.size() == 1) {
                message += "un seul animal y est inscrit.";
            } else {
                message += "aucun animal n'y est inscrit.";
            }
        }
        return message;
    }
}