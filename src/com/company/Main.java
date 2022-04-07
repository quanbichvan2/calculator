package com.company;
import java.util.Scanner;
public class Main {
    public static boolean cal() {
        boolean mode;
        Scanner choice = new Scanner(System.in);
        while (true) {
            System.out.println("press 1 to choice calculator basic and press 2 to calculate the area and perimeter ");
            int a = choice.nextInt();
            if (a == 1) {
                System.out.println("The basic calculator on");
                mode = true;
                break;
            } else if (a == 2) {
                mode = false;
                System.out.println("The calculator of the area and perimeter on");
                break;
            } else {
                System.out.println("press again 1 or 2.");
            }
        }
        return mode;
    }
    public static float both(boolean flag){
        float a;
        Scanner number = new Scanner(System.in);
        if(true){
            System.out.print("The number: ");
        }
        else {
            System.out.print("The number: ");
        }
        a = number.nextInt();
        return a;
    }

    public static void main(String[] args) {
        float sum;
        boolean choice = cal();
        if (choice){
            while (true) {
                System.out.println("press + - * / to use the calculator ");
                Scanner kytu = new Scanner(System.in);
                String chars = kytu.nextLine();
                if (chars.equals("+")) {
                    while (true) {
                        System.out.println("Find the sum of A and B: ");
                        float a = both(true);
                        float b = both(false);
                        sum = a + b;
                        System.out.println("the sum is:" + sum);
                        System.out.println("press 1 to continue and 2 or else to cancel the calculation");
                        Scanner choice2 = new Scanner(System.in);
                        int theWay = choice2.nextInt();
                        switch (theWay) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                return;
                            }
                        }
                    }
                }
                else if (chars.equals("-")) {
                    while (true) {
                        System.out.println("Find the subtract of A and B: ");
                        float a = both(true);
                        float b = both(false);
                        sum = a - b;
                        System.out.println("the sum is:" + sum);
                        System.out.println("press 1 to continue and 2 or else to cancel the calculation");
                        Scanner choice2 = new Scanner(System.in);
                        int theWay = choice2.nextInt();
                        switch (theWay) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                return;
                            }
                        }
                    }
                }
                else if (chars.equals("*")) {
                    while (true) {
                        System.out.println("Find the multiplication of A and B: ");
                        float a = both(true);
                        float b = both(false);
                        sum = a * b;
                        System.out.println("the sum is:" + sum);
                        System.out.println("press 1 to continue and 2 or else to cancel the calculation");
                        Scanner choice2 = new Scanner(System.in);
                        int theWay = choice2.nextInt();
                        switch (theWay) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                return;
                            }
                        }
                    }
                }
                else if (chars.equals("/")){
                    System.out.println("Find the divide of A and B: ");
                    float a = both(true);
                    float b = both(false);
                    sum = a / b;
                    System.out.println("the sum is:" + sum);
                    System.out.println("press 1 to continue and 2 or else to cancel the calculation");
                    Scanner choice2 = new Scanner(System.in);
                    int theWay = choice2.nextInt();
                    switch (theWay) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            return;
                        }
                    }
                }
                else {
                    System.out.println("choice again");
                }
            }
        }
        else {
            while (true) {
                System.out.println("press to find the Area: 1 is triangle area, 2 is square area, 3 is rectangular area.");
                Scanner choice2 = new Scanner(System.in);
                int theWay = choice2.nextInt();
                switch (theWay) {
                    case 1: {
                        System.out.println("Find the triangle area: ");
                        float a = both(true);
                        float b = both(false);
                        sum = a+b;
                        float triangleArea = (float) (0.5*sum);
                        System.out.println("the triangleArea is:" + triangleArea);
                        System.out.println("press 1 to continue find the perimeter and 2 or else to cancel the calculation");
                        Scanner choice3 = new Scanner(System.in);
                        int perimeter = choice3.nextInt();
                        switch (perimeter) {
                            case 1: {
                                System.out.println("Find the perimeter of the triangle: ");
                                float c = both(true);
                                float d = both(false);
                                Scanner bottomEdge = new Scanner(System.in);
                                System.out.println("The bottom edge of the triangle area is: ");
                                int e = bottomEdge.nextInt();
                                sum = c+d+e;
                                int perimeterOfTriangle = (int) (0.5*sum);
                                System.out.println("the triangleArea is:" + perimeterOfTriangle);
                                break;
                            }
                            case 2: {
                                return;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Find the square area: ");
                        float a = both(true);
                        sum = a*a;
                        System.out.println("the square is:" + sum);
                        System.out.println("press 1 to continue find the perimeter and 2 or else to cancel the calculation");
                        Scanner choice3 = new Scanner(System.in);
                        int perimeter = choice3.nextInt();
                        switch (perimeter) {
                            case 1: {
                                float b = both(true);
                                sum = b*4;
                                System.out.println("the perimeter of square is:" + sum);
                            }
                            case 2:{
                                break;
                            }
                        }
                     break;
                    }
                    case 3: {
                        System.out.println("Find the rectangular area: ");
                        float a = both(true);
                        float b = both(false);
                        sum = a*b;
                        System.out.println("the triangleArea is:" + sum);
                        System.out.println("press 1 to continue find the perimeter and 2 or else to cancel the calculation");
                        Scanner choice3 = new Scanner(System.in);
                        int perimeter = choice3.nextInt();
                        switch (perimeter) {
                            case 1: {
                                System.out.println("Find the perimeter of rectangular area: ");
                                float c = both(true);
                                float d = both(false);
                                sum = c+d;
                                float perimeterOfRectangular = (float) (0.5*sum);
                                System.out.println("the triangleArea is:" + perimeterOfRectangular);
                            }
                            case 2:{
                            break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        }
    }
// tổng 2 số

