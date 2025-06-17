import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] nombres = {1, 2, 3, 4, 5};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }        public class Main {
            public static void main(String[] args) {
                int[] T = new int[10];
                for (int i = 0; i < T.length; i++) {
                    T[i] = i;
                }
        
                System.out.println("T[0] = " + T[0]);   // 0
                System.out.println("T[1] = " + T[1]);   // 1
                System.out.println("T[5] = " + T[5]);   // 5
                System.out.println("T[9] = " + T[9]);   // 9
            }
        }
        System.out.println("Affichage des nombres :" + nombres);
    }
}