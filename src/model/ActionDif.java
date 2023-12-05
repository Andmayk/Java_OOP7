package model;

public class ActionDif implements Action{
    @Override
    public float result(float num1, float num2) {
        return num1 - num2;
    }
}
