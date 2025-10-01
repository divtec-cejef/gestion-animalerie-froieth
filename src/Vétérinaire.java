public class Vétérinaire extends Employe {

    /**
     * Constructeur d'un vétérinaire
     * @param nom Le nom du vétérinaire
     * @param prenom Le prénom du vétérinaire
     * @param salaire Le salaire du vétérinaire
     */
    public Vétérinaire(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire, "Vétérinaire");
    }

    /**
     * @return la tâche effectuer par le vétérinaire
     */
    @Override
    public String effectuerTache(Animal animal) {
        if(animal.getSanté() == étatSanté.SOIN_INTENSIF){
            animal.setSanté(étatSanté.SOIN_LEGER);
        } else if(animal.getSanté() == étatSanté.SOIN_LEGER){
            animal.setSanté(étatSanté.SAIN);
        } else {
            return "ne peut pas soigner " + animal.getNom() + ", son état de santé est déjà sain.";
        }
        return "soigne " + animal.getNom();
    }

}
