package de.mortensenit.bcplayground.core;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.mail.MailSendingMessageHandler;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailController {
	
	@Autowired
	private ApplicationContext context;

	/**
	 * 
	 */
	@PostConstruct
	public void test() {
		//TODO: in den Kontext setzen
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("");
//		mailSender.setPort(123);
//		mailSender.setUsername("");
//		mailSender.setPassword("");
//		MailSendingMessageHandler mailSendingHandler = new MailSendingMessageHandler(mailSender);
	}

}
