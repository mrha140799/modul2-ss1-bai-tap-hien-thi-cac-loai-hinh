package SS1BT5;

import java.util.Scanner;

public class HienThiHinh {

    public static void main(String[] args) {
        int choise;
        Scanner scn = new Scanner(System.in);
        boolean t = true;
        while (t) {
            menu();
            choise = scn.nextInt();
            switch (choise) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("see you later ! ");
                    t = false;
            }
        }
    }

    private static void printIsoscelesTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("height : ");
        int height = scn.nextInt();
        for (int i = height; i > 0; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSquareTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("height : ");
        int height = scn.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRectangle() {
        Scanner scn = new Scanner(System.in);
        System.out.println("weight : ");
        int weight = scn.nextInt();
        System.out.println("height : ");
        int height = scn.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void menu() {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("    ---> Enter your choise : ");
    }
}
