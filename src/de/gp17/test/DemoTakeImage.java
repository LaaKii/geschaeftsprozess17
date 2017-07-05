package de.gp17.test;

import org.opencv.core.Core;
import org.opencv.core.Mat;

public class DemoTakeImage {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		TestTakeImage img = new TestTakeImage();
		Mat frame = img.takeSnapshot();
		System.out.println("sallesdfasdf");
		
	}
}
