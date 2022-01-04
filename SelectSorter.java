

import java.util.Comparator;

public class SelectSorter<E> implements ISorter<E> {
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
		E temp;
		// TODO Auto-generated method stub
		for (int i = arr.length - 1; i > 0; i--) {
            // find index of smallest element
            int smallest = 0;
            for (int j = 1; j <= i; j++) {
            	if (c.compare(arr[j], arr[smallest]) < 0) {
                    smallest = j;
            	}
            	temp = arr[smallest];
            	arr[smallest] = arr[i];
            	arr[i] = temp;
            }
        }
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			
		}
		
	}

	
	/**
     * Checks if an array is already sorted
     *@param arr Array of values
     *@return true if arr is in sorted order
     */
	@Override
	public boolean isSorted(E[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (c.compare(arr[i],arr[i+1]) == 1) {
				return false;
			}
		}
		return true;
	}
}
