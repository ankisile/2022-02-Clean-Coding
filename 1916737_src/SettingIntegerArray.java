import java.util.Scanner;

public class SettingIntegerArray extends SettingArray {
    Scanner sc = new Scanner(System.in);

    @Override
    int getArraySize() {
        System.out.println("The number of numbers to be sorted");
        System.out.print("> ");
        return sc.nextInt();
    }

    @Override
    Object[] initializeArray(int arraySize) {
        Integer[] array = new Integer[arraySize];
        System.out.println("The numbers to be sorted");
        System.out.print("> ");
        for (int i = 0; i < arraySize; i++)
            array[i] = sc.nextInt();
        return array;
    }
}