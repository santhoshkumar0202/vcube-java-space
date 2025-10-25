package com.vcube.file_io;

import java.io.File;
import java.io.IOException;

public class File_Basic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Vcube\\File Test folder\\fileone.text");

		boolean file = f.createNewFile();
		if (file) {
			System.out.println("file created succesfully !!!");
		} else {
			System.err.println("file wasnt created !!!");
		}

	double	freespace=f.getFreeSpace();
	
	                                                  //kB    ,MB     ,GB
		
	System.out.printf("freespace : %.2f GB %n",(freespace/1024.0/1024.0/1024.0));
	
	System.out.println(f.getCanonicalPath());
	System.out.println(f.getName());
	System.out.println(f.getPath());
	System.out.println(f.exists());

	System.out.println(f.delete());
	System.out.println(f.exists());
	
		
	}

}
