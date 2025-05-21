import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nameBot("Rival", 2025);
        nameUser();
        guessAge();
        countNumber();
        testKnowledge();
    }

    static void nameBot(String name, int year) {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + year + ".");
        System.out.println("Please remind me your name.");

    }

    static void nameUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        String name = input.nextLine();
        System.out.println("What a great name you have, " + name);
    }

    static void guessAge() {
        try {
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 4 and 5");
            Scanner input = new Scanner(System.in);
            System.out.print("> ");
            int modulo3 = input.nextInt();
            System.out.print("> ");
            int modulo4 = input.nextInt();
            System.out.print("> ");
            int modulo5 = input.nextInt();

            for (int i = 0; i <= 150; i++) {
                if (i % 3 == modulo3 && i % 4 == modulo4 && i % 5 == modulo5) {
                    System.out.println("Your age is " + i + ";" + " that's a good time to start programming! ");
                    break;
                } else {

                }
            }
        } catch (Exception e) {
            System.out.println("Input not number");
        }


    }

    static void countNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("> ");
        if (input.hasNextInt()) {
            int numberUser = input.nextInt();
            for (int i = 0; i <= numberUser; i++) {
                System.out.println(i + " !");

            }
        } else {
            System.out.println("Number please");
        }
    }

    static void testKnowledge() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhy do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        System.out.print("> ");
        int choice = 0;
        do {
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice != 2) {
                    System.out.println("Please, try again.");
                } else {
                    end();
                    input.close();
                }
            } else {
                System.out.println("Input hanya berupa angka");
            }
        } while (choice != 2);

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
