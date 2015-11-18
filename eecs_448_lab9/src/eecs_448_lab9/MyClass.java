package eecs_448_lab9;

public class MyClass {
    public int multiply(int x, int y) {
        // the following is just an example
        if (x > 999) {
             throw new IllegalArgumentException("Invalid X value");
        }
        return x / y;
     }
} 
