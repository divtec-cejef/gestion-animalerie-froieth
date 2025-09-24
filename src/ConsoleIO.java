import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Permet de lire la prochaine ligne
     * @return la valeur de la porchaine ligne
     */
    public String readNextLine() {
        return scanner.nextLine();
    }

    /**
     * Affiche l'objet
     * @param obj Objet à afficher
     */
    public void afficher(Object obj) {
        System.out.println(obj);
    }

    /**
     * Affiche l'objet sans faire de retour à la ligne
     * @param obj Objet à afficher
     */
    public void afficherSansRetourLigne(Object obj) {
        System.out.print(obj);
    }

    /**
     * Fais un retour à la ligne
     */
    public void afficherRetourLigne() {
        System.out.println();
    }

}