package baitapthem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tram, chuc, donVi, dem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");

        int number = scanner.nextInt();
        tram = number / 100;
        chuc = (number % 100) / 10;
        donVi = (number % 100) % 10;
        System.out.printf("%d tram %d chuc %d donvi", tram, chuc, donVi);

    }
}



