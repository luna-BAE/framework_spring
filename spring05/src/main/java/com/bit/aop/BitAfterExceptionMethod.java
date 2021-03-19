package com.bit.aop;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class BitAfterExceptionMethod implements ThrowsAdvice {

	Logger log = Logger.getLogger(this.getClass());
	
	public void afterThrowing(Exception e) {
		log.debug("에러발생");
	}
	
}
