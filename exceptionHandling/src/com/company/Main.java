package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("enter an id: ");
        int user_id;
        Scanner scanner =new Scanner(System.in);

        user_id = scanner.nextInt();



        try {

            if (user_id != 1234) {
                throw new InvalidUserIdException();
            }
        } catch (InvalidUserIdException e) {
         //   System.out.println(e);
            e.printStackTrace();
        }


      /*  int a=58;
        int b=0;
        int[] c = new int[2];
        int age=15;

        try {
            if(age<18) {
                throw  new NotAdultException();
            }
        } catch (NotAdultException e){
            //e.printStackTrace();
            System.out.println(e);
        }
*/

    }
}
