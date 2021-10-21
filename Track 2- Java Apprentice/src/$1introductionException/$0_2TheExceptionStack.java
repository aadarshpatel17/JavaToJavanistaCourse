package $1introductionException;

public class $0_2TheExceptionStack {

/**
 *  A chain of Method calls-
 *      main()  -   call levelOne
 *      levelOne()  -   call levelTwo
 *      levelTwo()  -   call levelThree
 *      levelThree() - ERROR!
 *   So, where to define exception handler?
 */

/**
 *  The Exception Stack-
 *      -   The Java Runtime searches the call stack for the methods involved
 *          in the exception.
 *      -   One of the methods in the stack should have a handler to deal
 *          with the exception.
 *      -   If there is no handler, the program terminates.
 *
 *
 *  The Java Exception Hierarchy-
 *                          Throwable (Parent to all errors and exceptions)
 *              Error                       Exception
 *                          -   RuntimeException            -   IOException
 *                          -   NullPointerException        -   SQLException
 *                          -   NumberFormatException
 *
 *  The Benefits of Exceptions-
 *      -   Enable developer to handle exception and move on with code execution.
 *      -   Conveys the source of the problem to the user, including the full
 *          exception stack.
 *      -   Separates error-handling from code.
 *
 *
 *
 */

}
