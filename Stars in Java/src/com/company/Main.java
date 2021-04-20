package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sqaure:");
        printsSquare(4);
        System.out.println("---------------------------------------");
        System.out.println("Left Increasing Triangle:");
        printsLeftIncreasingTriangle(4);
        System.out.println("---------------------------------------");
        System.out.println("Left Decreasing Triangle:");
        printsLeftDecreasingTriangle(4);
        System.out.println("---------------------------------------");
        System.out.println("Right Increasing Triangle:");
        printsRightIncreasingTriangle(4);
        System.out.println("---------------------------------------");
        System.out.println("Right Decreasing Triangle:");
        printsRightDecreasingTriangle(4);
        System.out.println("---------------------------------------");
        System.out.println("Hill:");
        printsHill(4);
        System.out.println("---------------------------------------");
        System.out.println("Reverse Hill:");
        printsReverseHill(4);
        System.out.println("---------------------------------------");
    }

    // "i" represents rows
    // "j" represents columns

    //Square
    public static void printsSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Increasing Triangle
    public static void printsLeftIncreasingTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Decreasing Triangle
    public static void printsLeftDecreasingTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right Increasing Triangle
    public static void printsRightIncreasingTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right Decreasing Triangle
    public static void printsRightDecreasingTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hill
    public static void printsHill(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Reverse Hill
    public static void printsReverseHill(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<size;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=size;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


