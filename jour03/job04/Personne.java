package jour03.job04;
import java.util.Vector;
import java.util.Scanner;

abstract class Personne {
    protected int identité;
    protected String nomSocial;
    protected String adresse;

    protected Personne(int identité, String nomSocial, String adresse) {
        this.identité = identité;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    protected int getIdentité() {
        return identité;
    }

    protected String getNomSocial() {
        return nomSocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    protected void setIdentité(int identité) {
        this.identité = identité;
    }

    protected void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    protected void afficher() {
        System.out.println("Identité : " + identité);
        System.out.println("Nom social : " + nomSocial);
        System.out.println("Adresse : " + adresse);
    }

}
class Client extends Personne {
    private double chiffreAffaire;

    public Client(int identité, String nomSocial, String adresse, double chiffreAffaire) {
        super(identité, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    protected void afficher() {
        super.afficher();
        System.out.println("Chiffre d'affaire : " + chiffreAffaire);
    }

}

class Article {
    private int identiteArticle;
    private String nomArticle;
    private double prixArticle;

    public Article(int identiteArticle, String nomArticle, double prixArticle) {
        this.identiteArticle = identiteArticle;
        this.nomArticle = nomArticle;
        this.prixArticle = prixArticle;
    }

    public int getIdentiteArticle() {
        return identiteArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public double getPrixArticle() {
        return prixArticle;
    }

    public void setIdentiteArticle(int identiteArticle) {
        this.identiteArticle = identiteArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public void setPrixArticle(double prixArticle) {
        this.prixArticle = prixArticle;
    }

    public void afficher() {
        System.out.println("Identité de l'article : " + identiteArticle);
        System.out.println("Nom de l'article : " + nomArticle);
        System.out.println("Prix de l'article : " + prixArticle);
    }
}

class Commande {
    private int numeroCommande;
    private int dateCommande;
    private String client;

    public Commande(int numeroCommande, int dateCommande, String client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public int getDateCommande() {
        return dateCommande;
    }

    public String getClient() {
        return client;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public void setDateCommande(int dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(String client) {
        this.client = client;
    }

}

class Ligne {
    // Attributs privés
    private Commande commande;
    private Article article;
    private int quantiteCommande;

    // Constructeur
    public Ligne(Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }

    // Accesseurs (getters)
    public Commande getCommande() {
        return commande;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    // Mutateurs (setters)
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }
}

class Commerciale extends Personne {
    Vector<Article> articles;
    Vector<Client> clients;
    Vector<Commande> commandes;
    Vector<Ligne> lignes;

    public Commerciale(int identité, String nomSocial, String adresse) {
        super(identité, nomSocial, adresse);
        this.articles = new Vector<>();
        this.clients = new Vector<>();
        this.commandes = new Vector<>();
        this.lignes = new Vector<>();
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
        System.out.println("Commande ajoutée au vecteur des commandes.");
    }

    public void annulerCommande(Commande c) {
        if (commandes.remove(c)) {
            System.out.println("Commande annulée avec succès.");
        } else {
            System.out.println("La commande n'a pas été trouvée.");
        }
    }

    public void ajouterArticle(Article a) {
        articles.add(a);
        System.out.println("Article ajouté au vecteur des articles.");
    }

    public void supprimerArticle(Article a) {
        if (articles.remove(a)) {
            System.out.println("Article supprimé avec succès.");
        } else {
            System.out.println("L'article n'a pas été trouvé.");
        }
    }
    public void ajouterClient(Client c) {
        clients.add(c);
        System.out.println("Client ajouté au vecteur des clients.");
    }

    public void supprimerClient(Client c) {
        if (clients.remove(c)) {
            System.out.println("Client supprimé avec succès.");
        } else {
            System.out.println("Le client n'a pas été trouvé.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("1) Ajouter un article\n" +
                    "2) Supprimer un article\n" +
                    "3) Ajouter un client\n" +
                    "4) Supprimer un client\n" +
                    "5) Passer une commande\n" +
                    "6) Annuler une commande\n" +
                    "0) Quitter\n" +
                    "Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne
            Commerciale commerciale = new Commerciale(1, "Commerçant", "123 Rue des Ventes");

            switch (choix) {
                case 1:
                    // Ajouter un article
                    System.out.print("Entrez l'identité de l'article : ");
                    int identiteArticle = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom de l'article : ");
                    String nomArticle = scanner.nextLine();
                    System.out.print("Entrez le prix de l'article : ");
                    double prixArticle = scanner.nextDouble();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    Article article = new Article(identiteArticle, nomArticle, prixArticle);
                    commerciale.ajouterArticle(article);
                    break;
                case 2:
                    System.out.print("Entrez l'identité de l'article à supprimer : ");
                    int identiteArticleASupprimer = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Entrez le nom de l'article à supprimer : ");
                    String nomArticleASupprimer = scanner.nextLine();
                    Article articleASupprimer = new Article(identiteArticleASupprimer, nomArticleASupprimer, 0.0);
                    commerciale.supprimerArticle(articleASupprimer);
                    break;
                case 3:
                    // Ajouter un client
                    System.out.print("Entrez l'identité du client : ");
                    int identiteClient = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom du client : ");
                    String nomClient = scanner.nextLine();
                    System.out.print("Entrez l'adresse du client : ");
                    String adresseClient = scanner.nextLine();
                    System.out.print("Entrez le chiffre d'affaire du client : ");
                    double chiffreAffaireClient = scanner.nextDouble();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    Client client = new Client(identiteClient, nomClient, adresseClient, chiffreAffaireClient);
                    commerciale.ajouterClient(client);
                    break;
                case 4:
                    // Supprimer un client
                    System.out.print("Entrez l'identité du client à supprimer : ");
                    int identiteClientASupprimer = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom du client à supprimer : ");
                    String nomClientASupprimer = scanner.nextLine();
                    Client clientASupprimer = new Client(identiteClientASupprimer, nomClientASupprimer, "", 0.0);
                    commerciale.supprimerClient(clientASupprimer);
                    break;
                case 5:
                    // Passer une commande
                    System.out.print("Entrez l'identité de la commande : ");
                    int identiteCommande = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez l'identité du client : ");
                    int identiteClientCommande = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez l'identité de l'article : ");
                    int identiteArticleCommande = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez la quantité : ");
                    int quantiteCommande = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    // Créez la commande
                    Commande commande = new Commande(identiteCommande, identiteClientCommande, String.valueOf(identiteClientCommande));
                    commerciale.passerCommande(commande);

                    // Créez l'article (vous pouvez rechercher l'article existant dans le vecteur si besoin)
                    Article articleCommande = new Article(identiteArticleCommande, "", 0.0);

                    // Créez la ligne de commande
                    Ligne ligne = new Ligne(commande, articleCommande, quantiteCommande);
                    commerciale.lignes.add(ligne);
                    break;

                case 6:
                    // Annuler une commande
                    System.out.print("Entrez l'identité de la commande à annuler : ");
                    int identiteCommandeAAannuler = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    Commande commandeAAannuler = new Commande(identiteCommandeAAannuler, 0, "");
                    commerciale.annulerCommande(commandeAAannuler);
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } finally {
            scanner.close();
        }
    }

}

