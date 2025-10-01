import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();
        // Permet de gerer les animaux
        ArrayList<Animal> animaux = new ArrayList<>();
        // Instancie différents animaux
        animaux.add(new Chien("Ted", 7, étatSanté.SOIN_INTENSIF));
        animaux.add(new Chat("Garfield", 3, étatSanté.SAIN));
        animaux.add(new Lapin("Bob", 1, étatSanté.SAIN));

        // Permet de gerer les employes
        ArrayList<Employe> employes = new ArrayList<>();
        // Instancie différents employés
        employes.add(new Soigneur("Doe", "John", 4500));
        employes.add(new Vétérinaire("Dupont", "Martin", 6000));

        // Permet de gerer les concours
        ArrayList<ConcourAnimalier> concours = new ArrayList<>();
        // Instancie différents concours
        concours.add(new ConcourAnimalier("KingPet", "Porrentruy", 50));
        for (int i = 0; i < animaux.size(); i++) {
            concours.get(0).inscrireAnimal(animaux.get(i));
        }
        concours.add(new ConcourAnimalier("UCS", "Porrentruy", 200));


        console.afficherTableau();
        while (true) {
        console.afficherSansRetourLigne("\n\nAction à réaliser : ");
        switch(console.readNextInt()) {
            case 1: console.ajouterAnimal(animaux); break;
            case 2: console.supprimerAnimal(animaux); break;
            case 3: console.modifierEtatSanté(animaux); break;
            case 4: console.afficherInfosAnimal(animaux); break;
            case 5: console.afficherInfosTousAnimaux(animaux); break;
            case 6: console.faireCrierAnimal(animaux); break;
            case 7: console.faireCrierTousAnimaux(animaux); break;
            case 8: console.ajouterEmploye(employes); break;
            case 9: console.supprimerEmploye(employes); break;
            case 10: console.afficherInfosEmploye(employes); break;
            case 11: console.afficherInfosTousEmployes(employes); break;
            case 12: console.ajouterUneTache(animaux, employes); break;
            case 13: console.ajouterConcour(concours); break;
            case 14: console.supprimerConcour(concours); break;
            case 15: console.afficherInfosConcours(concours); break;
            case 16: console.afficherInfosTousConcours(concours); break;
            case 17: console.inscrireAnimalConcours(animaux, concours); break;
            case 18: console.lancerConcours(concours); break;
            default: console.afficherTableau(); break;
        }
        }































        /*ArrayList<Animal> animaux = new ArrayList<Animal>();
        animaux.add(new Chien("Ted", 7, étatSanté.SOIN_INTENSIF));
        animaux.add(new Chat("Garfield", 3, étatSanté.SOIN_LEGER));
        animaux.add(new Lapin("Bob", 1, étatSanté.SAIN));

        ArrayList<Employe> employes = new ArrayList<Employe>();
        employes.add(new Soigneur("Doe", "John", 4000));
        employes.add(new Vétérinaire("Doe", "James", 5000));

        ConcourAnimalier concour1 = new ConcourAnimalier("Premier Concour", "Porrentruy", 3);
        for (int i = 0; i < animaux.size(); i++) {
            concour1.inscrireAnimal(animaux.get(i));
        }


        for (Employe employe : employes) {
            console.afficher(employe);
            console.afficher("Tâche : " + employe.effectuerTache(animaux.get(1)));

            if(employe instanceof Vétérinaire) {
                console.afficher("Etat santé de " + animaux.get(1).getNom() + " après avoir été soigné : " + animaux.get(1).getSanté().afficherEtatSanté());
            }

            console.afficherRetourLigne();
        }





        console.afficher(concour1);
        console.afficher(concour1.lancerConcour());

         */

    }
}
