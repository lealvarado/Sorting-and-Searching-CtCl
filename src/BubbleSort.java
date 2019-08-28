
public class BubbleSort {
	
	public static void bubblesort(int[] array) {
		
		boolean isSorted = false; 
		int lastUnSorted = array.length - 1;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastUnSorted; i++) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					isSorted = false;
				}
			}
			lastUnSorted--;
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
