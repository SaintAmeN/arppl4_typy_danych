package pl.arp4.typydanych;

public class MainZadanie2Typy {
    public static void main(String[] args) {
        boolean zmienna = false;

        System.out.println(false == false);         // wynik: true
        System.out.println(false != true);          // wynik: true
        System.out.println(!true);                  // wynik: false
        System.out.println(2 > 4);                  // wynik: false
        System.out.println(!(2 > 4));               // wynik: true
        System.out.println(3 < 5);                  // wynik: true
        System.out.println(3 == 3 && 3 == 4);       // wynik: false (prawda i fałsz) = fałsz (i = oba wyrażenia muszą być prawdą)
        System.out.println(3 != 5 || 3 == 5);       // wynik: true  (prawda lub fałsz) = prawda (lub = którekolwiek musi być prawdą)
        System.out.println((2+4) > (1+3));          // wynik: true
        System.out.println("cos".equals("cos"));    // wynik: true
        System.out.println("cos" == "cos");         // wynik: true
    }
}
