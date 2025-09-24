public abstract class Animal {

    public enum étatSanté {
        SAIN,
        SOIN_LEGER,
        SOIN_INTENSIF
    }

    private String nom;
    private int age;
    private étatSanté santé;

    /**
     * Créer un aimal
     * @param nom Nom de l'animal
     * @param age Age de l'animal
     * @param santé Etat de santé de l'animal
     */
    public Animal(String nom, int age, étatSanté santé){
        this.nom = nom;
        this.age = age;
        this.santé = santé;
    }

    public abstract String faireBruit();

    public abstract String soinQuotidien();

}
