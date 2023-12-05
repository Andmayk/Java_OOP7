package model;

public class GenActionDiv implements GenAction {
        @Override
        public Action createAction() {
            return new ActionDiv();
        }
    }
