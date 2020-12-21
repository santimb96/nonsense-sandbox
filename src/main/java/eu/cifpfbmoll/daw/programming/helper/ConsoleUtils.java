package eu.cifpfbmoll.daw.programming.helper;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner in = new Scanner(System.in);
    public String getUserInput(){
        System.out.println("Introduce una opción: ");
        return in.nextLine();
    }
}
