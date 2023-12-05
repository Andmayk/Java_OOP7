package model;

public class GenActionDif implements GenAction {
    @Override
    public Action createAction() {
        return new ActionDif();
    }
}
