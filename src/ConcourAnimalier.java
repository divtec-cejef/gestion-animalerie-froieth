import java.util.ArrayList;

public class ConcourAnimalier {

    private String nom;
    private String lieu;
    private int capacitéMax;
    private Animal[] animalsInscrits =  new Animal[capacitéMax];

    /**
     * Constructeur d'un concour animalier
     * @param nom Nom du concour
     * @param lieu Lieu du concour
     * @param capacitéMax Capacité maximum du concour
     */
    public ConcourAnimalier(String nom, String lieu, int capacitéMax) {
        this.nom = nom;
        this.lieu = lieu;
        this.capacitéMax = capacitéMax;
    }

    /**
     * Permet d'inscrire un animal au concour
     * @param animal
     */
    public void inscrireAnimal(Animal animal) {
        // Vérifie l'état de santé de l'animal à inscrire
        if (animal.getSanté() == étatSanté.SAIN) {

            // Parcour la liste pour voir si l'animal à inscrire est déjà inscrit
            for(Animal anim : animalsInscrits){

                // Ajoute l'animal dans la première case vide
                for (int i = 0; i < animalsInscrits.length; i++) {

                    if (animalsInscrits[i] == null) {
                        animalsInscrits[i] = animal;
                    }

                }

            }
        }
    }

}
