import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcourAnimalier {

    private String nom;
    private String lieu;
    private int capacitéMax;
    private List<Animal> animalsInscrits = new ArrayList<>();

    /**
     * Constructeur d'un concour animalier
     *
     * @param nom         Nom du concour
     * @param lieu        Lieu du concour
     * @param capacitéMax Capacité maximum du concour
     */
    public ConcourAnimalier(String nom, String lieu, int capacitéMax) {
        this.nom = nom;
        this.lieu = lieu;
        this.capacitéMax = capacitéMax;
    }

    /**
     * Permet d'inscrire un animal au concour
     *
     * @param animal
     */
    public void inscrireAnimal(Animal animal) {
        boolean peutEtreInscrit = true;

        if (animal == null || animal.getSanté() != étatSanté.SAIN || animalsInscrits.size() >= capacitéMax) {
            peutEtreInscrit = false;
        }

        // Vérifie si l'animal est déjà inscrit
        for (Animal a : animalsInscrits) {
            if (animal.equals(a)) {
                peutEtreInscrit = false;
            }
        }

        // Ajoute l'animal dans la première case vide
        if (peutEtreInscrit) {
            animalsInscrits.add(animal);
        }
    }

    @Override
    public String toString() {
        String message = "Concour : " + nom + "\nLieu : " + lieu + "\n";

        if (animalsInscrits.size() > 0) {
            message += "Animaux inscrits : \n";
            for (int i = 0; i < animalsInscrits.size(); i++) {
                if (animalsInscrits.get(i) != null) {
                    message += "\t" + animalsInscrits.get(i).getNom() + "\n";
                }
            }
        }

        return message;
    }

    public String lancerConcour() {
        String message = "";
        List<Animal> animalsInscritsTemp = new ArrayList<>();

        for (int i = 0; i < animalsInscrits.size(); i++) {
            if (animalsInscrits.get(i) != null) {
                animalsInscritsTemp.add(animalsInscrits.get(i));
            }
        }

        for (int i = 0; i < animalsInscrits.size(); i++) {

            int indexAléa = (int) (Math.random() * animalsInscritsTemp.size());
            Animal choisi = animalsInscritsTemp.remove(indexAléa);

            if (choisi != null) {
                message += (i + 1) + ") " + choisi.getNom() + "\n";
            }
        }
        return message;
    }
}