package lesson3.Task1;

public class Task1 {
    public static void main(String[] args) {
        IMyNumb myNum;//создать ссылку на экземпляр
        myNum=(y)->98.6/y;//реализация
        System.out.println(myNum.getNum(12.4));


        System.out.println(myNum.getNum(7.9));

    }
}
