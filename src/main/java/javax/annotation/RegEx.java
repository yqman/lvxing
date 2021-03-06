package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.When;

@Syntax("RegEx")
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RegEx {
    When when() default When.ALWAYS;
}
