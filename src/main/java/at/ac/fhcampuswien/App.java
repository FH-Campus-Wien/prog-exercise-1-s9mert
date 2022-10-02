package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // ’Z’, 0xface, 012, 80L, 44e-1f, 5.5f, 8.88e1 und 99.9
        char input1 = 'Z';
        int input2 = 0xface;
        int input3 = 012;
        long input4 = 80L;
        float input5 = 44e-1f;
        float input6 = 5.5f;
        double input7 = 8.88e1;
        double input8 = 99.9;
        int sum = (int) (input1) + input2 + input3 + (int) input4 + (int) input5 + (int) input6 + (int) input7 + (int) input8;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + y);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n1 < n2) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();
        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commissionClass = scanner.nextInt();
        System.out.println("Your Commission Rate was set to " + (commissionClass == 1 ? 0.01 : commissionClass == 2 ? 0.02 : commissionClass == 3 ? 0.03 : commissionClass == 4 ? 0.04 : 0));
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Invalid Number");
        } else {
            System.out.println(number % 10 * 100 + number / 10 % 10 * 10 + number / 100);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}