package pl.arp4.typydanych;

public class MainKonwersja {
    public static void main(String[] args) {
        // Przykład A:
        short zmiennaA = 50;
        int zmiennaAKonwersja = zmiennaA;
        System.out.println(zmiennaAKonwersja); // 50

        // Przykład B:
        short zmiennaB = 51;
        long zmiennaBKonwersja = zmiennaB;
        System.out.println(zmiennaBKonwersja); // 51

        // Przykład C:
        int zmiennaC = 52;
        float zmiennaCKonwersja = zmiennaC;
        System.out.println(zmiennaCKonwersja); // 52

        // Przykład D:
        int zmiennaD = 53;
        double zmiennaDKonwersja = zmiennaD;
        System.out.println(zmiennaDKonwersja); // 53

        // Przykład E: 2147483648
        long zmiennaE =3000000058l;
        int zmiennaEKonwersja = (int) zmiennaE;
        System.out.println(zmiennaEKonwersja); // -1294967238

        // Przykład E:
        short zmiennaF = 32000;
        byte zmiennaFKonwersja = (byte) zmiennaF;
        System.out.println(zmiennaFKonwersja); // 54

        // Przykład G:
        char zmiennaG = 'a';
        int zmiennaGKonwersja = zmiennaG;
        System.out.println(zmiennaGKonwersja); // 97

        int maksymalnaWartosc = 2147483647;
        int drugiMaksymalnaWartosc = maksymalnaWartosc+1;
        System.out.println(drugiMaksymalnaWartosc);

        // 00000001 = 1
        // 1 1111111 = 255 -> -128
        // 0 1111111 = 127 -> 127
        byte wartoscMax = 127; // 8 bitów
        byte minimalnaWartoscByte = (byte) (wartoscMax+1);
        System.out.println(minimalnaWartoscByte);

    }
}
