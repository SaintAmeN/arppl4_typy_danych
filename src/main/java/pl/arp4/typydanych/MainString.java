package pl.arp4.typydanych;

public class MainString {
    public static void main(String[] args) {
        // poprawne porównanie zmiennych typu String jest użycie 'equals'
        // ponieważ equals porónuje treść tekstu, a nie miejsce w pamięci

        // Tablica ASCII
        // String Pool
        String zmiennaA = "ala";
        String zmiennaB = new String("ala");
        String zmiennaC = new String("ala");
        String zmiennaD = "ala";
        String zmiennaE = "ala ";
        String zmiennaF = "Ala";

        System.out.println(zmiennaA == zmiennaB); // false
        System.out.println(zmiennaA == zmiennaD); // true = są zmienne wskazujące ten sam adres

        System.out.println(zmiennaB == zmiennaC); // false
        System.out.println(zmiennaC == zmiennaD); // false

        /// porównanie treści
        System.out.println(zmiennaA.equals(zmiennaB)); // true
        System.out.println(zmiennaA.equals(zmiennaC)); // true
        System.out.println(zmiennaA.equals(zmiennaD)); // true

        // "ala" vs "ala "
        System.out.println(zmiennaA.equals(zmiennaE)); // false
        // "ala" vs "Ala"
        System.out.println(zmiennaA.equals(zmiennaF)); // false

        System.out.println(zmiennaA.equalsIgnoreCase(zmiennaF)); // true
    }
}
