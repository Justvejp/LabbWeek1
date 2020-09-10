package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {

            if (i == 42) {
                System.out.println("Answer to the Ultimate Question of Life, the Universe and Everything");

            } else if (i % 5 == 0 & i % 3 == 0) {
                System.out.println("FizzFuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Fuzz");

            } else {
                System.out.println(i);
            }
        }
    }              // av Gustav och Cuneyt
}

