package lesson5.Task1.MVP;

import lesson5.Task1.MatheModel.CalcModel;

public class Presenter<T extends CalcModel> {
    View view;
    IModel model;

    public Presenter(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        double a = view.getInput("Число а: ");
        String oper = view.getInputOperator("+,-,*,/");
        double b = view.getInput("Число b: ");
        model.setA(a);
        model.setOperation(oper);
        double result = model.result(oper);
        model.setB(b);

        view.print(result, "Результат: ");
    }

}
