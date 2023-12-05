import controller.Calc;

import java.io.IOException;
import java.util.logging.*;

//      Создать проект калькулятора вещественных чисел (достаточно сделать сложение, умножение и деление).
//      Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
//      Соблюдать принципы SOLID, паттерны проектирования.

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler flog = new FileHandler("calc.log",true);
        SimpleFormatter sFormat = new SimpleFormatter ();
        flog.setFormatter(sFormat);
        logger.setLevel(Level.INFO);
        logger.addHandler(flog);

        logger.info("Start application" );

        Calc calc = new Calc();
        calc.start();

        logger.info("End application" );
    }
}
