import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int [] inputArray1 = {500, 600, 700, 800, 900};
        int [] outputArray1 = new int [4];
        int sum = 0;
        int max = 0;
        int min = inputArray1 [0];
        for (int element : inputArray1) {
            sum = sum + element;
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        int average = sum / inputArray1.length;
        outputArray1 [0] = sum;
        outputArray1 [1] = max;
        outputArray1 [2] = min;
        outputArray1 [3] = average;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Задача №2");
        int [] inputArray2 = {1000, 1500, 2000, 2500, 3000};
        double [] outputArray2 = new double[5];
        double tax = 0.13;
        int index = 0;
        for (double salary : inputArray2) {
            outputArray2[index] = salary * tax;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println();

        System.out.println("Задача №3");
        int [] inputArray3 = {4000, 4500, 5500, 6000, 6500};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index1 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index1] = bonus > 5000;
            index1++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println();

        System.out.println("Задача №4");
        int [] inputArray4 = {210, 300, -400, -100, 900};
        boolean [] outputArray4 = {true};
        for (int remains : inputArray4) {
            if (remains < 0) {
                outputArray4 [0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println();

        System.out.println("Задача №5");
        int [] inputArray5 = {-12000, -5000, 2000, 7000, 15000};
        int month = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                month++;
            }
        }
        int [] outputArray5 = {month};
        System.out.println(Arrays.toString(inputArray5));
        System.out.println("Количество прибыльных месяцев: " + Arrays.toString(outputArray5));






    }
}