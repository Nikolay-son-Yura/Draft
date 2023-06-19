package lesson5.Task1;

import lesson5.Task1.MVP.Presenter;
import lesson5.Task1.MVP.View;
import lesson5.Task1.MatheModel.MatheModel;

public class Program {
    public static void main(String[] args) {
        Presenter<MatheModel> p =new Presenter<>(new MatheModel(),new View());
        p.buttonClick();
    }
}
