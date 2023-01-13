public class IntegerBubbleSort extends BubbleSort {

    public IntegerBubbleSort(int ascendOrder) {
        super(ascendOrder);
    }

    @Override
    void compareAndSwapByOrder(Object[] array, int i) {
        if (ascendOrder * (Integer.compare((Integer) array[i], (Integer) array[i + 1])) > 0) {
            super.swap(array, i, i + 1);
        }
    }
}