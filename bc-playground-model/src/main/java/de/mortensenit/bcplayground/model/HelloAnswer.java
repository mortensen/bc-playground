package de.mortensenit.bcplayground.model;

/**
 * 
 * @author frederik.mortensen
 *
 */
public class HelloAnswer {

	private String name;

	public HelloAnswer() {
		this.name = "world";
	}

	public HelloAnswer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
