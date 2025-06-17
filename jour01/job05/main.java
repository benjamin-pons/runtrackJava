import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();
        double carre = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est " + carre);
        scanner.close();
    }
}