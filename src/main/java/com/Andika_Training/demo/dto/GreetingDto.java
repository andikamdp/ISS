/**
 * 
 */
package com.Andika_Training.demo.dto;

import javax.validation.constraints.*;

/**
 * @author AP36887
 *
 */
public class GreetingDto {
	
	private final long id;
	
	private final String content;

	@NotNull
	@NotBlank
	private String status;

	@Min(value = 18, message = "Age should not be less than 18")
	@Max(value = 150, message = "Age should not be greater than 150")
	private int age;

	@AssertTrue
	private boolean working;

	@NotEmpty
	@NotBlank
	@Size(min = 10, max = 200, message = "About Me must be between 10 and 200 characters")
	private String name;

	@Email(message = "Email should be valid")
	private String email;

	public GreetingDto() {
		super();
		this.id = 0;
		this.content = "Test";
	}

	public GreetingDto(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
