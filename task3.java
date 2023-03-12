// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package homework1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите оператор: (+, -, *, /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Неверное значение.");
        }
        if (operation == '/' && num2 == 0.0) {
            System.err.println("Второе число не может быть равно 0.");
        }
        switch (operation) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("Неверное значение.");
                break;
        }


    }
   }
