public abstract class MergeSort {
    int ascendOrder;
    Object[] array;

    public MergeSort(int ascendOrder) {
        this.ascendOrder = ascendOrder;
    }

    public Object[] executeMergeSort(Object[] intputArray, int start, int end) {
        array = intputArray;
        sortArray(start, end);
        return array;
    }

    void sortArray(int start, int end) {
        if (end == start + 1) 
            return;
        int middle = (start + end) / 2;
        sortArray(start, middle);
        sortArray(middle, end);
        merge(start, end);
    }

    void merge(int start, int end) {
        int mid = (start + end) / 2;
        int leftIndex = start;
        int rightIndex = mid;
        Object[] tempArray = new Object[array.length];
        
        for (int i = start; i < end; i++) {
            if (rightIndex == end)
                tempArray[i] = array[leftIndex++];
            else if (leftIndex == mid)
                tempArray[i] = array[rightIndex++];
            else if (compareElementByOrder(array[leftIndex], array[rightIndex])) 
                tempArray[i] = array[leftIndex++];
            else 
                tempArray[i] = array[rightIndex++];
        }

        for (int i = start; i < end; i++) {
            array[i] = tempArray[i];
        }
    }

    abstract boolean compareElementByOrder(Object left, Object right);
}