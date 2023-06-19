package lesson4.Task2;

public class Numeric<T extends Number> {
    T num;

    public Numeric(T n) {
        num=n;
    }
    public double doubReturn(){
        return 1/num.doubleValue();
    }
    public double intReturn(){
        return num.doubleValue()- num.intValue();
    }
    boolean absEquel(Numeric<?>a){ //Шаблон аргумента
        if(Math.abs(num.doubleValue())==Math.abs(a.num.doubleValue())) return  true;
        else return false;
    }


}
