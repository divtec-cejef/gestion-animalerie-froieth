import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Chien("Ted", 7, étatSanté.SOIN_INTENSIF));
        animals.add(new Chat("Garfield", 3, étatSanté.SOIN_LEGER));
        animals.add(new Lapin("Bob", 1, étatSanté.SAIN));

        ArrayList<Employe> employes = new ArrayList<Employe>();
        employes.add(new Soigneur("Doe", "John", 4000));
        employes.add(new Vétérinaire("Doe", "James", 5000));

        ConcourAnimalier concour1 = new ConcourAnimalier("Premier Concour", "Porrentruy", 3);
        for (int i = 0; i < animals.size(); i++) {
            concour1.inscrireAnimal(animals.get(i));
        }


        for (Employe employe : employes) {
            console.afficher(employe);
            console.afficher("Tâche : " + employe.effectuerTache(animals.get(1)));

            if(employe instanceof Vétérinaire) {
                console.afficher("Etat santé de " + animals.get(1).getNom() + " après avoir été soigné : " + animals.get(1).getSanté().afficherEtatSanté());
            }

            console.afficherRetourLigne();
        }





        console.afficher(concour1);
        console.afficher(concour1.lancerConcour());

    }
}
