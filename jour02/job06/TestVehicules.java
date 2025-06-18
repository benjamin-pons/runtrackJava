// Classe de base
class Vehicule {
    protected String marque;
    protected String dateAchat;
    protected int prixAchat;
    protected int prixCourant;

    public Vehicule(String marque, String dateAchat, int prixAchat, int prixCourant) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixCourant;
    }

    public void afficherInfos() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat);
        System.out.println("Prix courant : " + prixCourant);
    }
}

// Classe Voiture
class Voiture extends Vehicule {
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private int kilometrage;

    public Voiture(String marque, String dateAchat, int prixAchat, int prixCourant,
                   int cylindree, int nbPortes, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat, prixCourant);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Cylindrée : " + cylindree);
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance);
        System.out.println("Kilométrage : " + kilometrage);
    }
}

// Classe Avion
class Avion extends Vehicule {
    private String typeMoteur;
    private int heuresVol;

    public Avion(String marque, String dateAchat, int prixAchat, int prixCourant,
                 String typeMoteur, int heuresVol) {
        super(marque, dateAchat, prixAchat, prixCourant);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Heures de vol : " + heuresVol);
    }
}

// Classe de test
public class TestVehicules {
    public static void main(String[] args) {
        Voiture v = new Voiture("Renault", "2021-01-01", 20000, 15000, 1600, 5, 110, 50000);
        Avion a = new Avion("Boeing", "2015-06-15", 100000000, 80000000, "REACTION", 12000);

        System.out.println("=== Voiture ===");
        v.afficherInfos();
        System.out.println("\n=== Avion ===");
        a.afficherInfos();
    }
}