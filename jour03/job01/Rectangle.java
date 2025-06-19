public class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle de largeur " + largeur + " et hauteur " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Rectangle other = (Rectangle) obj;
        return this.largeur == other.largeur && this.hauteur == other.hauteur;
    }
}
