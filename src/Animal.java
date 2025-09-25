public abstract class Animal {

    private String nom;
    private int age;
    private étatSanté santé;
    private String race;

    /**
     * Constructeur d'un aimal
     * @param nom Nom de l'animal
     * @param age Age de l'animal
     * @param santé Etat de santé de l'animal
     */
    public Animal(String nom, int age, étatSanté santé, String race) {
        this.nom = nom;
        this.age = age;
        this.santé = santé;
        this.race = race;
    }

    @Override
    public String toString() {
        return  "\t\tNom : " + nom +
                "\n\t\tRace : " + race +
                "\n\t\tAge : " + age +
                "\n\t\tÉtat de santé : " + santé.afficherEtatSanté();
    }

    /**
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return l'état de santé de l'animal
     */
    public étatSanté getSanté() {
        return santé;
    }

    /**
     * @return la race de l'animal
     */
    public String getRace() {
        return race;
    }

    /**
     * Modifie l'état de santé de l'animal
     * @param santé État de santé de l'animal
     */
    public void setSanté(étatSanté santé) {
        this.santé = santé;
    }

    /**
     * Compare cet animal avec l'autre objet donnée
     * @param autre   Objet à comparer avec l'animal
     * @return vrais si les deux objets sont identiques, sinon faux
     */
    @Override
    public boolean equals(Object autre) {
        if (autre == null || autre.getClass().equals(this.getClass())) {
            return false;
        }
        Animal autre2 = (Animal) autre;
        return this.nom.equals(autre2.nom) && this.nom == autre2.nom && this.age == autre2.age && this.santé == autre2.santé;
    }

    public abstract String faireBruit();

    public abstract String soinQuotidien();
}
