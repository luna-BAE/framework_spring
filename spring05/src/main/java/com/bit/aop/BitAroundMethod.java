package com.bit.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class BitAroundMethod implements MethodInterceptor {

	Logger log = Logger.getLogger(getClass());
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object obj = null;
		String name = invocation.getMethod().getName();
		
		
		log.debug("before"+name);
		
		try {
			obj = invocation.proceed();
			
			log.debug("after"+name);
		} catch(Exception e) {
			log.debug("error"+name);
		}
		return obj;
	}

}
