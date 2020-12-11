package com.company;

import java.util.Scanner;

public class FindFrequency {
    private  static String sentence;
    private static Scanner scanner;
    private static int i=0;


    public static void findLetterFrequency(){
        scanner = new Scanner(System.in);
        System.out.println("Enter a sentence!");
        sentence = scanner.nextLine();
        char sent[] = sentence.toCharArray();

        System.out.println("Enter the character you wanna find");
        char c = scanner.nextLine().charAt(0);

        for(char l:sent) {
            if(l == c) i++;
        }

        System.out.println("there's " + i + " " + c + " letter in the sentence");

            System.out.println("add the word");
            String word = scanner.nextLine();

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(sent);
            stringBuffer.append(" " + word);

            System.out.println(stringBuffer);

    }

}
