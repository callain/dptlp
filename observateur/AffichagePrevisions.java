package observateur;

public class AffichagePrevisions implements Observateur, Affichage {
    private float dernierePression;
    private float nouvellePression;
    private Sujet donneesMeteo;

    public AffichagePrevisions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.print("Prévisions: ");
        if (nouvellePression > dernierePression) {
            System.out.println("La météo s'améliore !");
        } else if (nouvellePression == dernierePression) {
            System.out.println("Pas de changement");
        } else if (nouvellePression < dernierePression) {
            System.out.println("Préparez votre parapluie");
        }
    }

    @Override
    public void actualiser(float temp, float humidite, float pression) {
        this.dernierePression = nouvellePression;
        this.nouvellePression = pression;

        afficher();
    }
}
