package lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        IBooleanTest isFactor = (n, d) -> (n % d) == 0;
        int a = 10;
        int b = 2;
        if (isFactor.BooleanTest(a, b)) {
            System.out.printf("%s является делителем %s", b, a);
        }
        System.out.println();
        if (!isFactor.BooleanTest(a, b = 3)) {
            System.out.printf("%s не является делителем %s", b, a);
        }
        System.out.println();
        IBooleanTest lessNum = (y, x) -> (y < x);
        if (lessNum.BooleanTest(a = 2, b = 10)) {
            System.out.printf("%s меньше %s", b, a);
        }
        System.out.println();
        if (!lessNum.BooleanTest(a = 3, b = 2)) {
            System.out.printf("%s не меньше %s", b, a);
        }
        System.out.println();
        IBooleanTest numEqual = (r, u) -> (r < 0 ? -r : r) == (u < 0 ? -u : u);
        if (numEqual.BooleanTest(a = 4, b = -4)) {
            System.out.printf("%s равно по модулю %s", b, a);
        }
        System.out.println();
        if (!numEqual.BooleanTest(a = 4, b = -5)) {
            System.out.printf("%s не равно по модулю %s", b, a);
        }
    }
}

