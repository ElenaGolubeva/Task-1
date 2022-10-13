package com.company;

public class Main {

    public static int remainder(int c, int d){
        return c%d;
    }

    public static double triArea(int c, int d){
        return 0.5*c*d;
    }

    public static int animals(int chickens, int cows, int pigs){
        int chickensLegs=2*chickens;
        int cowsLegs=4*cows;
        int pigsLegs=4*pigs;

        return chickensLegs+cowsLegs+pigsLegs;
    }

    public static boolean profitableGamble(double prob, double prize, double pay){
        if (prob*prize>pay){
            return true;
        } else {
            return false;
        }
    }

    public static String operation(double N, int a, int b){
        if (a+b==N){
            return "added";
        } else if (a-b==N){
            return "subtracted";
        } else if (a*b==N){
            return "multiplication";
        } else if (a/b==N){
            return "division";
        } else{
            return "none";
        }
    }

    public static int ctoa(char x){
        int ascii = x;
        return ascii;
    }

    public static int addUpTo(int x){
        int rez=0;
        for (int i=1; i<=x; i++){
            rez+=i;
        }
        return rez;
    }

    public static int nextEdge(int a,int b){
        return a+b-1;
    }

    public static int sumOfCubes(int [] array){
        int rez=0;
        for (int i=0; i<array.length; i++){
            rez= rez+array[i]*array[i]*array[i];
        }
        return rez;

    }
    public static boolean abcmath(int a,int b,int c){
        int rez=0;
        for (int i=0; i<=b; i++){
            rez=rez+a;
            a=rez;
        }

        if (rez%c==0)
            return true;

        return false;
    }
    public static void main(String[] args) {

        System.out.println("Zadanie 1");
        System.out.println(remainder(1,3));
        System.out.println(remainder(3,4));
        System.out.println(remainder(-9,45));
        System.out.println(remainder(5,5));

        System.out.println("Zadanie 2");
        System.out.println(triArea(3,2));
        System.out.println(triArea(7,4));
        System.out.println(triArea(10,10));

        System.out.println("Zadanie 3");
        System.out.println(animals(2,3, 5));
        System.out.println(animals(1,2, 3));
        System.out.println(animals(5,2, 8));

        System.out.println("Zadanie 4");
        System.out.println(profitableGamble(0.2,50, 9));
        System.out.println(profitableGamble(0.9,1, 2));
        System.out.println(profitableGamble(0.9,3, 2));

        System.out.println("Zadanie 5");
        System.out.println(operation(24,15, 9));
        System.out.println(operation(24,26, 2));
        System.out.println(operation(15,11, 11));

        System.out.println("Zadanie 6");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));

        System.out.println("Zadanie 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));

        System.out.println("Zadanie 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));

        System.out.println("Zadanie 9");
        System.out.println(sumOfCubes(new int []{1, 5, 9}));
        System.out.println(sumOfCubes(new int []{3, 4, 5}));
        System.out.println(sumOfCubes(new int []{2}));
        System.out.println(sumOfCubes(new int []{}));

        System.out.println("Zadanie 10");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5,2, 1));
        System.out.println(abcmath(1,2, 3));

    }




}
