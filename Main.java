package com.codegnan.oopexamples;

public class Main {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("suma");
		p.getName();
		p.setAge(21);
		p.getAge();
		p.setHeight(5.3);
		p.getHeight();
		p.introduce();
		//operational methods
		p.celebrateBirthday();
		System.out.println(p.isAdult());
		p.introduce();
		//static method
		System.out.println(Person.getSpeciesName());
		//final method
		System.out.println(p.getIdentification());
		
		

	}

}
