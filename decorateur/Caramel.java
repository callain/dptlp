package decorateur;

import java.util.HashMap;
import java.util.Map;

public class Caramel extends DecorateurIngredient {

    private Map<Taille, Double> cout;

    public Caramel(Boisson boisson) {
        super(boisson);

        cout = new HashMap<>();
        cout.put(Taille.NORMALE, 0.10);
        cout.put(Taille.GRANDE, 0.15);
        cout.put(Taille.VENTI, 0.20);
    }

    @Override
    public double cout() {
        return boisson.cout() + cout.get(boisson.getTaille());
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

}
