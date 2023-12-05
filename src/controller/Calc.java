package controller;

import model.CalcData;
import view.CalcViewOnConsole;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Calc {
    public void start() throws IOException {
        Logger logger = Logger.getLogger(Calc.class.getName());
        logger.setLevel(Level.WARNING);
        FileHandler flog = new FileHandler("F:\\Java\\oop7\\OOPSeminar7_HW\\src\\Calc.log",true);
        SimpleFormatter sFormat = new SimpleFormatter();
        flog.setFormatter(sFormat);
        logger.addHandler(flog);

        logger.info("Start calculator" );

        CalcData calcData = new CalcData();

        CalcViewOnConsole calcViewOnConsole = new CalcViewOnConsole();
        calcViewOnConsole.ShowCalc();

        do {
            calcViewOnConsole.ShowMessage("Введите первое число ");
            calcData.setNum1(getNumber());
            logger.info("Input first number " + calcData.getNum1());

            calcViewOnConsole.ShowAction(calcData.getActionS());
            String act = getAction();

            while (!validAction(act,calcData.getActionS())){
                logger.log(Level.WARNING,"Incorrect input action \"" + act+"\"");
                calcViewOnConsole.ShowMessage("Введено некорректное действие!\n");
                calcViewOnConsole.ShowAction(calcData.getActionS());
                act = getAction();
            }
            calcData.setAction(act);
            logger.info("Input action \"" + act+"\"");

            calcViewOnConsole.ShowMessage("Введите второе число ");
            float num = getNumber();
            while ((act.equals("/")) && (num==0)){
                logger.log(Level.WARNING,"Incorrect input second number for division can't \"" + num+"\"");
                calcViewOnConsole.ShowMessage("Введен некорректный делитель - на 0 делить нельзя!\n");
                calcViewOnConsole.ShowMessage("Введите второе число ");
                num = getNumber();
            }

            calcData.setNum2(num);
            logger.info("Input second number " + calcData.getNum2());

            calcViewOnConsole.ShowResult(calcData.getNum1(), calcData.getAction(), calcData.getNum2(), calcData.result());

            logger.info("Output result");

            calcViewOnConsole.ShowMessage("Продолжить вычисления ? (y/n) ");

//            next = (getAction()=="y" || getAction()=="Y");
        } while (getAction().equalsIgnoreCase("y"));
    }

    private float getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private String getAction(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private boolean validAction(String action, String[] actionS){
        boolean valid = false;
        for (String s : actionS) {
            if (action.equals(s)) {
                valid = true;
                break;
            }
        }
        return valid;
    }
}
