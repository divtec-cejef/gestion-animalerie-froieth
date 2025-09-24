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
        employes.add(new Vétérinaire("Bond", "James", 5000));

        for (Employe employe : employes) {
            console.afficher(employe.effectuerTache(animals.get(0)));
        }




    }
}
