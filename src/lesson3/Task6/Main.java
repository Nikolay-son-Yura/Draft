package lesson3.Task6;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> numTest1= x-> x*x;
        System.out.println(numTest1.apply(5));
    }
}
