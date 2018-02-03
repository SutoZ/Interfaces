package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ITelephone zolisPhone;
        zolisPhone = new DeskPhone(1234);
        zolisPhone.powerOn();
        zolisPhone.callPhone(1234);
        zolisPhone.answer();

        zolisPhone = new MobilePhone(2323);
        zolisPhone.powerOn();
        zolisPhone.dial(2323);

        zolisPhone.callPhone(2323);
        zolisPhone.answer();
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

        while (!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String input = scanner.nextLine();
                    values.add(index,input);
                    break;
            }
        }
        return values;
    }
}
