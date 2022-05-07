package pl.arp4.typydanych;

public class MainTypy {
    // typy danych:

    // 1 bajt / byte = 8 bitów
    // 4 * byte = int
    // - byte = zmienna całkowita o wartości 0-255 lub -128 do 127 (łącznie może mieć  256 wartości)
    // - char = zmienna całkowita o wartości 0-255 lub -128 do 127 (łącznie może mieć  256 wartości) = jest znakiem

    // - 2 bajty = 16 bitów
    // - short = zmienna całkowita o wartości 0-65535 lub -32768 do 32767 (łącznie może mieć 65536 wartości)

    // - 4 bajty = 32 bity
    // - int = zmienna całkowita -2147483648 - 2147483647
    // - float = liczba zmiennoprzecinkowa pojedynczej precyzji

    // - 8 bajtów = 64 bity
    // - double = liczba zmiennoprzecinkowa podwójnej precyzji
    // - long = zmienna całkowita, wartość -9223372036854775808 - 9223372036854775807

    // wystarczy 1 bit (1/0)
    // - boolean - tak/nie true/false
    public static void main(String[] args) {
        // deklaracja wraz z przypisaniem wartości 5
        int liczba = 5;

        //
        double liczbaZmiennoprzecinkowa = 5.0;
        float liczbaZmiennoprzecinkowa2 = 5.0f;

        // zmienna całkowita
        byte bajt = 9;

        // flaga typu boolean
        boolean zmiennaBooleanowska = false;

        // działanie matematyczne wykona się z precyzją najbardziej precyzyjnej składowej
        // wypisze: 2
        System.out.println(6/3);
        // wypisze: 2
        System.out.println(8/3);
        // wypisze: 0
        System.out.println(99/100);

        // wypisze: 2.666
        System.out.println(8/3.0);
    }
}
