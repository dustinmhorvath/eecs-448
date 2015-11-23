package eecs_448_lab10;

import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>Tip Calculator</h1> Has methods that provide addition and tip calculation.
 * <p>
 * <b>Note:</b> This code was not written by me, only annotated
 * 
 * @author Dustin Horvath
 * @version 1.0
 * @since 2015-11-23
 */
public class SampleJava {
    private static double totalAmount, tipPercent, tipAmount;
    private static double value1, value2;

    /**
     * Constructor that takes two values.
     * 
     * @param value1
     *            First parameter of SampleJava constructor
     * @param value2
     *            Second parameter of SampleJava constructor
     */
    public SampleJava(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * This is the main method of SampleJava. Uses tipcalculator() and addition() methods.
     * 
     * @param args
     *            Unused.
     * @return Nothing.
     * @exception IOException
     *                On input error.
     * @see IOException
     */
    public static void main(String[] args) {
        System.out.println("\nEnter the total Bill Amount: ");
        Scanner totalAmountScanner = new Scanner(System.in);
        totalAmount = totalAmountScanner.nextDouble();
        System.out.println("\nEnter the tip percentage (15% as 15), (18% as 18) or (20% as 20): ");
        Scanner tipPercentScanner = new Scanner(System.in);
        tipPercent = tipPercentScanner.nextDouble();
        SampleJava sampleJava = new SampleJava(totalAmount, tipPercent);
        tipAmount = sampleJava.tipCalculator(totalAmount);
        System.out.println("Tip Amount is: $" + tipAmount);
        boolean result = sampleJava.addition();
    }

    /**
     * Method for calculating tips. Takes a double and returns the tip amount.
     * 
     * @param totalAmount
     *            Parameter of tipCalculator method. Total cost from which to calculate tip.
     * @return double 
     * 				Returns the appropriate tip amount.
     */
    public double tipCalculator(double totalAmount) {
        if (totalAmount < 5.0) {
            throw new IllegalArgumentException("Total Amount must be greated than $5");
        } else {
            double temp = tipPercent / 100;
            tipAmount = totalAmount * temp;
            return tipAmount;
        }
    }

    /**
     * Returns false if the sum of the arguments is less than 50, and true otherwise. Relies
     * on the two values given to the constructor.
     * 
     * @return bool This returns false if the sum of stored values value1 and value2 is less than
     * 50, and returns true otherwise.
     */
    public boolean addition() {
        double sum = value1 + value2;
        if (sum < 50) {
            return false;
        } else {
            return true;
        }
    }
    
}