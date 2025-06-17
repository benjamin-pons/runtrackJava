import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int somme = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= somme; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
