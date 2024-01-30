package org.example;

import java.util.Scanner;

public class z1 {
    public static void Characters(String input) {
    for (char c : input.toCharArray()) {
        System.out.println(c);
    }
//ЗАдание 2
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();

            int sumDig = 0;
            for (char c : inputString.toCharArray()) {
                if (Character.isDigit(c)) {
                    sumDig += Character.getNumericValue(c);
                }
            }

            System.out.println("Сумма цифр в строке: " + sumDig);


}

}
