package com.kvr;

public class Main {
	
	private Kev kev;
	private String test = "Test";
	
	public static void main(String[] args) {
		Kev kev = new Kev("Ronson");
	}
	
	public void methodCall(String name, int age) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static class Kev {
		
		private String surname;
		
		public Kev(String surname) {
			this.surname = surname;
		}
		
		
	}
}
