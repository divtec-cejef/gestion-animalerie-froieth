public class Soigneur extends Employe {

    /**
     * Constructeur d'un soigneur
     * @param nom Le nom du soigneur
     * @param prenom Le prénom du soigneur
     * @param salaire Le salaire du soigneur
     */
    public Soigneur(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire, "Soigneur");
    }

    /**
     * @return la tâche effectuer par le soigneur
     */
    @Override
    public String effectuerTache(Animal animal) {
        return animal.soinQuotidien() + " de " + animal.getNom();
    }

}
