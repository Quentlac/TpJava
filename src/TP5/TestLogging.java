package TP5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestLogging {

    private static Logger LOGGER = Logger.getLogger("Logger");

    static {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("conf/debug.logging.properties"));
        }
        catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Cannot read configuration file", e);
        }

    }

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Mon premier log !");

        final Random random = new Random();

        int dividende = random.nextInt(10);
        int diviseur = random.nextInt(3);

        try {
            division(dividende, diviseur);
        }
        catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "Le message d'exception : " + e);
        }

    }

    private static float division(int a, int b) throws ArithmeticException {
        LOGGER.log(Level.WARNING, "Attention à une division par zéro peut se produire");

        float result;

        result = a / b;

        LOGGER.log(Level.INFO, "dividende = {0}, diviseur = {1} et quotient = {2}", new Object[] {a, b, result});

        return result;
    }

}
