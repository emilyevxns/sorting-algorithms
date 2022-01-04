
import java.util.Arrays;
import java.util.Comparator;

public class MergeSorter<E> implements ISorter<E> {
	Comparator<E> c;
	E[] temp;
	
	@SuppressWarnings("unchecked")
	public MergeSorter() {
		temp = (E[]) new Object[10];
	}
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
	
	@SuppressWarnings("unchecked")
	@Override
	public void sort(E[] arr) { 
		E[] b = (E[]) new Object[arr.length/2];
		E[] c = (E[]) new Object[arr.length - b.length];
			if (b.length < 1) {
				return;
			}
			else if (c.length <1) {
				return;
			}
			else {
				for (int i = 0; i<b.length; i++) {
					b[i] = arr[i];
					}
				for (int i = 0; i < c.length; i++) {
					c[i] = arr[i + b.length];
					}
				sort(b);
				sort(c);
				merge(b, c, arr);
			}
		}
	
	
	public void merge(E[] fir, E[] sec, E[] arr) {
		// Index of first array
		int apointer = 0;
		// Index of second array
		int bpointer = 0;
		int index = 0;
		
		int mer = 0;
        while (index < (fir.length + sec.length )) {
        	if(apointer == fir.length) {
        		arr[mer] = sec[bpointer];
        		bpointer++;
        	}
        	else if(bpointer == sec.length) {
        		arr[mer] = fir[apointer];
        		apointer++;
        	}
        	else if (c.compare(fir[apointer], sec[bpointer]) > 0) {
                arr[mer] = sec[bpointer];
                bpointer++;
            } 
            else {
                arr[mer] = fir[apointer];
                apointer++;
            }
            mer++;
            index++;
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
