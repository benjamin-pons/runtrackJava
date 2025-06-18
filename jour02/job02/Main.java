class Erreur {

    public static void main(String args[]) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();

        System.out.println(x.a);  // ✅ Correct : x est de type E1, a est défini dans E1
        System.out.println(y.c);  // ❌ Faux : c est défini dans E3, pas accessible via une variable E2
        System.out.println(z.b);  // ✅ Correct : z est un E3 (hérite de E2), b est dans E2
        System.out.println(v.c);  // ❌ Faux : v est un E4, mais c est défini dans E3 (pas dans sa lignée directe)
        System.out.println(w.a);  // ✅ Correct : w est un E5, hérite de E4 puis de E1 où a est défini
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E1 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}
