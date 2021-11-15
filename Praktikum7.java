package praktikum7;

package com.company;

import java.util.Scanner;

public class Praktikum7 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Masuk ke Sistem Parkir? Ya/No");
            char masuk = in.nextLine().charAt(0);

            if (masuk == 'Ya') {
                new Program1();
            }
            if (masuk == 'No') {
                break;
            }

        }
    }
}