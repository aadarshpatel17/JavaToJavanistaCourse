package $14reflectionAnnotationsGenericArrays.$3performchecks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* NOTE: Annotations are to be discarded by the compiler. */
//@Retention(RetentionPolicy.SOURCE)

/* NOTE: Annotations are to be recorded in the class file by the compiler but need
*  not be retained by the VM at runtime. */
//@Retention(RetentionPolicy.CLASS)

/* NOTE: Annotations are to be recorded in the class file by the compiler and retained
*  by the VM at runtime, so they may be read reflectively. */
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {
}
