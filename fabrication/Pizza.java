package fabrication;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String nom;
    protected String pate;
    protected String sauce;

    protected List<String> garnitures = new ArrayList<>();

    public void preparer() {
        System.out.println("Préparation de " + nom);
        System.out.println("Étalage de la pâte...");
        System.out.println("Ajout de la sauce...");
        System.out.println("Ajout de la garnitures");
        garnitures.forEach(g -> System.out.println(" " + g));
    }

    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getNom() {
        return nom;
    }

}
