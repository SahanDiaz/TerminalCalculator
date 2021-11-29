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
            if(input>0 && input<5){
                System.out.print("Enter first number : ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number : ");
                num2 = sc.nextDouble();

                switch (input){
                    case 1:
                        Add a1 = new Add();
                        System.out.println("\nAnswer : "+ a1.add(num1,num2)+ "\n");
                        break;
                    case 2:
                        Sub s1 = new Sub();
                        System.out.println("\nAnswer : "+ s1.sub(num1,num2)+ "\n");
                        break;
                    case 3:
                        Mul m1 = new Mul();
                        System.out.println("\nAnswer : "+ m1.multiply(num1,num2)+ "\n");
                        break;
                    case 4:
                        Div d1 = new Div();
                        System.out.println("\nAnswer : "+ d1.division(num1,num2)+ "\n" );
                        break;
                    default:
                        System.out.println("\nplease enter correct number !!!\n");
                        break;
                }
            }
            else {
                System.out.println("\nplease enter correct number !!!\n");
            }
        }
    }
}
