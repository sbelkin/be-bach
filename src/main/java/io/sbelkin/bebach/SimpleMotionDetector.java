package io.sbelkin.bebach;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionDetector;
import io.sbelkin.bebach.motion.MotionListenerPicture;
import io.sbelkin.bebach.motion.SimpleMotionListener;

/**
 * Created by sbelkin on 12/2/2016.
 */
public class SimpleMotionDetector  {

    public static void main(String[] args) throws Exception {
        new SimpleMotionDetector();
        System.in.read();
    }


    public SimpleMotionDetector() {
        WebcamMotionDetector detector = new WebcamMotionDetector(Webcam.getDefault());
        detector.setInterval(500); // one check per 500 ms
//        detector.addMotionListener(this);
        detector.addMotionListener(new MotionListenerPicture());
        detector.start();
    }
}
