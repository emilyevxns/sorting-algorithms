
/** Indicates that an overflow has occurred
 * <p>OverflowException is not expected to be thrown during normal use
 * of a stack. As such, it is declared as a RuntimeException, which
 * is not checked at compile time.
 */
public class OverflowException extends RuntimeException { 
    private static final long serialVersionUID = 0L; // Serialization requirement

    /** Generate instance
     */
    public OverflowException() {
        super("Operation has caused an overflow.");
    }
}

