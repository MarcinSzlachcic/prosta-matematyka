package marcin.szlachcic;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a, b, c, d;
            System.out.println("Próbny kalkulator. Wpisz pierwszą cyfrę: ");
            a =Integer.parseInt(scanner.nextLine());
            System.out.println("Wpisz drugą cyfrę: ");
            b = Integer.parseInt(scanner.nextLine());

            System.out.println("wynik dodawania: " + (a + b));
            System.out.println("wynik odejmowania: " + (a - b));
            if (b != 0){
                System.out.println("wynik mnożenia: " + (a * b));
                System.out.println("wynik dzielenia: 8" + ((double)a / (double)b));
            }
            else{
                System.out.println("Dzielenie przez 0 jest niemożliwe");
            }
            System.out.println("Ile to sekund? Podaj ilość godzin do przeliczenia:");
            c = Integer.parseInt(scanner.nextLine());
            System.out.println(c + " godzin to jest: " + (c * 3600) + " sekund");



        }
    }
