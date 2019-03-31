package com.harism99.calculator.mm;

public class Division {
    public void div(int x, int y) {
        int z, a;
        z = x / y;
        a = x % y;
        System.out.println("Division of " + x + " and " + y + " is " + z);
        System.out.println("Reminder =" + a);
    }
}
