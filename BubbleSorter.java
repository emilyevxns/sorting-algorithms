

import java.util.Comparator;

public class BubbleSorter<E> implements ISorter<E> {
	
	Comparator<E> c;
	 /** 
	 * Configures how the sorter compares elements
	 *@param comp Comparator to use for sorting
	 */
	@Override
	public void setComparator(Comparator<E> comp) {
		// TODO Auto-generated method stub
		c = comp;
	}
	 /**
     * Sorts an array of values such that the minimum element is first
     *@param arr Array of values
     */

	@Override
	public void sort(E[] arr) {
		// TODO Auto-generated method stub
		E temp;
		for(int i = arr.length -1; i>0; i--) {
			for (int j = 0; j < i; j++) {
				if (c.compare(arr[j], arr[j+1])>0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	/**
     * Checks if an array is already sorted
     *@param arr Array of values
     *@return true if arr is in sorted order
     */

	@Override
	public boolean isSorted(E[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			if (c.compare(arr[i],arr[i+1]) == 1) {
				return false;
			}
		}
		return true;
	}
}
