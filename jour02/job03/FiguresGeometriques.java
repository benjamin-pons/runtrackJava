class Rectangle {
    private double longueur;
    private double largeur;

    // Getter pour longueur
    public double getLongueur() {
        return longueur;
    }

    // Setter pour longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Getter pour largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Méthode surface
    public double surface() {
        return longueur * largeur;
    }

}

// Classe principale pour exécuter le programme
public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLongueur(5.0);
        r.setLargeur(3.0);
        System.out.println("Surface du rectangle : " + r.surface());
    }
}

class RectangleColore extends Rectangle {
    private int couleur;

    // Constructeur
    public RectangleColore(double longueur, double largeur, int couleur) {
        setLongueur(longueur);
        setLargeur(largeur);
        this.couleur = couleur;
    }

    // Getter pour couleur
    public int getCouleur() {
        return couleur;
    }

    // Setter pour couleur
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}



