package lesson3.Task7;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> numTest = x -> String.valueOf(x) + " Долларов";
        System.out.println(numTest.apply(10));
    }
}
