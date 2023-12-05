package model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcData {
    private float num1, num2;
    private final String[] actionS = {"*","/","+","-"};
    private String action;
    public float getNum1() {
        return num1;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public float getNum2() {
        return num2;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public String[] getActionS() {
        return actionS;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public float result() throws IOException {
        Logger logger = Logger.getLogger(CalcData.class.getName());
        logger.setLevel(Level.WARNING);
        FileHandler flog = new FileHandler("F:\\Java\\oop7\\OOPSeminar7_HW\\src\\Calc.log",true);
        SimpleFormatter sFormat = new SimpleFormatter();
        flog.setFormatter(sFormat);
        logger.addHandler(flog);

        logger.info("Start calculation" );

        GenAction genAction = null;
        Action act;

        float res;

        switch (action) {
            case "*" -> genAction = new GenActionMul();
            case "/" -> genAction = new GenActionDiv();
            case "+" -> genAction = new GenActionSum();
            case "-" -> genAction = new GenActionDif();
        }
        act = genAction.createAction();
        res = act.result(num1,num2);

        logger.info("Action \""+action+"\" is complete");

        return res;
    }


}
