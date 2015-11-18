package eecs_448_lab9;

import java.util.ArrayList;
import java.util.List;

public class Mathematics {

    private int value1, value2, value3;
    private double weight, height;

    /**
     * Constructor to get the values for addition, subtraction and randomList method
     * 
     * @param value1
     * @param value2
     * @param value2
     */
    public Mathematics(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    /**
     * Constructor to get weight and height for bmiCalculator method
     * 
     * @param weight
     * @param height
     */
    public Mathematics(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * Method to add two values
     * 
     * @return addition of two values
     */
    public int addition() {
        return (value1 + value2 + value3);
    }

    /**
     * Method to subtract two values
     * 
     * @return difference between two values
     */
    public int subtraction() {
        if (value1 >= value2) {
            return (value1 - value2);
        } else {
            return (value2 - value1);
        }
    }

    /**
     * Method to find the BMI for a given weight and height. 
	 * height = (MIN - 0 inch / MAX - 100 inches) 
	 * weight = (MIN - 0 Pound / MAX - 950 pounds)
     * 
     * @return the BMI level
     */
    public String bmiCalculator() {

        if ((weight <= 0 || weight > 950) && (height <= 0 || height > 100)) {
            return "ENTER PROPER WEIGHT AND HEIGHT";
        } else if (weight <= 0 || weight > 950) {
            return "ENTER THE WEIGHT BETWEEN 0 & 950 POUNDS";
        } else if (height <= 0 || height > 100) {
            return "ENTER THE HEIGHT BETWEEN 0 & 90 INCHES";
        }

        double bmiValue = ((weight * 703) / (height * height)); // Formula to calculate BMI Index
        System.out.println("BMI Value is: " + bmiValue);

        if (bmiValue >= 30) {
            return "OBESE";
        } else if (bmiValue >= 25 && bmiValue <= 29.9) {
            return "OVERWEIGHT";
        } else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
            return "NORMAL";
        } else if (bmiValue < 18.5) {
            return "UNDERWEIGHT";
        }

        return "NOT A VALID ENTRY";
    }

    /**
     * Method to generate list of all the three values sent in.
     * 
     * @return List of Integers or null when one of the value is 0
     */
    public List<Integer> randomList() {
        List<Integer> randomList = new ArrayList<Integer>();
        if (value1 != 0 && value2 != 0 && value3 != 0) {
            randomList.add(value1);
            randomList.add(value2);
            randomList.add(value3);
            return randomList;
        }
        return null;
    }
}