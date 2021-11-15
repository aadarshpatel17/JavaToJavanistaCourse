package $14reflectionAnnotationsGenericArrays.$4checkingobjects;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InRange {
    double minValue();
    double maxValue();
}
