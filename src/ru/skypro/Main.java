package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("");
        int i = 1;
        while (i < 11) {
            System.out.print(" " + i);
            i ++;
        }
        System.out.println("");
        for (int a = 10; a > 0; a--) {
            System.out.print(" " + a);
        }
        System.out.println("");
    // Zadanie 2
        System.out.println("");
        System.out.println("Zadanie 2");
        System.out.println("");
        for (int firstFriday = 6; firstFriday < 31; firstFriday = firstFriday + 7) {
            System.out.println("Segodnya pyatnica - " + firstFriday + " chislo. Nujen otchet");
        }

    // Zadanie 3
        System.out.println("");
        System.out.println("Zadanie 3");
        System.out.println("");
        int year = 2022;
        int futureYear = year + 100;
        int pastYear = year - 200;
        for (int comet = 0; comet <= futureYear; comet = comet + 79) {
                if (comet >= pastYear && comet <= futureYear) {
                    System.out.println(comet);
                }
        }
    }
}
