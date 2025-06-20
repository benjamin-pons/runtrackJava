import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Générer une chaîne aléatoire
        String randomString = generateRandomString(length);

        // Écrire dans le fichier output.txt
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(randomString.getBytes());
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Chaîne générée et écrite dans 'output.txt'.");
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }

    // Méthode pour générer une chaîne aléatoire
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
