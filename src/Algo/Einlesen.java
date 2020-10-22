package Algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Einlesen {
	public static void einlesen(ArrayList<Integer> arrList) {
    	System.out.println("\n------------Wählen Sie eine Textdatei------------");
    	File directoryPath = new File("C:\\Users\\kbroja.GUS-GROUP-K\\OneDrive - GUS Deutschland GmbH\\Übungen\\Java\\Algo");
		File[] files=directoryPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		
		for (File file : files) {
			System.out.println(file.getName());
		}
		Scanner einlesen = new Scanner(System.in);
		String e=einlesen.nextLine();
		try {
			einlesen = new Scanner(new File(e+".txt"));
		} catch (FileNotFoundException h) {
			System.out.println("Datei nicht gefunden!");
			return;
		}
		while (einlesen.hasNext()) {
			arrList.add(Integer.valueOf(einlesen.nextLine()));
		}
		einlesen.close();
	}
}
