// Classe de base
class Vehicule {
    protected String marque;
    protected int anneeAchat;
    protected int prixAchat;
    protected int prixCourant;

    public Vehicule(String marque, int anneeAchat, int prixAchat, int prixCourant) {
        this.marque = marque;
        this.anneeAchat = anneeAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixCourant;
    }

    public void afficherInfos() {
        System.out.println("Marque : " + marque);
        System.out.println("Année d'achat : " + anneeAchat);
        System.out.println("Prix d'achat : " + prixAchat);
        System.out.println("Prix courant : " + prixCourant);
    }

    // Méthode de base
    public void calculePrix(int anneeActuelle) {
        int nbAnnees = anneeActuelle - anneeAchat;
        double prix = prixAchat * (1 - 0.01 * nbAnnees);
        prixCourant = (int)Math.max(prix, 0);
    }
}

// Classe Voiture
class Voiture extends Vehicule {
    private int kilometrage;

    public Voiture(String marque, int anneeAchat, int prixAchat, int prixCourant,
                   int kilometrage) {
        super(marque, anneeAchat, prixAchat, prixCourant);
        this.kilometrage = kilometrage;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        int nbAnnees = anneeActuelle - anneeAchat;
        double prix = prixAchat;

        // -2% par année
        prix -= prixAchat * 0.02 * nbAnnees;

        // -5% par tranche de 10 000 km (arrondi à la tranche la plus proche)
        int tranchesKm = (int)Math.round(kilometrage / 10000.0);
        prix -= prixAchat * 0.05 * tranchesKm;

        // -10% pour certaines marques
        String marqueMin = marque.toLowerCase();
        if (marqueMin.equals("renault") || marqueMin.equals("fiat")) {
            prix -= prixAchat * 0.10;
        }

        // +20% pour Ferrari ou Porsche
        if (marqueMin.equals("ferrari") || marqueMin.equals("porsche")) {
            prix += prixAchat * 0.20;
        }

        prixCourant = (int)Math.max(prix, 0);
    }
}

// Classe Avion
class Avion extends Vehicule {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, int anneeAchat, int prixAchat, int prixCourant,
                 String typeMoteur, int heuresVol) {
        super(marque, anneeAchat, prixAchat, prixCourant);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double prix = prixAchat;
        if (typeMoteur.equalsIgnoreCase("HELICES")) {
            int tranches = (int)Math.round(heuresVol / 100.0);
            prix -= prixAchat * 0.10 * tranches;
        } else {
            int tranches = (int)Math.round(heuresVol / 1000.0);
            prix -= prixAchat * 0.10 * tranches;
        }
        prixCourant = (int)Math.max(prix, 0);
    }
}

// Classe de test
public class TestVehicules {
    public static void main(String[] args) {
        Voiture v = new Voiture("Renault", 2020, 20000, 20000, 25000);
        Avion a = new Avion("Boeing", 2015, 100000000, 100000000, "REACTION", 12000);

        v.calculePrix(2024);
        a.calculePrix(2024);

        System.out.println("=== Voiture ===");
        v.afficherInfos();
        System.out.println("\n=== Avion ===");
        a.afficherInfos();
    }
}