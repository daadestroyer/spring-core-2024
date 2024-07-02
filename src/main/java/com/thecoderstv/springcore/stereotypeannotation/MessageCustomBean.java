package com.thecoderstv.springcore.stereotypeannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MessageCustomBean {
	@Value("Hello from TheCoders TV")
	private String message;

	public MessageCustomBean() {
//		this.message = "Hello World !";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageCustomBean [message=" + message + "]";
	}

}
