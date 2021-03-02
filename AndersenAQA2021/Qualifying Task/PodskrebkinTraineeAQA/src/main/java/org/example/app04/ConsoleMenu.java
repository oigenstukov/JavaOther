package org.example.app04;

import java.util.Scanner;

public class ConsoleMenu {

    public static void start() {
        mainMenu();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("Choose sequence:");
            System.out.println("1. [((())()(())]];");
            System.out.println("2. enter your;");
            System.out.println("0. exit program.");
            int a = intChecker();
            switch (a) {
                case 1:
                    sequenceCheckMenu("[((())()(())]]");
                    break;
                case 2:
                    sequenceCheckMenu(enterYourSequenceMenu());
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Wrong item. Choose another...");
            }
        }
    }

    private static void sequenceCheckMenu(String s) {
        while (true) {
            System.out.printf("Your sequence: '%s'\n", s);
            System.out.println("1. check;");
            System.out.println("2. change;");
            System.out.println("0. back.");
            int a = intChecker();
            switch (a) {
                case 1:
                    System.out.println(printResult(sequenceCheck(s)));
                    break;
                case 2:
                    s = enterYourSequenceMenu();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Wrong item. Choose another...");
            }
        }
    }

    private static String enterYourSequenceMenu() {
        while (true) {
            System.out.println("Enter your sequence(or 0 to go to main menu):");
            Scanner in = new Scanner(System.in);
            String s = in.next();
            try {
                int a = Integer.parseInt(s);
                if (a == 0) {
                    return "";
                }
            } catch (IllegalArgumentException ignore) {}
            if (bracketCheck(s)) {
                return s;
            }
        }
    }

    private static boolean bracketCheck(String str) {
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c != '(' && c != ')'
                    && c != '[' && c != ']') {
                System.err.println("Not a bracket sequence!");
                return false;
            }
        }
        return true;
    }

    public static boolean sequenceCheck(String sequence) {
        if (sequence.isEmpty()) {
            System.err.println("Sequence is empty!");
            return false;
        }
        while (true) {
            int length = sequence.length();
            sequence = sequence.replaceAll("\\(\\)", "");
            sequence = sequence.replaceAll("\\[]", "");
            if (length == sequence.length()) {
                break;
            }
        }
        return sequence.isEmpty();

    }

    private static int intChecker() {
        int a = -1;
        try {
            Scanner sc = new Scanner(System.in);
            a = Integer.parseInt(sc.next());
            return a;
        } catch (IllegalArgumentException e) {
            return a;
        }
    }

    private static String printResult(boolean b) {
        return b ? "Correct bracket sequence!" : "Incorrect bracket sequence!";
    }
}
