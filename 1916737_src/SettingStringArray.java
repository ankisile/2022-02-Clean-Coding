import java.util.Scanner;

public class SettingStringArray extends SettingArray {
    Scanner sc = new Scanner(System.in);

    @Override
    int getArraySize() {
        System.out.println("The number of words to be sorted");
        System.out.print("> ");
        return sc.nextInt();
    }

    @Override
    Object[] initializeArray(int arraySize) {
        String[] array = new String[arraySize];
        System.out.println("The words to be sorted");
        System.out.print("> ");
        for (int i = 0; i < arraySize; i++)
            array[i] = sc.next();
        return array;
    }
}