import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Permet la saisie dans le terminal
        System.out.print("prénom : ");
        String prenom = scanner.nextLine();       // Lis la saisie utilisateur
        System.out.println(" bonjour " + prenom);  
        scanner.close();
    }
}