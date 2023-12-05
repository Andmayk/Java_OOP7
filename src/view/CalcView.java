package view;

public interface CalcView {
    void ShowCalc();
    void ShowMessage(String text);
    void ShowAction(String[] actionS);
    void ShowResult(float num1, String action, float num2, float result);
}
