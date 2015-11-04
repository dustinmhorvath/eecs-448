package eecs448_lab8;

import java.util.Scanner;

public class Mathematics {

    public static void main(String[] args) {
        double value1, value2, sum, difference, product, division;
        Mathematics math = new Mathematics();
        System.out.println("Enter the first number:");
        Scanner val1 = new Scanner(System.in);
        value1 = val1.nextDouble();
        System.out.println("Enter the second number:");
        Scanner val2 = new Scanner(System.in);
        value2 = val2.nextDouble();
        difference = math.subtract(value1, value2);
        sum = math.add(value1, value2);
        product = math.multiplication(value1, value2);
        division = math.divisionMethod(value1, value2);
        Counter counter = new Counter();
        counter.count((int) (value1 + 1));
        int value3 = counter.getResult();
        System.out.println("DONE");
    }

    public double add(double a, double b) {
        return (a + b);
    }

    public double subtract(double a, double b) {
        if (a > b) {
            return (a - b);
        }

        return (b - a);
    }

    public double multiplication(double a, double b) {
        return (a * b);
    }

    public double divisionMethod(double a, double b) {
        if (a > b) {
            return (a / b);
        }
        return (b / a);
    }
}