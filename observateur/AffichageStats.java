package observateur;

import java.util.Locale;

public class AffichageStats implements Observateur, Affichage {
    private float maxTemperature = 30.0f;
    private float minTemperature = 20.0f;
    private float sommeTemperatures;
    private int nbLectures;
    private Sujet donneesMeteo;

    public AffichageStats(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.println(String.format("Température Max/Moy/Min: %s/%s/%s", maxTemperature,
                sommeTemperatures / nbLectures, minTemperature));
    }

    @Override
    public void actualiser(float temp, float humidite, float pression) {
        nbLectures++;
        sommeTemperatures += temp;

        if (temp > maxTemperature) {
            maxTemperature = temp;
        }

        if (temp < minTemperature) {
            minTemperature = temp;
        }

        afficher();
    }
}
