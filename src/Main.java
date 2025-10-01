import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();
        // Permet de gerer les animaux
        ArrayList<Animal> animaux = new ArrayList<>();
        // Instancie différents animaux
        animaux.add(new Chien("Ted", 7, étatSanté.SOIN_INTENSIF));
        animaux.add(new Chat("Garfield", 3, étatSanté.SOIN_LEGER));
        animaux.add(new Lapin("Bob", 1, étatSanté.SAIN));

        // Permet de gerer les employes
        ArrayList<Employe> employes = new ArrayList<>();
        // Instancie différents employés
        employes.add(new Soigneur("Doe", "John", 4500));
        employes.add(new Vétérinaire("Dupont", "Martin", 6000));


        console.afficherTableau();
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
