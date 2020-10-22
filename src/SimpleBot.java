import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Tomasz", "1988");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7. (In the following format 1 2 3)");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's ask you a simple question\nReady (Y/N)?");
        String firstAnswer = scanner.next().toUpperCase();
        int answer = 0;

        if (firstAnswer.equals("Y")) {
            System.out.println("AWESOME! Let's do it!");
        } else if (firstAnswer.equals("N")) {
            System.out.println("I don't care!");
        } else {
            System.out.println("Hey you were supposed to enter Y or N!! But it doesn't matter now!");
        }
        System.out.println("What year is it? \n1.2020\n2.2021\n3.2000\n4.1990");
        while (answer != 1) {
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}