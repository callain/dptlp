package observateur;

public class AffichageConditions implements Observateur, Affichage {
    private float temperature;
    private float humidite;
    private Sujet donneesMeteo;

    public AffichageConditions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        // Java 15 Text Blocks !
        String conditions = """
                Conditions actuelles:
                    - Température: %s C°
                    - Humidité: %s
                """.formatted(temperature, humidite);

        System.out.println(conditions);
    }

    @Override
    public void actualiser(float temp, float humidite, float pression) {
        this.temperature = temp;
        this.humidite = humidite;

        afficher();
    }
}
