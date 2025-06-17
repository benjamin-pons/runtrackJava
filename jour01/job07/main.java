import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0; 
        int i = 0;     

        while (i < 5) {
            System.out.print("Entrez un entier : ");
            somme += scanner.nextInt();
            i++;
        }

        System.out.println("La moyenne est : " + (somme / 5.0));
        scanner.close();
    }
}
