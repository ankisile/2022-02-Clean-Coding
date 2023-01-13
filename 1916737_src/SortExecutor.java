import java.util.Scanner;

public class SortExecutor {
    Scanner sc = new Scanner(System.in);
    int menu;
    int sortingOrder;

    public void runSortingProgram() {
        while (true) {
            menu = getInitialMenu();
            if (isQuit(menu))
                return;
            int sortingAlgorithm = getSortingAlgorithm();
            sortingOrder = getSortingOrder();
            SettingArray settingArray = getSettingArrayType(menu);
            Object[] array = settingArray.declareArray();
            array = excuteSorting(array, sortingAlgorithm);
            printResult(array);
        }
    }

    private int getInitialMenu() {
        printMenu();
        return sc.nextInt();
    }

    private void printMenu() {
        System.out.println("[ ID: 1916737 ]");
        System.out.println("[ Name: 송민영 ]\n");
        System.out.println("[ 1. Sort numbers ]");
        System.out.println("[ 2. Sort words ]");
        System.out.println("[ 3. Quit ]");
        System.out.print("> ");
    }

    private boolean isQuit(int menu) {
        if (menu == 3)
            return true;
        return false;
    }

    private int getSortingAlgorithm() {
        System.out.println("Select a sorting algorithm");
        System.out.println("1. Bubble sort");
        System.out.println("2. Merge sort");
        System.out.print("> ");
        return sc.nextInt();
    }

    private int getSortingOrder() {
        System.out.println("Select the sort order");
        System.out.println("1. Ascending order");
        System.out.println("2. Descending order");
        System.out.print("> ");
        sortingOrder = sc.nextInt();
        if (sortingOrder == 2)
            sortingOrder = -1;
        return sortingOrder;
    }

    private SettingArray getSettingArrayType(int menu) {
        if (menu == 1)
            return new SettingIntegerArray();
        else
            return new SettingStringArray();
    }

    private Object[] excuteSorting(Object[] array, int sortingAlgorithm) {
        if (sortingAlgorithm == 1) {
            BubbleSort sort = getBubbleSort();
            return sort.sortArray(array);
        } else {
            MergeSort sort = getMergeSort();
            return sort.executeMergeSort(array, 0, array.length);
        }
    }

    private BubbleSort getBubbleSort() {
        if (menu == 1)
            return new IntegerBubbleSort(sortingOrder);
        else
            return new StringBubbleSort(sortingOrder);
    }

    private MergeSort getMergeSort() {
        if (menu == 1)
            return new IntegerMergeSort(sortingOrder);
        else
            return new StringMergeSort(sortingOrder);
    }

    private void printResult(Object[] array) {
        System.out.println("<Result>");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        SortExecutor se = new SortExecutor();
        se.runSortingProgram();
    }
}