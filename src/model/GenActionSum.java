package model;

public class GenActionSum implements GenAction {
    @Override
    public Action createAction() {
        return new ActionSum();
    }
}
