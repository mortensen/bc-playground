package de.mortensenit.bcplayground.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import de.mortensenit.bcplayground.model.HelloAnswer;

/**
 * Integration testing the webapp context.
 * @author frederik.mortensen
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class StartupApplicationIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	private String url = "http://localhost:";

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testHello() throws Exception {
		ResponseEntity<HelloAnswer> response = testRestTemplate.getForEntity(url + port + "/hello", HelloAnswer.class);
		HelloAnswer result = response.getBody();
		assertEquals("world", result.getName());
	}

}
