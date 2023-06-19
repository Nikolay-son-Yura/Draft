package lesson3.Task4;

public class Main {
    public static void main(String[] args) {
        Predicate1<Integer> isName = x -> x > 0;
        System.out.println(isName.test(5));
        System.out.println(isName.test(-7));
        Predicate1<Double> isName1 = x -> x > 0;
        System.out.println(isName1.test(5.2));
    }
}
