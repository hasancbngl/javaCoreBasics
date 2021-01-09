package com.company;

public class Recursion {

    /*f(f(f(a))) ====> a = 20
    f(a) = 5 + a
    f(20) = 5 + 20=25 => f(20)=25

    f(f(f(20))) ===> f(f(25))
    f(25) =  5+ 25 = 30

    f(f(f(20))) ===> f(f(25)) => f(30)
    f(30) = 5 +30 = 35

    f(f(f(20))) ===> f(f(25)) => f(30) =>35
    */

    public static int Summation(int n) {
        //base case
        if(n<=0) {
            return 0;
        } else {
            //recursive case
           return n + Summation(n-1);
        }
    }


    public static int Factorial(int n) {
        if(n<=1) {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }

    }


}
