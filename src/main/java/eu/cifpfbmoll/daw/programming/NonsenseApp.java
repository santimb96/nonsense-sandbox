package eu.cifpfbmoll.daw.programming;



import eu.cifpfbmoll.daw.programming.helper.ConsoleUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NonsenseApp {
    private static final CharSequence EXIT_KEY = "9";

    public static void main(String[] args) {
        //boolean aux = StringUtils.equals("a", "A");
        //System.out.println("hola mundo!" + aux);
        //Scanner in =new Scanner (System.in);
        ConsoleUtils consoleUtils = new ConsoleUtils();
        boolean isExit = false;
        while(!isExit){
            //System.out.println("Introduce una opción; ");
        String s = consoleUtils.getUserInput();
        System.out.println("Has metido "+s);
        isExit = StringUtils.equals(s, EXIT_KEY);
        }

        System.out.println("END");

    }
}
