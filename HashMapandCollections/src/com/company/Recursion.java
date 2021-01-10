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

    public static int summation(int n) {
        //base case
        if(n<=0) {
            return 0;
        } else {
            //recursive case
           return n + summation(n-1);
        }
    }

    public static int factorial(int n) {
        if(n<=1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    //8^4 =8 * 8 * 8 * 8
    public static long exponentiation(int n, int p) {
        if(p<=0) {
            return 1;
        }
        else{
                return n * exponentiation(n,p-1);
        }
    }


}
