package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }

        for(int j=0;j<numbers.length;j++) {
           System.out.println(numbers[j]);
        }







            /*
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Monday"); break;
                case 2:
                    System.out.println("tuesday"); break;
                case 3:
                    System.out.println("wednesday"); break;
                case 4:
                    System.out.println("thursday"); break;
                case 5:
                    System.out.println("friyday"); break;
                case 6:
                    System.out.println("saturday"); break;
                case 7:
                    System.out.println("sunday"); break;

                default: System.out.println("Please enter a number 1-7"); break;
            }

        int numbersArray[][] =new int[4][4];

        int a=1;

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                numbersArray[i][j]=a;
                a++;
            }
        }


        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(numbersArray[i][j] + " ");
            }
            System.out.println("");
        }

        int numbers[] = {1,2,5,8,9,6,7,4,3,258,963,24,51,74,55,58,63,71,98,224};
        int odd[] = new int[10];
        int even[] = new int[10];

        int i=0;
        int j=0;
        for(int x:numbers) {
            if(x%2==1){
                odd[i]=x;
                i++;
            } else {
                even[j]=x;
            j++;}

        }

        for(int y:even) {
            System.out.println(y);
        }

        write your code here
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        System.out.println(number*5);  */


    }
}
