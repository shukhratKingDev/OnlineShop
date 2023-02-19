package uz.company.asaxiy.domain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "";
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int[] numbers = new int[(number + "").length()];
        int reminder;
        int counter = (number + "").length();
        while (number > 0) {
            reminder = number % 10;
            number -= reminder;
            number /= 10;
            numbers[counter - 1] = reminder;
            counter--;
        }
        System.out.println(str);
    }
}