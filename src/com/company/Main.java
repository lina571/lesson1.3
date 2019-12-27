package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
final String CONST = "Hello";
String lina = "World!";
        System.out.println(CONST +" "+lina);


        System.out.println("здравствуйте меня зовут Лина");
        System.out.println("как вас зовут?");
        Scanner enter = new Scanner(System.in);
        String name = enter.nextLine();
        System.out.println("здравствуйте "+name);


    }
}
