package com.harism99.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the First number =");
        n1 = numbers.nextInt();
        System.out.print("Enter the Second number =");
        n2 = numbers.nextInt();

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mult = new Multiplication();
        Division div = new Division();

        System.out.print("What you wish to do?  \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n \n Enter your decision number =");
        n3 = numbers.nextInt();

        switch (n3){
            case 1:
                add.add(n1,n2);
                break;
            case 2:
                sub.sub(n1,n2);
                break;
            case 3:
                mult.mult(n1,n2);
                break;
            case 4:
                div.div(n1,n2);
                break;
            default:
                System.out.println("You have entered an invalid number.");
        }
    }
}

class Addition{
    public void add(int x, int y){
        int z;
        z=x+y;
        System.out.println("Addition of "+x+" and "+y+" is "+z);
    }
}

class Subtraction{
    public void sub(int x, int y){
        int z;
        z=x-y;
        System.out.println("Subtraction of "+x+" and "+y+" is "+z);
    }
}

class Multiplication{
    public void mult(int x, int y){
        int z;
        z=x*y;
        System.out.println("Multiplication of "+x+" and "+y+" is "+z);
    }
}

class Division{
    public void div(int x, int y){
        int z,a;
        z=x/y;
        a=x%y;
        System.out.println("Division of "+x+" and "+y+" is "+z);
        System.out.println("Reminder ="+a);
    }
}
