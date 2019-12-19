package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String a = input.next();
	    String reverse = "";
	    a = a.toLowerCase();

        for (int i = a.length()-1; i >= 0; i--)
        {
            reverse = reverse + a.charAt(i);
        }

        if (a.equals(reverse))
        {
            System.out.println("This string is a palindrome.");
        }
        else
        {
            System.out.println("This string is not a palindrome.");
        }
    }
}
