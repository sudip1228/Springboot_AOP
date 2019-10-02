
package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect//aspect is a combination of pointcut and advice.
@Configuration
public class beforeaspect {
	
	 Logger log= LoggerFactory.getLogger(beforeaspect.class);
	//what kind of method calls i would intercept
	 //weaving->process of implementing the Aop around your method is called weaving.
	 //weaver is a framework to implement weaving.
	 @Before("aop.commonjoinpointconfig.datalayerexecution()")//it is abest practice to call pointcut which is in another class.
	 //format for @before--> execution(* PACKAGE.*.*(..))  //this is called pointcut.
	 //						this is a format			package.class.method(argument)
	 //													package..class.method(argument)--> any calls in the package is intercepted.  
	 //here the business package is intercepted everytime it is called.the following message is printed to confirm the interception.
	 //("execution(* business..*.*(..))")--->this will intercept all the calls of the package including all subpackages.here we do not have subpackages.
	public void before(JoinPoint j) {
		//logic here us called advice.
		 log.info(" check for user access ");
		log.info("allowed execution for {} ",j);// joinpoint shows what methods are intercepted in a package.
		//what to do?
	}
	
	
	

}

