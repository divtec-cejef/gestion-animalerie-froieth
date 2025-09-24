public class Chien extends Animal {

    /**
     * Créer un chien
     * @param nom Nom du chien
     * @param age Age du chien
     * @param santé Etat de santé du chien
     */
    public Chien(String nom, int age, étatSanté santé){
        super(nom, age, santé);
    }

    /**
     * @return le bruit que fait le chien
     */
    @Override
    public String faireBruit() {
        return "Wouaf!";
    }

    /**
     * @return le soin quotidien du chien
     */
    @Override
    public String soinQuotidien() {
        return "brosser";
    }

}
