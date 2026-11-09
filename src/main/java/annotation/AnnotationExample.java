package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Project Name : BL_java-annotations
 * Module       : Core Java Annotations
 * Author       : Hemang
 * Date         : 21-10-2026
 *
 * Description:
 * Demonstrates how to parse custom annotations at runtime using Java Reflection.
 */
public class AnnotationExample {

    // Applying custom @MethodInfo along with @Override
    @Override
    @MethodInfo(author = "Narayan", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overridden toString method";
    }

    // Applying custom @MethodInfo along with built-in @Deprecated
    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    public static void main(String[] args) {
        try {
            // Iterate over all public methods in AnnotationExample class
            for (Method method : AnnotationExample.class.getMethods()) {

                // Check if @MethodInfo annotation is present on the method
                if (method.isAnnotationPresent(MethodInfo.class)) {
                    try {
                        // Print all annotations attached to this method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "' : " + anno);
                        }

                        // Extract specific MethodInfo annotation instance
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);

                        // Check if revision attribute equals 1
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
