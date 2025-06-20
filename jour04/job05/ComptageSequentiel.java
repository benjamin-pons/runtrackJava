import java.util.Scanner;

public class ComptageSequentiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis(); // Début du chronomètre

        // Comptage séquentiel
        for (int i = 1; i <= max; i++) {
            // Pour alléger l'affichage, on peut commenter la ligne suivante si le nombre est très grand
            // System.out.println(i);
        }

        long endTime = System.currentTimeMillis(); // Fin du chronomètre
        long executionTime = endTime - startTime;

        System.out.println("Comptage terminé jusqu'à " + max + ".");
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}

