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
                    "-------------- Gestion des animaux ---------------\n\n" +
                        "\t[1] Ajouter un animal\n" +
                        "\t[2] Supprimer un animal\n" +
                        "\t[3] Modifier état de santé d'un animal\n" +
                        "\t[4] Afficher les infos d'un animal\n" +
                        "\t[5] Afficher les infos de tous les animaux\n" +
                        "\t[6] Faire crier un animal\n" +
                        "\t[7] Faire crier tous les animaux\n" +
                        "\n-------------- Gestion des employés --------------\n\n" +
                        "\t[8] Ajouter un employé\n" +
                        "\t[9] Supprimer un employé\n" +
                        "\t[10] Afficher les infos d'un employé\n" +
                        "\t[11] Afficher les infos de tous les employés\n" +
                        "\t[12] Ajouter une tâche à un employé\n" +
                        "\n-------------- Gestion des concours --------------\n\n" +
                        "\t[13] Ajouter un concour\n" +
                        "\t[14] Supprimer un concour\n" +
                        "\t[15] Voir les infos d'un concour\n" +
                        "\t[16] Voir les infos de tous les concours\n" +
                        "\t[17] Inscrire un animal à un coucour\n" +
                        "\t[18] Lancer un concour");
    }

    /**
     * Affiche une liste contenant tous les animaux
     * @param animaux Liste des animaux
     * @return Une liste sous forme de chaîne de caractère contenant tous les animaux
     */
    public String afficherTousLesAnimaux(ArrayList<Animal> animaux) {
        String affichage = "\tAnimaux : \n";
        for (int i = 0; i<animaux.size(); i++) {
            affichage += "\t\t[" + (i+1) + "]" + animaux.get(i).getNom() + " (" + animaux.get(i).getRace() + ")\n";
        }
        return affichage;
    }

    /**
     * Affiche les états de santé disponible
     * @return Une liste des états de santé
     */
    public String afficherEtatSanté() {
        return  "\tÉtat de santé :\n" +
                "\t\t[1] Sain\n" +
                "\t\t[2] Soin leger\n" +
                "\t\t[3] Soin intensif";
    }

    /**
     * Ajoute un animal donné à la liste
     * @param animaux Liste des animaux
     */
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

    /**
     * Supprime un animal donné de la liste
     * @param animaux Liste des animaux
     */
    public void supprimerAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à supprimer : ");
        int animalASupprimer =  readNextInt();
        afficherSansRetourLigne("Êtes-vous sûr de vouloir supprimer \"" + animaux.get(animalASupprimer - 1).getNom() + "\" (o/n) : ");
        switch(readNextLine()) {
            case "o":
            case "O":
                animaux.remove(animalASupprimer - 1);
                afficher( "L'animal a été supprimer."); break;
            case "n":
            case "N": afficher("L'animal n'a pas été supprimer"); break;
        }
    }

    /**
     * Modifie l'état de santé d'un animal donné
     * @param animaux Liste des animaux
     */
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

    /**
     * Affiche les infos générales d'un animal donné
     * @param animaux Liste des animaux
     */
    public void afficherInfosAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à afficher les infos : ");
        int animalAAffiche = readNextInt();
        afficher(animaux.get(animalAAffiche - 1));
    }

    /**
     * Affiche les infos générales de tous les animaux
     * @param animaux Liste des animaux
     */
    public void afficherInfosTousAnimaux(ArrayList<Animal> animaux) {
        for(int i = 0; i < animaux.size(); i++) {
            afficher(animaux.get(i));
            if(i != animaux.size() - 1) {
                afficher("\t\t------------------------------");
            }
        }
    }

    /**
     * Affiche le bruit que fait un animal donné
     * @param animaux Liste des animaux
     */
    public void faireCrierAnimal(ArrayList<Animal> animaux) {
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\tAnimal à faire crier : ");
        int animalAFaireCrier = readNextInt();
        afficher("\t\t" + animaux.get(animalAFaireCrier - 1).faireBruit());
    }

    /**
     * Affiche le bruit que font tous les animaux
     * @param animaux Liste des animaux
     */
    public void faireCrierTousAnimaux(ArrayList<Animal> animaux) {
        for(int i = 0; i < animaux.size(); i++) {
            afficher("\t" + animaux.get(i).faireBruit());
        }
    }

    /**
     * Affiche une liste contenant tous les employés
     * @param employes Liste de tous les employés
     * @return Une liste sous forme de chaîne de caractère contenant tous les employés
     */
    public String afficherTousLesEmployes(ArrayList<Employe> employes){
        String affichage = "\tEmployés : \n";
        for (int i = 0; i<employes.size(); i++) {
            affichage += "\t\t[" + (i+1) + "]" + employes.get(i).getNom() + " " + employes.get(i).getPrenom() + " (" + employes.get(i).getRôle() + ")\n";
        }
        return affichage;
    }

    /**
     * Ajoute un employé à la liste donnée
     * @param employes Liste de tous les employés
     */
    public void ajouterEmploye(ArrayList<Employe> employes) {
        afficher("\tType d'employé :\n" +
                "\t\t[1] Soigneur\n" +
                "\t\t[2] Vétérinaire\n");
        afficherSansRetourLigne("\tRôle : ");
        int role = readNextInt();
        afficherSansRetourLigne("\tNom : ");
        String nom = readNextLine();
        afficherSansRetourLigne("\tPrénom : ");
        String prenom = scanner.nextLine();
        afficherSansRetourLigne("\tSalaire : ");
        int salaire = readNextInt();
        switch(role) {
            case 1: employes.add(new Soigneur(nom, prenom, salaire)); break;
            case 2: employes.add(new Vétérinaire(nom, prenom, salaire)); break;
        }
        afficher("\nL'employé " + nom + " " + prenom + " a été ajouter.");
    }

    /**
     * Supprime un employé donné de la liste
     * @param employes liste de tous les employés
     */
    public void supprimerEmploye(ArrayList<Employe> employes) {
        afficher(afficherTousLesEmployes(employes));
        afficherSansRetourLigne("\tEmployé à supprimer : ");
        int employeASupprimer =  readNextInt();
        afficherSansRetourLigne("Êtes-vous sûr de vouloir supprimer \"" + employes.get(employeASupprimer - 1).getNom() + " " + employes.get(employeASupprimer - 1).getPrenom() + "\" (o/n) : ");
        switch(readNextLine()) {
            case "o":
            case "O":
                employes.remove(employeASupprimer - 1);
                afficher( "L'employé a été supprimer."); break;
            case "n":
            case "N": afficher("L'employé n'a pas été supprimer"); break;
        }
    }

    /**
     * Affiche les infos générales d'un employé donné
     * @param employes Liste de tous les employé
     */
    public void afficherInfosEmploye(ArrayList<Employe> employes) {
        afficher(afficherTousLesEmployes(employes));
        afficherSansRetourLigne("\tEmployé à afficher les infos : ");
        int employeAAffiche = readNextInt();
        afficher(employes.get(employeAAffiche - 1));
    }

    /**
     * Affiche les infos générales de tous les employés
     * @param employes Liste de tous les employés
     */
    public void afficherInfosTousEmployes(ArrayList<Employe> employes) {
        for(int i = 0; i < employes.size(); i++) {
            afficher(employes.get(i));
            if(i != employes.size() - 1) {
                afficher("\t\t------------------------------");
            }
        }
    }

    /**
     * Affecte une tâche à un employé
     * @param animaux Liste de tous les animaux
     * @param employes Liste de tous les employés
     */
    public void ajouterUneTache(ArrayList<Animal> animaux, ArrayList<Employe> employes) {
        afficher(afficherTousLesEmployes(employes));
        afficherSansRetourLigne("\t\tEmployé à affecter la tacher : ");
        Employe employeAffecter = employes.get(readNextInt() - 1);
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\t\tAnimal à s'occuper : ");
        Animal animalASOccuper = animaux.get(readNextInt() - 1);
        afficher("\t\t" + employeAffecter.getNom() + " " + employeAffecter.getPrenom() + " " + employeAffecter.effectuerTache(animalASOccuper) + ".");
    }

    /**
     * Affiche une liste contenant tous les concours
     * @param concours Liste de tous les concours
     * @return Une liste sous format textuel contenant tous les concours
     */
    public String afficherTousLesConcours(ArrayList<ConcourAnimalier> concours) {
        String affichage = "\tConcours : \n";
        for (int i = 0; i<concours.size(); i++) {
            affichage += "\t\t[" + (i+1) + "]" + concours.get(i).getNom() + " (" + concours.get(i).getLieu() + ")\n";
        }
        return affichage;
    }

    /**
     * Ajoute un concours à la liste donnée
     * @param concours Liste de tous les concours
     */
    public void ajouterConcour(ArrayList<ConcourAnimalier> concours) {
        afficherSansRetourLigne("\tNom : ");
        String nom = readNextLine();
        afficherSansRetourLigne("\tLieu : ");
        String lieu = scanner.nextLine();
        afficherSansRetourLigne("\tCapacité maximum : ");
        int capacitéMax = readNextInt();
        concours.add(new ConcourAnimalier(nom, lieu, capacitéMax));
        afficher("\nLe concours " + nom + " a été ajouter.");
    }

    /**
     * Supprime un concours de la liste donnée
     * @param concours liste de tous les concours
     */
    public void supprimerConcour(ArrayList<ConcourAnimalier> concours) {
        afficher(afficherTousLesConcours(concours));
        afficherSansRetourLigne("\tConcour à supprimer : ");
        int concourASupprimer =  readNextInt();
        afficherSansRetourLigne("Êtes-vous sûr de vouloir supprimer le concour \"" + concours.get(concourASupprimer - 1).getNom() + "\" (o/n) : ");
        switch(readNextLine()) {
            case "o":
            case "O":
                concours.remove(concourASupprimer - 1);
                afficher( "Le concour a été supprimer."); break;
            case "n":
            case "N": afficher("Le concour n'a pas été supprimer"); break;
        }
    }

    /**
     * Affiche les infos général d'un concour
     * @param concours Liste de tous les concours
     */
    public void afficherInfosConcours(ArrayList<ConcourAnimalier> concours) {
        afficher(afficherTousLesConcours(concours));
        afficherSansRetourLigne("\tConcour à afficher les infos : ");
        int concourAAffiche = readNextInt();
        afficher(concours.get(concourAAffiche - 1));
    }

    /**
     * Affiche les infos général de tous les concours
     * @param concours Liste de tous les concours
     */
    public void afficherInfosTousConcours(ArrayList<ConcourAnimalier> concours) {
        for(int i = 0; i < concours.size(); i++) {
            afficher(concours.get(i));
            if(i != concours.size() - 1) {
                afficher("\t\t------------------------------");
            }
        }
    }

    /**
     * Inscrit un animal d'une liste donnée à un concour d'une liste donnée
     * @param animaux Liste de tous les animaux
     * @param concours Liste de tous les concours
     */
    public void inscrireAnimalConcours(ArrayList<Animal> animaux, ArrayList<ConcourAnimalier> concours) {
        afficher(afficherTousLesConcours(concours));
        afficherSansRetourLigne("\t\tConcours à utiliser : ");
        ConcourAnimalier concourAffecter = concours.get(readNextInt() - 1);
        afficher(afficherTousLesAnimaux(animaux));
        afficherSansRetourLigne("\t\tAnimal à inscrire : ");
        Animal animalAInscrire = animaux.get(readNextInt() - 1);
        concourAffecter.inscrireAnimal(animalAInscrire);
        afficher("\t\t" + animalAInscrire.getNom() + " à été inscrit au concour \"" + concourAffecter.getNom() + "\"");
    }

    /**
     * Lance un concours de la liste des concours donnée
     * @param concours Liste de tous les concours
     */
    public void lancerConcours(ArrayList<ConcourAnimalier> concours) {
        afficher(afficherTousLesConcours(concours));
        afficherSansRetourLigne("Concour à lancer : ");
        afficher(concours.get(readNextInt() - 1).lancerConcour());
    }
}