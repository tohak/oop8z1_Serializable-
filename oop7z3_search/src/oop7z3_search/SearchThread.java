package oop7z3_search;

import java.io.File;
import java.util.concurrent.ExecutorService;

public class SearchThread implements Runnable {

	private File searchFolder;
	private File searchFile;
	private ExecutorService exSer;
	private String path;

	public SearchThread(File searchFolder, File searchFile, ExecutorService exSer, String path) {
		super();
		this.searchFolder = searchFolder;
		this.searchFile = searchFile;
		this.exSer = exSer;
		this.path = path;
	}

	@Override
	public void run() {
		File[] arrayList = searchFolder.listFiles();
		for (int i = 0; i < arrayList.length; i++) {
			if (arrayList[i].getName().equals(searchFile.getName())) {
				path = arrayList[i].getAbsolutePath();
				System.out.println(path);
			}
			if (arrayList[i].isDirectory()) {
				exSer.submit(new SearchThread(arrayList[i], searchFile, exSer, path));
			}
		}		
	}
}
