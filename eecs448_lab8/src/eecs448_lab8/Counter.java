package eecs448_lab8;

public class Counter {

    private int result = 0;

    public int getResult() {
        return result;
    }

    public void count(int countValue) {
        for (int i = 0; i < countValue; i++) {
            result += i + 1;
        }
    }
}