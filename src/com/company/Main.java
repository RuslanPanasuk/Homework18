package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int y = 3;
        Scanner in = new Scanner(System.in);
	    System.out.println("Input number: ");
	    int x = in.nextInt();
	    if (x % y == 0) {
	        System.out.println("True");
            }
	    else {
            System.out.println("False");
            }
    }
}
