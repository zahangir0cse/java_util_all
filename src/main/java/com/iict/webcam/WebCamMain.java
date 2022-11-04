package com.iict.webcam;
import org.bytedeco.javacv.*;
import org.bytedeco.opencv.helper.opencv_imgcodecs;
import org.bytedeco.opencv.opencv_core.IplImage;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class WebCamMain {
    public static void main(String[] args) throws FrameGrabber.Exception, InterruptedException {
        CanvasFrame canvas = new CanvasFrame("Web Cam");
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameGrabber grabber = new OpenCVFrameGrabber(0);
        OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();

        grabber.start();
        Frame frame = grabber.grab();

        IplImage img = converter.convert(frame);
        opencv_imgcodecs.cvSaveImage("selfie.jpg", img);

        canvas.showImage(frame);

        Thread.sleep(2000);

        canvas.dispatchEvent(new WindowEvent(canvas, WindowEvent.WINDOW_CLOSING));
    }
}
