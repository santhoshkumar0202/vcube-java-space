package com.Vcubeforloop;

public class RecursiveCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(1);
	}

	static void rec(int cnt) {
		int count = cnt;

		if (count > 5) {

			return;
		}

		System.out.println(count);

		rec(count + 1);
	}

}
