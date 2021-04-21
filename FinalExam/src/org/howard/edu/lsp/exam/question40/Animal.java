package org.howard.edu.lsp.exam.question40;
public abstract class Animal{
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal() {
		this("animal");
	}
	public String getName() {
		return this.name;
	}
	
	public void speak() {
		System.out.println("This " + name + " speaks");
	};
	public void move() {
		System.out.println("This " + name +  " moves");
	}
}
