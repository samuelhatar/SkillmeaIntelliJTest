import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*String pozdrav = "Hello World";

        //Toto je pisanie textu
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);

        int prvniCislo = 10;
        int druheCislo = 5;

        prvniCislo = 20;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String Meno = "Samuel";

        System.out.println(pozdrav2 + Meno);

        //Uloha Uzivatel napise svoje meno a program ho pozdravy

        String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno:");
        String meno = mujScanner.nextLine();
        System.out.println(pozdrav3 + meno);

        //Kalkulacka
        float prvecislo;
        float druhecislo;
        Scanner mujScanner2 = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        prvecislo = mujScanner2.nextFloat();

        System.out.println("Zadaj druhe cislo:");
        druhecislo = mujScanner2.nextFloat();

        System.out.println(prvecislo + druhecislo);
        System.out.println(prvecislo - druhecislo);
        System.out.println(prvecislo * druhecislo);
        System.out.println(prvecislo / druhecislo);

       int nijakeCislo = 5;
       nijakeCislo = 25;*/

        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo.length());
         */

        //Prevod typu
        //int prevedeneCislo = Integer.parseInt("5"

                /*int prveCislo = 25;
                int druheCislo = 28;
                //prveCislo = prveCislo + druheCislo;
               //prveCislo += druheCislo;

                System.out.println(prveCislo + druheCislo);
                System.out.println(prveCislo - druheCislo);
                System.out.println(prveCislo % druheCislo);

                System.out.println(prveCislo <= druheCislo);*/


        /*int cisloKPorovnanie = 9;
        System.out.println(cisloKPorovnanie < 8 && cisloKPorovnanie <= 8);
        System.out.println(cisloKPorovnanie > 8 || cisloKPorovnanie < 0);
        System.out.println(!(cisloKPorovnanie > 8 || cisloKPorovnanie < 0));*/

        //Feature pre kontrolu veku, bude mat uzivatel 18 a viac vypis do konzoli vitaj v aplikacii
        /*int vek;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadaj svoj vek");
        vek = mujScanner.nextInt();

        if (vek >= 18) {
            System.out.println("Uzivatel je dospely");
             if (vek >= 65) {
                System.out.println("Si stary kokot");
            }
        }

         else if (vek >= 0 && vek < 18) {
            System.out.println("LaPolicia nononono");
        }

        else  {
            System.out.println("Neda sa nicht error 404");
        }*/

       //Vypocet BMI hmotnost {kg} /vyska na druhu
        // (<18.5) - podvaha
        // (>=18.5 && >25) - optimalna vaha
        // (>=25) - nadvaha

        /*float vyska;
        float hmotnost;
        float BMI;

        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadaj vysku(m):");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadaj vahu(kg):");
        hmotnost = mujScanner.nextFloat();
        BMI = hmotnost / (vyska * vyska);

        if(BMI < 18.5f) {
            System.out.println("Uzivatel ma podvahu");
        }
        else if (BMI>=18.5f && BMI<25) {
            System.out.println("Uzivatel ma optimalnu vahu");
        }
        else if (BMI>=25) {
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Uzivatel zadal zapornu nadvahu");
        }

        System.out.println(BMI);*/


        //Liche cislo = vyhrava, Sude cislo = prehral

        int hodeneCislo;
        Random nahodnyGenerator = new Random();

        hodeneCislo = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hodene cislo je:" + hodeneCislo);

        if (hodeneCislo % 2 == 1) {
            System.out.println("Licha - Vyhravas!");
        }
        else {
            System.out.println("Suda - Prehravas");
        }


    }

    }
