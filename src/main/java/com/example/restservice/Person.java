package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Person {

  @Getter
	private final String name;
  @Getter
  private final int num;

  public Person() { 
    this.name = "World";
    this.num = 0;
  }

	public Person(String name, int num) {
		this.name = name;
    this.num = num;
	}
}