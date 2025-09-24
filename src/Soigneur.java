public class Soigneur extends Employe {

    /**
     * Créer un soigneur
     * @param nom Le nom du soigneur
     * @param prenom Le prénom du soigneur
     * @param salaire Le salaire du soigneur
     * @param rôle Le rôle du soigneur
     */
    public Soigneur(String nom, String prenom, int salaire, String rôle) {
        super(nom, prenom, salaire, rôle);
    }

    /**
     * @return la tâche effectuer par le soigneur
     */
    @Override
    public String effectuerTache() {
        return "Soins quotidiens de chaque animal";
    }

}
