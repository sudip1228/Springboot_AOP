package aop;

import org.aspectj.lang.annotation.Pointcut;

public class commonjoinpointconfig {
	
	 @Pointcut("execution(* business.*.*(..))")//it is best practice to define pointcut in seperate class and let other classes use this commonpointcut

public void businesslayerexecution(){}
	 @Pointcut("execution(* data.*.*(..))")
	 public void datalayerexecution(){}
	 
	 @Pointcut("@annotation(aop.TrackTime)")//it is a pointcut of  selfmade annotation.
	 public void tracktimeannotation() {}
	 
	 /*
	 //following are another alternative way to define a pointcut.
	 
	 @Pointcut("aop.commonjoinpointconfig.businesslayerexecution() && aop.commonjoinpointconfig.datalayerexecution() ")//combining two joinpoints.
	 public void alllayerexecution(){}
	 
	 @Pointcut("bean (*dao*)")//search for the bean containing dao
	 public void beancontainingdao() {}
	 
	 @Pointcut("within(execution data..*)")//intercepted all the calls within data package.
	 public void datalayerexecutionwithin(){}
	 */
	
	 
}