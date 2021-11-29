package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double num1;
     double num2;
     boolean x=true;
        Scanner sc = new Scanner(System.in);

        while (x){
            System.out.print("**********  \nCalculator \n********** \n please enter : \n1 - Addition\n2 - Substraction\n3 - Multiply\n4 - Division\n_________\nEnter Choice : ");
            int input = sc.nextInt();
            System.out.print("Enter first number : ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number : ");
            num2 = sc.nextDouble();

            switch (input){
                case 1:
                    Add a1 = new Add();
                    System.out.println("Answer : "+ a1.add(num1,num2));
                    break;
                case 2:
                    Sub s1 = new Sub();
                    System.out.println("Answer : "+ s1.sub(num1,num2));
                    break;
                default:
                    System.out.println("please enter correct number !!!");
            }
        }



    }
}
