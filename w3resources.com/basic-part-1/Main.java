import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Basic Exercise 01
        // exercise_01();

        // Basic Exercise 02
        // exercise_02();

        // Basic Exercise 03
        // exercise_03();

        // Basic Exercise 04
        // exercise_04();
        
        // Basic Exercise 05
        // exercise_05();
        
        // Basic Exercise 06
        // exercise_06();
        
        // Basic Exercise 07
        // exercise_07();
        
        // Basic Exercise 08
        // exercise_08();
        
        // Basic Exercise 09
        // exercise_09();

        // Basic Exercise 10
        exercise_10();
    }

    /**
     * Ex_01. Write a Java program to print 'Hello' on screen and your name on a
     * separate line.
     * Input: 0
     * Expected Output:
     *      Hello,
     *      Alexandra Abramov
     */
    static void exercise_01() {
        System.out.println("01. Basic Exercise 01: Start --\n");
        System.out.println("Hello,\nAlexandra Abramov!");
        System.out.println("\n-- Basic Exercise 01: End --\n");
    }

    /**
     * 2. Write a Java program to print the sum of two numbers.
     * Input: 0
     * Test Case: 74 + 36
     * Expected Output: 74 + 36 = 110
     */
    static void exercise_02() {
        System.out.println("\n02. Basic Exercise 02: Start --\n");
        System.out.println("74 + 36 = " + (74 + 36));
        System.out.println("\n-- Basic Exercise 02: End --\n");
    }

    /**
     * 3. Write a Java program to divide two numbers and print them on the screen.
     * Input: 0
     * Test Case: 50 / 3
     * Expected Output: 50 / 3 = 16
     */
    static void exercise_03() {
        System.out.println("\n03. Basic Exercise 03: Start --\n");
        System.out.println("50 / 3 = " + (50 / 3));
        System.out.println("\n-- Basic Exercise 03: End --\n");
    }

    /**
     * 4. Write a Java program to print the results of the following operations
     * Input: 0
     * Test Case:
     *      TC01: -5 + 8 * 6
     *      TC02: 55 + 9 % 9
     *      TC03: 20 + -3 * 5 / 8
     *      TC04: 5 + 15 / 3 * 2 - 8 % 3
     * Expected Output:
     *      TC01: -5 + 8 * 6 = 43
     *      TC02: 55 + 9 % 9 = 1
     *      TC03: 20 + -3 * 5 / 8 = 19
     *      TC04: 5 + 15 / 3 * 2 - 8 % 3 = 13
     */
    static void exercise_04() {
        System.out.println("\n04. Basic Exercise 04: Start --\n");
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("55 + 9 % 9 = " + ((55 + 9) % 9));
        System.out.println("20 + -3 * 5 / 8 = " + (20 + -3 * 5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
        System.out.println("\n-- Basic Exercise 04: End --\n");
    }

    /**
     * 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
     * Input: 25, 5
     * Test Case: 25 * 5
     * Expected Output: --> Result: 25 * 5 = 125
     */
    static void exercise_05() {
        System.out.println("\n05. Basic Exercise 05: Start --\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("--> Result: ");
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber + secondNumber));

        System.out.println("\n-- Basic Exercise 05: End --\n");
    }

    /**
     * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     * Input: 125, 24
     * Test Case:
     *      TC01: 125 + 24
     *      TC02: 125 - 24
     *      TC03: 125 * 24
     *      TC04: 125 / 24
     *      TC05: 125 % 24
     * Expected Output:
     *      TC01: --> TC01 Result: 125 + 24 = 149
     *      TC02: --> TC02 Result: 125 - 24 = 101
     *      TC03: --> TC03 Result: 125 * 24 = 3000
     *      TC04: --> TC04 Result: 125 / 24 = 5
     *      TC05: --> TC05 Result: 125 % 24 = 5
     */
    static void exercise_06() {
        System.out.println("\n06. Basic Exercise 06: Start --\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("--> TC01 Result: ");
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.print("--> TC02 Result: ");
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.print("--> TC03 Result: ");
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.print("--> TC04 Result: ");
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.print("--> TC05 Result: ");
        System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));       

        System.out.println("\n-- Basic Exercise 06: End --\n");
    }

    /**
     * 7. Write a Java program that takes a number as input and prints its multiplication table up to 10
     * Input: 8
     * Test Case: 8 * 1 -> 8 * 10
     * Expected Output: 8 * 1 = 8 -> 8 * 10 = 80
     */
    static void exercise_07() {
        System.out.println("\n07. Basic Exercise 07: Start --\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int index = 1;
        System.out.println("--> Multiplication table of entered number:");
        while(index <= 10) {
            System.out.println("\t" + number + " * "+  index + " = " + (number * index));
            index++;
        }

        System.out.println("\n-- Basic Exercise 07: End --\n");
    }

    /**
     * 8. Write a Java program to display the following pattern
     * Sample Pattern:
     *         J    a   v     v  a                                                  
     *         J   a a   v   v  a a                                                 
     *      J  J  aaaaa   V V  aaaaa                                                
     *       JJ  a     a   V  a     a
     */
    static void exercise_08() {
        System.out.println("\n08. Basic Exercise 08: Start --\n");

        System.out.printf("%4s%5s%4s%6s%3s\n", "J", "a", "v", "v", "a");
        System.out.printf("%4s%4s%2s%4s%4s%3s%2s\n", "J", "a", "a", "v", "v", "a", "a");
        System.out.printf("%s%3s%7s%4s%2s%7s\n", "J", "J", "aaaaa", "v", "v", "aaaaa");
        System.out.printf("%3s%3s%6s%4s%3s%6s\n", "JJ", "a", "a", "v", "a", "a");

        System.out.println("\n-- Basic Exercise 08: End --\n");
    }

    /**
     * 9. Write a Java program to compute the specified expressions and print the output
     * Input: 0
     * Test Case: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.138888888888889
     */
    static void exercise_09() {
        System.out.println("\n09. Basic Exercise 09: Start --\n");
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        System.out.println("\n-- Basic Exercise 09: End --\n");
    }

    /**
     * 10. Write a Java program to compute a specified formula
     * Input: 0
     * Test Case: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
     * Expected Output: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = 2.9760461760461765
     */
    static void exercise_10() {
        System.out.println("\n09. Basic Exercise 10: Start --\n");
        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = " + (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
        System.out.println("\n-- Basic Exercise 10: End --\n");
    }
}