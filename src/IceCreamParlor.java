import java.util.Arrays;

public class IceCreamParlor {
	
	//Find the indices of two items on the menu
	
	public static int[] findChoices(int[] menu, int money) {
		int[] sortedmenu = menu.clone();
		Arrays.sort(sortedmenu);
		
		for(int i = 0; i < sortedmenu.length; i++) {
			int complement = money - sortedmenu[i];
			int location = Arrays.binarySearch(sortedmenu,  i+1, sortedmenu.length, complement);
			if(sortedmenu[location] == complement && location >= 0 && location < sortedmenu.length) {
				int[] indices = getIndiciesFromValues(menu, sortedmenu[i], complement);
				return indices;
			}
		}
		return null;
	}
	
	public static int[] getIndiciesFromValues(int[] menu, int value1, int value2) {
		
		int index1 = indexOf(menu, value1, -1);
		int index2 = indexOf(menu, value2, index1);
		int[] indices = {Math.min(index1, index2), Math.max(index1, index2)};
		return indices;
	}
	
	public static int indexOf(int[] menu, int value, int exclude) {
		for(int i = 0; i < menu.length; i++) {
			if(menu[i] == value && i != exclude) {
				return i;
			}
		}
		return -1;
	}

}
