import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Permet de lire le prochain int
     * @return la valeur du prochain int
     */
    public int readNextInt() {
        return scanner.nextInt();
    }

    /**
     * Permet de lire la prochaine ligne
     * @return la valeur de la porchaine ligne
     */
    public String readNextLine() {
        scanner.nextLine(); // Prend le retour à la ligne précédent
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

    /**
     * Affiche toutes les actions possible à faire
     */
    public void afficherTableau() {
        afficher(
                    "-------------- Gestion des animaux --------------\n" +
                        "[1] Ajouter un animal\n" +
                        "[2] Supprimer un animal\n" +
                        "[3] Modifier état de santé d'un animal\n" +
                        "[4] Afficher les infos d'un animal\n" +
                        "[5] Afficher les infos de tous les animaux\n" +
                        "[6] Faire crier un animal\n" +
                        "[7] Faire crier tous les animaux\n" +
                        "\n-------------- Gestion des employés --------------\n" +
                        "[8] Ajouter un soigneur\n" +
                        "[9] Ajouter un vétérinaire\n" +
                        "[10] Supprimer un vétérinaire\n" +
                        "[11] Afficher les infos d'un employé\n" +
                        "[12] Afficher les infos de tous les employés\n" +
                        "[13] Ajouter une tâche à un employé\n" +
                        "\n-------------- Gestion des concours --------------\n" +
                        "[14] Ajouter un concour\n" +
                        "[15] Supprimer un concour\n" +
                        "[16] Voir les infos d'un concour\n" +
                        "[17] Inscrire un animal à un coucour\n" +
                        "[18] Lancer un concour");
    }

    public String afficherTousLesAnimaux(ArrayList<Animal> animaux) {
        String affichage = "\tAnimaux : \n";
        for (int i = 0; i<animaux.size(); i++) {
            affichage += "\t\t[" + (i+1) + "]" + animaux.get(i).getNom() + " (" + animaux.get(i).getRace() + ")\n";
        }
        return affichage;
    }

    public String afficherEtatSanté() {
        return  "\tÉtat de santé :\n" +
                "\t\t[1] Sain\n" +
                "\t\t[2] Soin leger\n" +
                "\t\t[3] Soin intensif";
    }

    public void ajouterAnimal(ArrayList<Animal> animaux) {
        afficher("\tRace des animaux :\n" +
                "\t\t[1] Chien\n" +
                "\t\t[2] Chat\n" +
                "\t\t[3] Lapin");
        afficherSansRetourLigne("\tRace : ");
        int race = readNextInt();
        afficherSansRetourLigne("\tNom : ");
        String nom = readNextLine();
        afficherSansRetourLigne("\tAge : ");
        int age = readNextInt();
        afficher(afficherEtatSanté());
        étatSanté santé = null;
        switch(readNextInt()){
            case 1: santé = étatSanté.SAIN; break;
            case 2: santé = étatSanté.SOIN_LEGER; break;
            case 3: santé = étatSanté.SOIN_INTENSIF; break;
        }
        switch(race) {
            case 1: animaux.add(new Chien(nom, age, santé)); break;
            case 2: animaux.add(new Chat(nom, age, santé)); break;
            case 3: animaux.add(new Lapin(nom, age, santé)); break;
        }
        afficher("\nL'animal " + nom + " a été ajouter.");
    }

    public void supprimerAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à supprimer : ");
        int animalASupprimer =  readNextInt();
        afficherSansRetourLigne("Êtes-vous sûr de vouloir supprmer \"" + animaux.get(animalASupprimer - 1).getNom() + "\" (o/n) : ");
        switch(readNextLine()) {
            case "o":
            case "O":
                animaux.remove(animalASupprimer - 1);
                afficher( "L'animal a été supprimer."); break;
            case "n":
            case "N": afficher("\nL'animal n'a pas été supprimer"); break;
        }
    }

    public void modifierEtatSanté(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à modifier l'état de santé : ");
        int animalAModifEtat =  readNextInt();
        afficher("\tSanté actuelle de " + animaux.get(animalAModifEtat - 1).getNom() + " : " + animaux.get(animalAModifEtat - 1).getSanté());
        afficher(afficherEtatSanté());
        afficherSansRetourLigne("\tNouvel état de santé : ");
        étatSanté nouvelEtatSanté = null;
        switch(readNextInt()){
            case 1: nouvelEtatSanté = étatSanté.SAIN; break;
            case 2: nouvelEtatSanté = étatSanté.SOIN_LEGER; break;
            case 3: nouvelEtatSanté = étatSanté.SOIN_INTENSIF; break;
        }
        animaux.get(animalAModifEtat - 1).setSanté(nouvelEtatSanté);
        afficher("\nL'état de santé de " + animaux.get(animalAModifEtat - 1).getNom() + " a été modifié.");
    }

    public void afficherInfosAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à afficher les infos : ");
        int animalAAffiche = readNextInt();
        afficher(animaux.get(animalAAffiche - 1));
    }

    public void afficherInfosTousAnimaux(ArrayList<Animal> animaux) {
        for(int i = 0; i < animaux.size(); i++) {
            afficher(animaux.get(i));
            if(i != animaux.size() - 1) {
                afficher("\t\t------------------------------");
            }
        }
    }

    public void faireCrierAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à faire crier : ");
        int animalAFaireCrier = readNextInt();
        afficher("\t\t" + animaux.get(animalAFaireCrier - 1).faireBruit());
    }

    public void faireCrierTousAnimaux(ArrayList<Animal> animaux) {
        for(int i = 0; i < animaux.size(); i++) {
            afficher("\t" + animaux.get(i).faireBruit());
        }
    }
}