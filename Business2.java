package business;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import data.Dao2;

@Component
public class Business2 {

	@Autowired
	private Dao2 d2;
	public String calculatesomething() {
		
		return d2.retrievesomething();
	}
	
}
