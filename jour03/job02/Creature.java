package jour03.job02;

public class Creature extends Carte {
    private String nom;
    private int degats;
    private int vie;

    public Creature(String nom, int degats, int vie, int cout) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
        System.out.println("Carte de type : Créature");
    }

    @Override
    public void afficher() {
        System.out.println("Coût : " + cout + " | Nom : " + nom + " | Dégâts : " + degats + " | Vie : " + vie);
    }
}
