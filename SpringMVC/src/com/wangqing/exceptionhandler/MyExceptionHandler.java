package com.wangqing.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler({Exception.class})
	public String testException(Exception e) {
		System.out.println("出错了。。。。。。。。");
		return "error";
	}

}
