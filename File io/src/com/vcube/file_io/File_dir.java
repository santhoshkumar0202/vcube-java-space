package com.vcube.file_io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class File_dir {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Vcube\\File Test folder\\");
		File file1 = new File(file, "demo.text");
		File file2 = new File(file, "demo.pdf");

		System.out.println(Arrays.toString(file.list()));

		int length = file.list().length;

		System.out.println(length);

		boolean file_check = file2.createNewFile();
		String ext = file2.getName();
		int lastindex = ext.lastIndexOf(".");
		System.out.println();
		if (file_check) {
			System.out.println("file extension:- " + ext.substring(lastindex + 1) + " created succesfully !!!");
		} else {
			System.err.println("file wasnt created !!!");
		}
		
	}
}
