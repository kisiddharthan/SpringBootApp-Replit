package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Person {

  @Getter
	private final String name;

  public Person() { 
    this.name = "World";
  }

	public Person(String name) {
		this.name = name;
	}
}