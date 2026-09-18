/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ValidasiInput {

    private Scanner scanner;

    // Constructor
    public ValidasiInput(Scanner scanner) {
        this.scanner = scanner;
    }

    // Validasi input String
    public String inputString(
            String pesan,
            int min,
            int max) {

        String input;

        do {

            System.out.print(pesan);
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {

                System.out.println(
                        "Input tidak boleh kosong."
                );

            } else if (input.length() < min) {

                System.out.println(
                        "Input minimal "
                        + min
                        + " karakter."
                );

            } else if (input.length() > max) {

                System.out.println(
                        "Input maksimal "
                        + max
                        + " karakter."
                );
            }

        } while (
                input.isEmpty()
                || input.length() < min
                || input.length() > max
        );

        return input;
    }

    // Validasi input Integer
    public int inputInteger(
            String pesan,
            int min,
            int max) {

        int angka;

        do {

            System.out.print(pesan);

            while (!scanner.hasNextInt()) {

                System.out.println(
                        "Input harus berupa angka."
                );

                scanner.next();

                System.out.print(pesan);
            }

            angka = scanner.nextInt();

            if (angka < min || angka > max) {

                System.out.println(
                        "Input harus berada di antara "
                        + min
                        + " sampai "
                        + max
                        + "."
                );
            }

        } while (
                angka < min
                || angka > max
        );

        return angka;
    }

    // Validasi input Double
    public double inputDouble(
            String pesan,
            double min,
            double max) {

        double angka;

        do {

            System.out.print(pesan);

            while (!scanner.hasNextDouble()) {

                System.out.println(
                        "Input harus berupa angka."
                );

                scanner.next();

                System.out.print(pesan);
            }

            angka = scanner.nextDouble();

            if (angka < min || angka > max) {

                System.out.println(
                        "Input harus berada di antara "
                        + min
                        + " sampai "
                        + max
                        + "."
                );
            }

        } while (
                angka < min
                || angka > max
        );

        return angka;
    }
}