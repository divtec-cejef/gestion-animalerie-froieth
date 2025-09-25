public class Lapin extends Animal {

    /**
     * Constructeur d'un lapin
     * @param nom Nom du lapin
     * @param age Age du lapin
     * @param santé Etat de santé du lapin
     */
    public Lapin(String nom, int age, étatSanté santé){
        super(nom, age, santé, "lapin");
    }

    /**
     * @return le bruit que fait le lapin
     */
    @Override
    public String faireBruit() {
        return "Squick!";
    }

    /**
     * @return le soin quotidien du lapin
     */
    @Override
    public String soinQuotidien() {
        return "Vérifie le foin";
    }

}
