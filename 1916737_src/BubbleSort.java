public abstract class BubbleSort {
    int ascendOrder;

    public BubbleSort(int ascendOrder) {
        this.ascendOrder = ascendOrder;
    }

    public Object[] sortArray(Object[] array) {
        int arraySize = array.length;
        for (int round = 1; round < arraySize; round++) {
            for (int i = 0; i < arraySize - round; i++)
                compareAndSwapByOrder(array, i);
        }
        return array;
    }

    abstract void compareAndSwapByOrder(Object[] array, int i);

    protected void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}