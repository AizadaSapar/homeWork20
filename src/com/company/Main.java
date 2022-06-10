package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери день недели!\nDyishomby, Shershembi, Sharshembi, " +
                "Beyshembi, Juma, Ishembi, Jekshembi");
        String weeks = scanner.nextLine().toLowerCase(Locale.ROOT);
        switch (weeks) {
            case "dyishomby":
                System.out.println(Jumalar.DYIHOMBY + " Lesson");
                break;
            case "shershembi":
                System.out.println(Jumalar.SHERSHEMBI + "Session day ");
                break;
            case "sharshembi":
                System.out.println(Jumalar.SHARSHEMBI + " Lesson");
                break;
            case "beyshembi":
                System.out.println(Jumalar.BEYSHEMBI + "Session day");
                break;
            case "juma":
                System.out.println(Jumalar.JUMA + "Lesson ");
                break;
            case "ishembi":
                System.out.println(Jumalar.ISHEMBI + "Holy day!");
                break;
            case "jekshembi":
                System.out.println(Jumalar.JEKSHEMBI + " Free time!");
            default:
                System.out.println("Ne vihodi za ramki menuy!");
        }


    }
}
