package lesson4.Task1;

public class Gen<T,F> {
    T ob;
    F ob2;


    public Gen(T o,F o2) {
        ob=o;
        ob2=o2;
    }
    public  T getOb(){
        return  ob;
    }
    public F getOb2(){
        return ob2;
    }
    public void showType(){
        System.out.println("Тип Т это "+ob.getClass().getName());
        System.out.println("Тип F это "+ob2.getClass().getName());
    }
}
