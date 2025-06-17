import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1er : ");
        int n1 = scanner.nextInt();

        System.out.print("2eme : ");
        int n2 = scanner.nextInt();

        System.out.print("3eme : ");
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;

        System.out.println("Le maximum est : " + max);

        scanner.close();
    }
}