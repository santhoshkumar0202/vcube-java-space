package com.vcube.string;

public class StringCustomLength {
	String str = "santhosh";
	int h = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCustomLength s = new StringCustomLength();
		s.Length();

	}

	void Length() {
		int count = 0;
		for (int i = 0; i < this.str.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
