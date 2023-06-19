package lesson2.Task4;

public class DefaultMain {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        System.out.println("ID пользователя " + c1.getUserID());
        System.out.println("ID админа " + c1.getAdminID());
    }
}
