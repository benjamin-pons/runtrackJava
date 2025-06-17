import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int n = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * i * i; // i^3
        }
        System.out.println("La somme des " + n + " premiers cubes est : " + somme);
        scanner.close();
    }
}
