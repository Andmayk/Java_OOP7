package model;

public class ActionSum implements Action{
    @Override
    public float result(float num1, float num2) {
        return num1 + num2;
    }
}
