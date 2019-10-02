
package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect//aspect is a combination of pointcut and advice.
@Configuration
public class aroundadvice {
	
	 Logger log= LoggerFactory.getLogger(aroundadvice.class);
	 @Around("aop.commonjoinpointconfig.tracktimeannotation()")//only the method with annotation TtrackTime is called.
	
	// @Around("aop.commonjoinpointconfig.datalayerexecution()") 
	 	public void around(ProceedingJoinPoint j) throws Throwable {
		 //the following code calculates the time taken to execute particular method.
		 long starttime= System.currentTimeMillis();//it is similar to @before
		 j.proceed();
		long timetaken= System.currentTimeMillis()-starttime;//it is similar to @After
		//this is flexible and powerful advice than @before and @after
		 log.info("time taken by{} is {} ",j,timetaken);
		
	}
	
}

