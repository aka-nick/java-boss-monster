package bossmonster.io;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public static String readLine() {
        if (Objects.isNull(scanner)) {
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }

}
