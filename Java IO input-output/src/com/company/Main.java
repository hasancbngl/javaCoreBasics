package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Enter the deposit amount!");

        String depositAmount= bufferedReader.readLine();



        FileInputStream fileInputStream = new FileInputStream("balance.txt");

       int read= fileInputStream.read();
       String data="";

       while (read!=-1) {
           data += (char) read;
           read=fileInputStream.read();
       }
       fileInputStream.close();

       int total = Integer.parseInt(data) + Integer.parseInt(depositAmount);


        String newAmount = Integer.toString(total);
       byte newbyteAm[] = newAmount.getBytes();

       FileOutputStream fileOutputStream1 = new FileOutputStream("balance.txt");

       fileOutputStream1.write(newbyteAm);
       fileOutputStream1.close();

        System.out.println("updated amount: " + total);
/*

        Scanner scanner = new Scanner(new File("balance.txt"));

        String a= scanner.nextLine();

        System.out.println(a);


        //write data to the  file

        String message="This string going to add to the file mate!!";
        String text = "its done!";
        FileOutputStream fileOutputStream = new FileOutputStream("writeexample.txt");

       byte[] i= message.getBytes(); //convert it to byte
        byte j[]= text.getBytes(); //convert it to byte
        fileOutputStream.write(i);
        fileOutputStream.write(j);

        fileOutputStream.close();





        //Read data from file
        String data = "";
        FileInputStream fileInputStream = new FileInputStream("text.txt");
           int i = fileInputStream.read();
           while (i!=-1) {
               data += (char) i;
               i=fileInputStream.read();
           }

       fileInputStream.close();

        System.out.println(data.toString());

        */




      /*  InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sentence = null;
        try {
            sentence = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println(sentence);



        System.out.println(sentence);*/
    }
}
