public class Vétérinaire extends Employe {

    /**
     * Créer un vétérinaire
     * @param nom Le nom du vétérinaire
     * @param prenom Le prénom du vétérinaire
     * @param salaire Le salaire du vétérinaire
     * @param rôle Le rôle du vétérinaire
     */
    public Vétérinaire(String nom, String prenom, int salaire, String rôle) {
        super(nom, prenom, salaire, rôle);
    }

    /**
     * @return la tâche effectuer par le vétérinaire
     */
    @Override
    public String effectuerTache() {
        return "Soigne les animaux malades et améliore son état de santé";
    }

}
