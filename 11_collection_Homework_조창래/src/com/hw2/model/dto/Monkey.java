package com.hw2.model.dto;

public abstract class Monkey extends Animal {

	public Monkey() {
		super();
	
	}

	public Monkey(String name) {
		super(name);
		
	}

	@Override
	public void sound() {
		System.out.println("원숭이가 우끼끼 소리를 냅니다.");
	}

	
			
}
