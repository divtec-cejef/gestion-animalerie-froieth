public class Chat extends Animal {

    /**
     * Constructeur d'un chat
     * @param nom Nom du chat
     * @param age Age du chat
     * @param santé Etat de santé du chat
     */
    public Chat(String nom, int age, étatSanté santé){
        super(nom, age, santé);
    }

    /**
     * @return le bruit que fait le chat
     */
    @Override
    public String faireBruit() {
        return "Miaou!";
    }

    /**
     * @return le soin quotidien du chat
     */
    @Override
    public String soinQuotidien() {
        return "Nettoie la litière";
    }

}
