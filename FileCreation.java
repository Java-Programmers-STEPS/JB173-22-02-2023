package fileoperations;

import java.io.*;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String filename = scanner.next();

		File file = new File(filename + ".pdf");
		try {
			
			if(file.exists())
			{
				System.out.println("Already existing");
			}
			else if (file.createNewFile()) {
				System.out.println("Success");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
