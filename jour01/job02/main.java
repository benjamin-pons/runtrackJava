import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Permet la saisie dans le terminal
        System.out.print("Entrez un texte : ");
        String saisie = scanner.nextLine();       // Lis la saisie utilisateur
        System.out.println(saisie);               // Affiche la saisie dans le terminal
        scanner.close();       
    }
}