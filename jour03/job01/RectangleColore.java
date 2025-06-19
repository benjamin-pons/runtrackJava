public class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + " de couleur " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        RectangleColore other = (RectangleColore) obj;
        return this.largeur == other.largeur &&
               this.hauteur == other.hauteur &&
               this.couleur.equals(other.couleur);
    }
}
