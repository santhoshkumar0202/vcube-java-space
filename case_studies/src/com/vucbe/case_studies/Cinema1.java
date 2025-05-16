package com.vucbe.case_studies;

public class Cinema1 {
 private	String story_of = "bahubali";
	String cinema_name = "bahubali";
	String name = "bahubali";

	static String greeting = "happy holiday";
// even though we dont specify the constructor jaavac will be created or generated a no arg constructor 
//	Cinema1(String cinema_name, int age) {
//		this.cinema_name = cinema_name;
//	}
//
//	Cinema1(String cinema_name) {
//		this.cinema_name = cinema_name;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("cinema super class");
	}

}

class Artist extends Cinema1 {
	String name;
	int age;
	String role;
static	String greeting="hello";

	Artist(String cinema) {
//		super(cinema);
		
	}

	Artist(String name, int age, String role) {
		this("saalar");
		this.name = name;
		this.age = age;
		this.role = role;

	}

	Artist(String name, int age) {
		this("saalar");
		this.name = name;
		this.age = age;

	}

	Artist(String name, int age, String role, String cinema) {
		this(cinema);
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public static void main(String[] args) {
		Artist artist1 = new Artist("prabhas", 40, "hero", "saalar");
		Artist artist2 = new Artist("shruthi haasan", 35, "heroine");
		Artist artist3 = new Artist("pruthvi raj", 40);
		Artist artist4 = new Artist("prashanth neel", 42, "director", "saalar");
		Artist artist5 = new Artist("jagapathi babu", 42, "villan");
		Artist artist6 = new Artist("hekko");
//		artist6.story_of
//		artist1.artist_details();
//		artist2.artist_details();
//		artist3.artist_details();
//		artist4.artist_details();
//		artist5.artist_details();

	}

	void artist_details() {

		System.out.println(("artist  details -------------------").toUpperCase());
		System.out.println(("name of the artist:- " + name).toUpperCase());
		System.out.println(("age of the artist:- " + age).toUpperCase());
		System.out.println(("role of the artist:- " + role).toUpperCase());
		System.out.println(("name of the cinema:- " + super.cinema_name + "\n").toUpperCase());
		System.out.println(super.greeting);
	}
}
