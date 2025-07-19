package com.vcube.set;

public class Mobile implements Comparable<Mobile> {
	int sno;
	String b_name;
	String model;
	double price;
	int storage;

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public Mobile(int sno, String b_name, String model, double price, int storage) {
		super();
		this.sno = sno;
		this.b_name = b_name;
		this.model = model;
		this.price = price;
		this.storage = storage;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sno :" + sno + ", b_name : " + b_name + ", model : " + model + ", price : " + price + ", storage : "
				+ storage;
	}

	@Override
//	public int compareTo(Mobile o) {
//		// TODO Auto-generated method stub
//		if(this.price>o.price) {
//		return -1	;
//		}else if(this.price<o.price) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}

	// 
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return this.b_name.compareTo(o.b_name);
	}
}
