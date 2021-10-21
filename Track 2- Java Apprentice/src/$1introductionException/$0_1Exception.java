package $1introductionException;

public class $0_1Exception {

/**
 *    Exception-
 *      An event, which occurs during the execution of a program,
 *      that disrupts the normal flow of the program's instructions.
 *
 *    Exception Categories-
 *      Checked exceptions: detected by the compiler, and need to be handled by
 *          the developer.
 *      Unchecked exceptions: not pointed out by the compiler - but a good developer
 *          should anticipate and handle them.
 *      Errors: represent a serious problem that cannot be recovered from.
 *
 *     Dealing with Exceptions-
 *      Checked exceptions: need to be specified or handled with a try-catch block.
 *      Unchecked exceptions: can be addressed by fixing bugs in the code or by
 *          setting a try-catch block.
 *      Errors: may have several causes, each with their own solution.
 *
 *     Examples of Exceptions-
 *      Checked exceptions: FileNotFoundException
 *      Unchecked exceptions: ArrayIndexOutOfBoundsException
 *      Errors: StackOverflowError, VirtualMachineError
 *
 *     Catching or Specifying an Exception-
 *      - Potentially risky code can be enclosed inside a try block and logic to handle
 *          the exception can be set in a catch block right after it.
 *      - The method containing the risky code can be marked as one that throws an
 *          exception within the method signature.
 *
 *     try-catch block syntax:
 *          try{
 *              risky code, that can produce exception
 *          }
 *          catch(Exception e) {
 *              solution/print exception
 *          }
 *
 *     throws Exception syntax:
 *          public void anyMethod() throws Exception {
 *              risky code, that can produce exception
 *          }
 *
 *     The finally block-
 *      Include a finally block after the try-catch
 *          -   Perform some clean-up work after the code has run
 *          -   Runs whether or not an exception is thrown
 *          -   Included at the end of a try-catch
 *
 */

}
