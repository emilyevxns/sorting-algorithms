
import java.util.Comparator;

/**
 * Interface for objects that are able to sort arrays
 */
public interface ISorter<E> {
    /** 
     * Configures how the sorter compares elements
     *@param comp Comparator to use for sorting
     */
    public void setComparator(Comparator<E> comp);

    /**
     * Sorts an array of values such that the minimum element is first
     *@param arr Array of values
     */
    public void sort(E[] arr);

    /**
     * Checks if an array is already sorted
     *@param arr Array of values
     *@return true if arr is in sorted order
     */
    public boolean isSorted(E[] arr);
}
