package com.test.core;

public class Main {
    public static void main(String[] args) {
      /*
        *__*
        *__*
        *__*
    */
     /*  int n = 3;
        for (int row = 1; row < n; row++){
            System.out.print("*");

            for (int space = 1; space <=n-1; space++) {
                System.out.print("_");

            }
            System.out.println("*");
        }*/

        //n-1 space *
        //n-2 space *
        //*

   /*
      __*
      _**
      ***

    */
 /*
      int n = 3;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("_");
            }
            for (int str = 1; str <= row; str++) {

                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
            ***
            _**
            __*

         */

        int n = 3;

        for (int row = 1; row <= n; row++) {

            for ( int space = 1; space <= row - 1; space++) {
                System.out.print("_");
            }
            for (int str = 1; str<=n-row+1; str++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}



