package jour03.job02;


public class Sortilege extends Carte {
    private String nom;
    private String description;

    public Sortilege(String nom, String description, int cout) {
        super(cout);
        this.nom = nom;
        this.description = description;
        System.out.println("Carte de type : Sortilège");
    }

    @Override
    public void afficher() {
        System.out.println("Coût : " + cout + " | Nom : " + nom + " | Description : " + description);
    }
}
