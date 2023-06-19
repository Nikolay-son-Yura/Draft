package lesson4.Task2;

public class Program {
    public static void main(String[] args) {
        Numeric<Integer> a=new Numeric<>(5);
        System.out.println("Обратная величена а = "+a.doubReturn());
        System.out.println("Дробная часть а = "+a.intReturn());

        Numeric<Double> b=new Numeric<>(8.6);
        System.out.println("Обратная величена а = "+b.doubReturn());
        System.out.printf("Дробная часть b = %.2f\n",b.intReturn());

        Numeric<Double> d=new Numeric<Double>(-1.25);
        Numeric<Integer> e=new Numeric<Integer>(-6);
        Numeric<Long> f=new Numeric<Long>(5l);
        Numeric<Float> c=new Numeric<Float>(1.25f);
//        if (e.absEquel(f)) System.out.println("абсалютные значения совподают");
//        else System.out.println("абсалютные значения различаются");

        System.out.println("абсалютные значения "+(e.absEquel(f)?"": "не")+" совподают");
    }
}
