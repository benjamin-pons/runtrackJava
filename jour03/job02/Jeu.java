package jour03.job02;


public class Jeu {
    private Carte[] cartes = new Carte[10];
    private int nbCartes = 0;
    private int indexJouer = 0;

    public void piocher(Carte carte) {
        if (nbCartes < 10) {
            cartes[nbCartes] = carte;
            nbCartes++;
        } else {
            System.out.println("Jeu plein !");
        }
    }

    public void jouer() {
        if (indexJouer < nbCartes && cartes[indexJouer] != null) {
            System.out.print("Joue la carte : ");
            cartes[indexJouer].afficher();
            cartes[indexJouer] = null;
            indexJouer++;
        } else {
            System.out.println("Plus de cartes à jouer !");
        }
    }

    public void afficher() {
        System.out.println("=== Cartes du jeu ===");
        for (int i = 0; i < nbCartes; i++) {
            if (cartes[i] != null) {
                System.out.print((i + 1) + ". ");
                cartes[i].afficher();
            }
        }
    }
}
