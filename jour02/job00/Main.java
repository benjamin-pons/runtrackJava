public class Main {
    public static void main(String[] args) {
        personne p = new personne("Dupont", "Jean", "01/01/2000", "Paris", "123 Rue de France", "0601020304");

        // Modification via setter
        p.setAdresse("456 Rue Nouvelle");
        p.setTelephone("0611223344");

        // Affichage
        p.afficherInfos();
    }
}
