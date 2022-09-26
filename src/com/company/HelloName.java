package com.company;

import java.util.Scanner;

public interface HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.print(" Hello "+name );


    }
}
