package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project Name : BL_java-annotations
 * Module       : Core Java Annotations
 * Author       : Hemang
 * Date         : 21-10-2026
 *
 * Description:
 * Custom annotation to hold method-level metadata.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

    // Default value so it is optional during usage
    String author() default "Narayan";

    // Required attribute, must be provided when using the annotation
    String date();

    // Revision number with a default value of 1
    int revision() default 1;

    // Required attribute for adding comments about the method
    String comments();
}
