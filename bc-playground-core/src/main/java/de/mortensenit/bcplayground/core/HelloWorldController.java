package de.mortensenit.bcplayground.core;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.mortensenit.bcplayground.model.HelloAnswer;

/**
 * 
 * @author frederik.mortensen
 *
 */
@RestController
public class HelloWorldController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@PostConstruct
	public void init() {
		logger.info("Initializing " + this.getClass().getSimpleName());
	}

    @RequestMapping(method=RequestMethod.POST, path = "hello")
	@ResponseBody
	public HelloAnswer hello() {
		return new HelloAnswer();
	}
    
    @RequestMapping(method=RequestMethod.POST, path = "helloUser")
	@ResponseBody
	public HelloAnswer helloUser(@RequestParam(required = true) String name) {
		return new HelloAnswer(name);
	}

}