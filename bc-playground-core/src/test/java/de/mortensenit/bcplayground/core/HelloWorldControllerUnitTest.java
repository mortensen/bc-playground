package de.mortensenit.bcplayground.core;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import de.mortensenit.bcplayground.core.HelloWorldController;

/**
 * JUnit testing the HelloWorldController class. WebMvc only loads controllers
 * @author frederik.mortensen
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerUnitTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHello() throws Exception {
		// simulate post request
		mockMvc.perform(post("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().json("{\"name\":\"world\"}"));
	}
	

	@Test
	public void helloTestUser() throws Exception {
		// simulate post request
		mockMvc.perform(post("/helloUser").param("name",  "junit"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().json("{\"name\":\"junit\"}"));
	}

}
