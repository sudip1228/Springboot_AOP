package business;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import aop.TrackTime;
import data.Dao1;



//AOP with Spring Framework. One of the key components of Spring Framework is the Aspect oriented programming (AOP) framework. 
//Spring AOP module provides interceptors to intercept an application. 
//For example, when a method is executed, you can add extra functionality before or after the method execution.

@Service
public class Business1 {

	@Autowired
	private Dao1 d;
	
	@TrackTime
	public String calculatesomething() {
		
		return d.retrievesomething();
	}
	
}
