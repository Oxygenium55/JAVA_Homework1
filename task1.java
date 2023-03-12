// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter any number, please: ");
        int n = num.nextInt();
        num.close();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }

        System.out.println("Треугольное число " + n + " равно " + sum + ". Факториал " + n + " равен " + factorial);
    }
}
