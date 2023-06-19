package lesson2.Task4;

public interface IMy {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
}
