package oop7z3_search;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name FIle");
		String nameSearchFile = sc.nextLine();
		System.out.println(" Absoluter path where search");
		String search = sc.nextLine();
		String path = "";
		File searchFile = new File(nameSearchFile);
		ExecutorService exSer = Executors.newFixedThreadPool(3);
		File searchFolder = new File(search);
		System.out.println("absolyte path search= " + searchFolder.getAbsolutePath());		
		exSer.submit(new SearchThread(searchFolder, searchFile, exSer, path));

	}
}
