package co.fx;

import java.io.IOException;

public class AppLunchProgram {
	/**
	 * Lunch the notepad 
	 * Lunch the google 
	 * Lunch the Vlc */
	public static void main(String[] args) {
		//for lunch the notepad
		Runtime runtime = Runtime.getRuntime();
		/*
		try {
			Process process = runtime.exec("notepad.exe C:\\Users\\md\\Desktop\\Q & A\\demo.txt");
			Thread.sleep(4000);
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		//for lunch the google chrome or any other site
		/*
		String s[]=new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","www.google.com","www.amazon.com"};
		try {
			Process exec = runtime.exec(s);
			Thread.sleep(4000);
			exec.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		//Lunch the Vlc media Player
		String s1[]=new String[] {"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "E:\\ashok video\\log4j\\example.mp4"};
		try {
			Process process = runtime.exec(s1);
			Thread.sleep(200);
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
