
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] numbers = new int [] {1, 2 , 3};
        double [] fractionalNumber = {1.57, 7.654, 9.986};
        int [] numbersArbitrary = new int [] {5, 3, 8};

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(fractionalNumber).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(numbersArbitrary).replace("[", "").replace("]", ""));

        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = fractionalNumber.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(fractionalNumber[i] + ", ");
            } else {
                System.out.print(fractionalNumber[i]);
            }
        }
        System.out.println();
        for (int i = numbersArbitrary.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbersArbitrary[i] + ", ");
            } else {
                System.out.print(numbersArbitrary[i]);
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers [i] % 2 == 1) {
                numbers[i] = numbers[i] + 1;
            }
        }
            {
            System.out.print(Arrays.toString(numbers));
            }
    }
}




