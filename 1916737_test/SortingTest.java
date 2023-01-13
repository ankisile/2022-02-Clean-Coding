import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class SortingTest {
    Integer[] integerArray = {1, 3, 2, 4, 6, 8};
    String [] stringArray = {"cat", "tiger", "dog", "lion", "bird"};

    @Test
    void testBubbleIntegerAscend() {
        BubbleSort sort = new IntegerBubbleSort(1);
        Object[] actualArray = sort.sortArray(integerArray);
        Integer [] expectedArray = {1, 2, 3, 4, 6, 8};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testBubbleIntegerDescend() {
        BubbleSort sort = new IntegerBubbleSort(-1);
        Object[] actualArray = sort.sortArray(integerArray);
        Integer [] expectedArray = {8, 6, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testBubbleStringAscend() {
        BubbleSort sort = new StringBubbleSort(1);
        Object[] actualArray = sort.sortArray(stringArray);
        String [] expectedArray = {"bird", "cat", "dog", "lion", "tiger"};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testBubbleStringDescend() {
        BubbleSort sort = new StringBubbleSort(-1);
        Object[] actualArray = sort.sortArray(stringArray);
        String [] expectedArray = {"tiger", "lion", "dog", "cat", "bird"};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testMergeIntegerAscend() {
        MergeSort sort = new IntegerMergeSort(1);
        Object[] actualArray = sort.executeMergeSort(integerArray, 0, integerArray.length);
        Integer [] expectedArray = {1, 2, 3, 4, 6, 8};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testMergeIntegerDescend() {
        MergeSort sort = new IntegerMergeSort(-1);
        Object[] actualArray = sort.executeMergeSort(integerArray, 0, integerArray.length);
        Integer [] expectedArray = {8, 6, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testMergeStringAscend() {
        MergeSort sort = new StringMergeSort(1);
        Object[] actualArray = sort.executeMergeSort(stringArray, 0, stringArray.length);
        String [] expectedArray = {"bird", "cat", "dog", "lion", "tiger"};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testMergeStringDescend() {
        MergeSort sort = new StringMergeSort(-1);
        Object[] actualArray = sort.executeMergeSort(stringArray, 0, stringArray.length);
        String [] expectedArray = {"tiger", "lion", "dog", "cat", "bird"};
        assertArrayEquals(expectedArray, actualArray);
    }
}