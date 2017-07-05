package de.gp17.test;

import java.io.File;
import java.io.IOException;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import com.hopding.jrpicam.RPiCamera;
import com.hopding.jrpicam.enums.Encoding;
import com.hopding.jrpicam.exceptions.FailedToRunRaspistillException;

public class TestTakeImage {

	public Mat takeSnapshot() {
		RPiCamera camera;

		try {
			camera = new RPiCamera("/home/pi").setEncoding(Encoding.PNG);;
		} catch (FailedToRunRaspistillException e) {
			e.printStackTrace();
			return null;
		}

		System.out.println("Taking snapshot...");

		File file = null;
		try {
			file = camera.takeStill("test.png", 594, 380);
			System.out.println(file.getAbsolutePath());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		if (file != null) {
			return Imgcodecs.imread(file.getAbsolutePath());
		}

		return null;
	}
}
