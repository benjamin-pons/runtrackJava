// Classe Figure de base
class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
    }
}

// Rectangle hérite de Figure
class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() { return longueur; }
    public void setLongueur(double longueur) { this.longueur = longueur; }
    public double getLargeur() { return largeur; }
    public void setLargeur(double largeur) { this.largeur = largeur; }
    public double surface() { return longueur * largeur; }
}

// Cercle hérite de Figure
class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() { return rayon; }
    public void setRayon(double rayon) { this.rayon = rayon; }
    public double surface() { return Math.PI * rayon * rayon; }
    public boolean contient(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        return Math.sqrt(dx * dx + dy * dy) <= rayon;
    }
}

// Classe principale pour tester
public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1.0, 2.0, 5.0, 3.0);
        r.affiche();
        System.out.println("Surface du rectangle : " + r.surface());

        Cercle c = new Cercle(0.0, 0.0, 2.0);
        c.affiche();
        System.out.println("Surface du cercle : " + c.surface());
        System.out.println("Le point (1,1) est-il dans le cercle ? " + c.contient(1, 1));
    }
}