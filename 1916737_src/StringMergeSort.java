public class StringMergeSort extends MergeSort {

    public StringMergeSort(int ascendOrder) {
        super(ascendOrder);
    }

    @Override
    boolean compareElementByOrder(Object leftElement, Object rightElement) {
        String left = leftElement.toString();
        String right = rightElement.toString();
        return ascendOrder * (left.compareTo(right)) <= 0;
    }
}