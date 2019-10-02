package aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//this class defines the tracktime annotation which is self-made or custom annotation by us.

@Target(ElementType.METHOD)//used to call only to methods not class.
@Retention(RetentionPolicy.RUNTIME)//intercepting or retaining the call at the runtime.
public @interface TrackTime {

}
