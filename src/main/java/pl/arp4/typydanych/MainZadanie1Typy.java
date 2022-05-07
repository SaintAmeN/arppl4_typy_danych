package pl.arp4.typydanych;

public class MainZadanie1Typy {
    public static void main(String[] args) {
        long liczba = 10L; // L oznacza long

        System.out.println(2 + 3); // wynik: 5
        System.out.println(2 - 4); // wynik: -2
        System.out.println(5 / 2); // wynik: 2
        System.out.println(5.0 / 2); // wynik: 2.5
        System.out.println(5 / 2.0); // wynik: 2.5
        System.out.println(5.0 / 2.0); // wynik: 2.5
        System.out.println(100L - 10); // wynik: 90
        System.out.println(2f - 3); // wynik: -1.0
        System.out.println(5f / 2); // wynik: 2.5
        System.out.println(5d / 2); // wynik: 2.5
        System.out.println('A' + 2); // wynik: 67
        System.out.println('a' + 2); // wynik: 99
        System.out.println("a" + 2); // wynik: a2         // konkatenacja = łączenie tekstu
        System.out.println("a" + "b"); // wynik: ab
        System.out.println('a' + 'b'); // wynik: 195
        System.out.println("a" + 'b'); // wynik: ab       // konkatenacja
        System.out.println("a" + 'b' + 3); // wynik: ab3
        System.out.println('b' + 3 + "a"); // wynik: 101a
        System.out.println('b' + "a" + 3 ); // wynik: ba3
        System.out.println(9 % 4); // wynik: 1 // % nazywany jest "modulo" - czyli reszta z dzielenia


        System.out.println("Wypisuję wynik: " + 3);
    }
}
