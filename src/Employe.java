public abstract class Employe {

    private String nom;
    private String prenom;
    private int salaire;
    private String rôle;

    /**
     * Constructeur d'un employé
     * @param nom Le nom de l'employé
     * @param prenom Le prénom de l'employé
     * @param salaire Le salaire de l'employé
     * @param rôle Le rôle de l'employé
     */
    public Employe(String nom, String prenom, int salaire, String rôle) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.rôle = rôle;
    }

    /**
     * @return une description textuel de l'empployé
     */
    @Override
    public String toString() {
        return "Nom : " + prenom + " " + nom + "\nRôle : " + rôle + "\nSalaire : " + salaire + ".-";
    }

    public abstract String effectuerTache(Animal animal);

}
