package ch12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Ex6 {
    @Retention(RetentionPolicy.SOURCE)
    @interface MyAnnotation {
        int value() default 1;
    }

    public static void main(String[] args) {

    }
}
