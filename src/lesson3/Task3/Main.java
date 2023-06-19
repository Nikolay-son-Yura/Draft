package lesson3.Task3;

public class Main {
    public static void main(String[] args) {
        IFunc function = (m) -> {
            int result = 1;
            m = m < 0 ? - m:m;
            for (int i = 2; i <= m ; i++) {
                if ((m % i) == 0) {
                    result = i;
                    break;
                }

            }
            return result;
        };
        System.out.printf("наименьшим ч 12= %s",function.func(12));
        System.out.println();
        System.out.printf("наименьшим ч 11= %s",function.func(11));

    }
}
