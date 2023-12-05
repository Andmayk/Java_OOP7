package view;

import java.util.Arrays;

public class CalcViewOnConsole implements CalcView{

    @Override
    public void ShowCalc() {
        System.out.println("Калькулятор - введите последовательно: первое число, действие, второе число.");

    }
    @Override
    public void ShowMessage(String text) {
        System.out.print(text);
    }

    @Override
    public void ShowAction(String[] actionS) {
            StringBuilder actionString = new StringBuilder(" ");
            for (String s : actionS) {
                actionString.append(s);
                actionString.append(" ");
            }
        System.out.println("Введите действие, один из следующих знаков " + actionString);
    }

    @Override
    public void ShowResult(float num1, String action, float num2, float result) {
        System.out.printf("Результат %f %s %f = %f%n",num1, action, num2, result);
    }
}
