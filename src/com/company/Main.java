package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {


    public String doubleChar(String input){

        String splText[] = input.split("");

       // String doubleCharText = "";

        StringBuilder doubleCharText = new StringBuilder();

        for (int i = 0; i < splText.length; i++) {
            doubleCharText.append(splText[i]);
            doubleCharText.append(splText[i]);
        }

        return doubleCharText.toString();

    }





    public String getSandwich(String input) {
        //jam
        //xx jam yy
        //xx yy
        //xx honey yy

        int numberOfBreads = 0;


       String split[] = input.toLowerCase().split("bread", 3);

        System.out.println(split.length);

        for (int x = 0; x < split.length; x++) {
            System.out.println(split[x]);

            if (input.toLowerCase().contains("breadbread")) {
                System.out.println(true);
            }
        }




       /*
       if (split.length == 2) {
return "";
       }
           for (int x = 0; x < split.length; x++) {
               if (x != 1) {

                   split[x] = "";

               }


           }


       /* if (input.equalsIgnoreCase("jam")) {
            return "";
        }*/



        return "";
    }



    public boolean evenlySpaced(int a, int b, int c) {

      //  int maxValue = 0;

        //2 4 6

        int number[] = {a,b,c};


        Arrays.sort(number);

        int x = number[1] - number[0];
        int y = number[2] - number[1];


        if (x == y) {
            return true;
        }else {
            return false;
        }


    }


    public String nTwice(String input, int a) {





        String z = input.substring(0, a);
        String s = input.substring(input.length()-(a), input.length());






        return z+s;
    }

    public boolean endsly(String input) {

        if (input.toLowerCase().contains("ly")){



            String split[] = input.split("");



            if (split[split.length-1].equalsIgnoreCase("y") && split[split.length-2].equalsIgnoreCase("l")) {
                return true;
            }

        }

        return false;
    }


    public String stringClean(String input) {

        String split[] = input.split("");

        StringBuilder ss = new StringBuilder();

        for (int x = 0; x < split.length; x++){
            if(!ss.toString().contains(split[x])){
                ss.append(split[x]);
            }
        }

        return ss.toString();
    }

    public int fibonacci(int input) {
        return input+input;
    }


    public int superBlock(String str) {

        String split[] = str.split("");

        ArrayList<String> list = new ArrayList<String>();

        for (int x = 0; x < split.length; x++){

            list.add(split[x]);
        }



        int count = 0;

        for (int x = 0; x < list.size(); x++){

            for (int i = 0; x < list.size(); i++) {
                if (list.get(x).equalsIgnoreCase(list.get(i))) {

                    count++;

                }


            }


        }



        return count;

    }




    public static void main(String[] args) {




    }
}
