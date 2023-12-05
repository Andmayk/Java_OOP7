package model;

public interface Action {
    default float result(float num1, float num2) {
        return 0;
    }
}
