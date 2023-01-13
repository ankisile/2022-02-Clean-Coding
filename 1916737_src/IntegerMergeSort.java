public class IntegerMergeSort extends MergeSort {

    public IntegerMergeSort(int ascendOrder) {
        super(ascendOrder);
    }

    @Override
    boolean compareElementByOrder(Object left, Object right) {
        return ascendOrder * (Integer.compare((Integer) left, (Integer) right)) <= 0;
    }
}