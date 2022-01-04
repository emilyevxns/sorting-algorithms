

import java.util.Comparator;
/**
 * Simple, non-exhaustive, test program to check that sorters work
 */
public class Test {
    /**
     * Instantiates and tries 3 sorters
     *@param args ignored
     */
    public static void main(String[] args) {
        // Make the sorters
        ISorter<Integer> ms = new MergeSorter<Integer>();
    	ISorter<Integer> bs = new BubbleSorter<Integer>();
        ISorter<Integer> ss = new SelectSorter<Integer>();
        Comparator<Integer> comp = Comparator.naturalOrder();
        // Set their comparator
        ms.setComparator(comp);
        bs.setComparator(comp);
        ss.setComparator(comp);
        // Test with a reverse sorted array
        System.out.println("Sorting with Merge Sort...");
        runTest(ms);
        System.out.println("Sorting with Bubble Sort...");
        runTest(bs);
        System.out.println("Sorting with Select Sort...");
        runTest(ss);
        
    }
   
    /**
     * Helper function to run a simple test of a sorter
     *@param s ISorter instance to test
     */
    private static void runTest(ISorter<Integer> s) {
        // Generate a reverse sorted array
        Integer[] v = new Integer[10];
        for(int i=0; i<10; i++) {
            v[9-i] = i;
        }
        System.out.print("Sorted? "+s.isSorted(v)+": ");
        printArray(v);
        // Sort the array
        s.sort(v);
        // Check the sort
        System.out.print("Sorted? "+s.isSorted(v)+": ");
        printArray(v);
    }
    
    /**
     * Helper function to print an array
     *@param v array to print
     */
    private static void printArray(Integer[] v) {
        for(Integer i:v) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
