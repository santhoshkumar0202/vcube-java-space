package com.vcube.file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

class student implements Serializable{
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	int id=1;
	transient String name="samanth";
	int age=17;
} 

public class Serialization_outandinputstreams {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	FileOutputStream fo=new FileOutputStream("C:\\Vcube\\File Test folder\\serialone.ser");
	ObjectOutputStream out =new ObjectOutputStream(fo);
	
	student st = new student();
	out.writeObject(st);
	out.flush();
	out.close();
	
	FileInputStream fi=new FileInputStream("C:\\Vcube\\File Test folder\\serialone.ser");
	ObjectInputStream in = new ObjectInputStream(fi);
	
	      student a=(student)in.readObject();
	      
	      System.out.println(a.toString());
	      fi.close();
	      in.close();
	}

}
