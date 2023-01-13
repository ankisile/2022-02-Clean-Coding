public class StringBubbleSort extends BubbleSort {

    public StringBubbleSort(int ascendOrder) {
        super(ascendOrder);
    }

    @Override
    void compareAndSwapByOrder(Object[] array, int i) {
        String front = array[i].toString();
        String back = array[i + 1].toString();
        if (ascendOrder * (front.compareTo(back)) > 0) {
            super.swap(array, i, i + 1);
        }
    }
}