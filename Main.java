package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc =new Scanner(System.in);
        System.out.println("welcome to Bulls ans Cows game!");
        System.out.println("this is a logical mind game");
        System.out.println("here B means one of your guessing number is inside the hidden number and in the right place"+"\n" +
                "here C means one of your guessing number is inside the hidden number but  in the wrong place ");
        // ------------------information about our game------------------------------------
        Random random=new Random();
        int intRnd=random.nextInt(99);      //from 1 to 100
        //System.out.println("this is random value"+intRnd);
        //-----------------we get a random value--------------------------------------------
        while (intRnd<11){//only number bigger then 11
            intRnd++;
        }
        String s=String.valueOf(intRnd);
        //System.out.println("this is String value:"+s);
        //-------------converting our int value to String-------------------------------------
        char c1=s.charAt(0);
        //System.out.println("first numbre of hidden number:"+c1);
        char c2=s.charAt(1);
        //System.out.println("second  number of hidden number:"+c2);
        //----------------we separate our random value to two characters----------------------
        while (true){

        //----------------here we got input from users---------------------------

        String strRandom1=sc.nextLine();

            int input = Integer.parseInt(strRandom1);
            if(input<10){
                System.out.println("please enter two level number!!");
                continue;
            }
            char charInput1 = strRandom1.charAt(0);
            char charInput2 = strRandom1.charAt(1);

                if (input == intRnd) {
                    System.out.println("Congratulations!!");
                    return;
                }
                if (charInput1 == c1 || charInput2 == c2) {
                    System.out.println("1B,0C");
                } else if (charInput1 == c2 && charInput2 == c1) {
                    System.out.println("0B,2C");
                } else if (charInput1 == c2 || charInput2 == c1) {
                    System.out.println("0B,1C");
                } else {
                    System.out.println("0B,0C");
                }
            }
        }



    }

