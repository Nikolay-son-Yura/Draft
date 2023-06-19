package lesson3.Task5;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> numTest1=(x,y)->(x*y);
        System.out.println(numTest1.apply(3,5));
    }
}
