

/** Indicates that an underflow has occurred
 * <p>UnderflowException is not expected to be thrown during normal use
 * of a stack. As such, it is declared as a RuntimeException, which
 * is not checked at compile time.
 */
public class UnderflowException extends RuntimeException { 
    private static final long serialVersionUID = 0L; // Serialization requirement

    /** Generate instance
     */
    public UnderflowException() {
        super("Operation has caused an underflow.");
    }
}