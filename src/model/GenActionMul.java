package model;

public class GenActionMul implements GenAction {

    @Override
    public Action createAction() {
        return new ActionMul();
    }
}
