
public class SelectionSort {
	
	public int[] selectionSort(int[] list) {
		for(int i = 0; i < list.length; i++) {
			int minValue = list[i];
			int minIndex = i; 
			for(int j = i; j < list.length; j++) {
				if(list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			
			if(minValue < list[i]) {
				int temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		
		return list;
	}

}
