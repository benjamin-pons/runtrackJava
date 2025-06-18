
// Définition de l'objet Cercle
class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;

    // Getters
    public double getCentreX() {
        return centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public double getRayon() {
        return rayon;
    }

    // Setters
    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Méthode surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour vérifier si un point (x, y) est à l'intérieur du cercle
    public boolean contient(double x, double y) {
        double dx = x - centreX;
        double dy = y - centreY;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= rayon;
    }
}

// Classe principale pour exécuter le programme
public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLongueur(5.0);
        r.setLargeur(3.0);
        System.out.println("Surface du rectangle : " + r.surface());

        // Exemple d'utilisation de Cercle
        Cercle c = new Cercle();
        c.setCentreX(0.0);
        c.setCentreY(0.0);
        c.setRayon(2.0);
        System.out.println("Surface du cercle : " + c.surface());
        System.out.println("Le point (1,1) est-il dans le cercle ? " + c.contient(1, 1));
        System.out.println("Le point (3,0) est-il dans le cercle ? " + c.contient(3, 0));
    }
}



