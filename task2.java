//Вывести все простые числа от 1 до 1000

package homework1;

public class task2 {
    public static void main(String[] args) {
        int div_count = 0;
        System.out.print("Простые числа от 1 до 1000: ");
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                if (i % j == 0) {
                    div_count++;
                }
            }
            if(div_count <= 2) {
                System.out.print(i + ", ");
            }
            div_count = 0;
        }
        
    }
    
}
