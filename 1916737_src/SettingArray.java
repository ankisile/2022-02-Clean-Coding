abstract public class SettingArray {

	public Object[] declareArray () {
		int arraySize = getArraySize();
		Object [] array = initializeArray(arraySize);
		return array;
	}

	abstract int getArraySize();
	abstract Object[] initializeArray(int arraySize);	
}
