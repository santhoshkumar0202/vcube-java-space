package com.vucbe.case_studies;

public class Cinema {
	String name;
	int age;
	String role;
	String cinema;

	public Cinema() {
		// TODO Auto-generated constructor stub
	}

	public Cinema(String cinema) {
		System.out.println(" single arg constructor has been called");
		this.cinema = cinema;

	}

	public Cinema(String name, int age) {
		this("bahubali");
		System.out.println(" two arg constructor has been called");

		this.name = name;
		this.age = age;

	}

	public Cinema(String name, int age, String role) {
		this("bahubali");
		System.out.println("three arg constructor has been called");
		this.name = name;
		this.age = age;
		this.role = role;

	}

	public Cinema(String name, int age, String role, String cinema) {
		System.out.println(" four arg constructor has been called");
		this.name = name;
		this.age = age;
		this.role = role;
		this.cinema = cinema;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinema bahubali = new Cinema();
		bahubali.bahubali_movie();
		var a = 30;
		var v = 10 + 10 + a;
		System.out.println(v);
	}

	void bahubali_movie() {
		Cinema artist1 = new Cinema("bahubali");
		Cinema artist2 = new Cinema("anushka", 27);
		Cinema artist3 = new Cinema("prabhas", 30, "hero", "bahubali");
		Cinema artist4 = new Cinema("rajamouli", 35, "director");
		Cinema artist5 = new Cinema("ramya", 45);
		artist1.show_details();
		artist2.show_details();
		artist3.show_details();
		artist4.show_details();
		artist5.show_details();
	}

	void show_details() {
		System.out.println("details------------------");
		System.out.println(("name of the artist: " + name).toUpperCase());
		System.out.println(("age of the artist: " + age).toUpperCase());
		System.out.println(("role of the artist: " + role).toUpperCase());
		System.out.println(("name of the cinema: " + cinema + "\n").toUpperCase());
	}

}
