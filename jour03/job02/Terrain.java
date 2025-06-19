package jour03.job02;

public class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
        System.out.println("Carte de type : Terrain");
    }

    @Override
    public void afficher() {
        System.out.println("Coût : " + cout + " | Couleur : " + couleur);
    }
}

