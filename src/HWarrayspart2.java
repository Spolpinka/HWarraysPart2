import java.util.Arrays;
import java.util.Random;

public class HWarrayspart2 {
    public static void main(String[] args) {task1(); task2(); task3(); task4();}{

    }

    public static int[] initRandomArray(){
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000)+100_000;
        }
        return arr;
    }

    public static void task1() {
        int [] arr = initRandomArray();
        int summ = 0;
        for (int i : arr){
            summ += i;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }
    public static void task2(){
        int [] arr = initRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i :
                arr) {
            if (i >= max) {
                max = i;
            } else if (i <= min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int [] arr = initRandomArray();
        int sum = 0;
        double result = 0;
        for (int i :
                arr) {
            sum += i;
        }
        result = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        for (int i = reverseFullName.length-1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
