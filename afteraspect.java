
package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect//aspect is a combination of pointcut and advice.
@Configuration
public class afteraspect {
	
	 Logger log= LoggerFactory.getLogger(afteraspect.class);
	
	 @AfterReturning(value="aop.commonjoinpointconfig.businesslayerexecution()", returning="result")//returns the value after method is executed.
	 	public void aftereturning(JoinPoint j,Object result) {
		//logic here is called advice.
		 log.info("{} returned with value {} ",j,result);
		
	}
	 @AfterThrowing(value="aop.commonjoinpointconfig.businesslayerexecution()", throwing="exception")//called when there is an exception.It is used to intercept the exception.
	 public void afterthrowing(JoinPoint j,Object exception) {
			//logic here us called advice.
			 log.info("{} throw exception {} ",j,exception);
			
		}
	 @After(value="aop.commonjoinpointconfig.businesslayerexecution()")//it is called either throwing an exception or returning a value.
	 public void afterthrowing(JoinPoint j) {
			//logic here us called advice.
			 log.info("after execution of {} ",j);
			
		}
	

}

