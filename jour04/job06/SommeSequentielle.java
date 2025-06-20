import java.util.Scanner;

public class SommeSequentielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

        // Lecture des éléments du tableau
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        scanner.close();

        long startTime = System.currentTimeMillis(); // début du chronomètre

        // Calcul de la somme séquentielle
        long somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }

        long endTime = System.currentTimeMillis(); // fin du chronomètre
        long executionTime = endTime - startTime;

        System.out.println("Somme totale : " + somme);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
