package io.sbelkin.bebach.motion;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by sbelkin on 12/2/2016.
 */
public class MotionListenerPicture implements WebcamMotionListener {

    private final Webcam webcam;
    public MotionListenerPicture(){
        this.webcam = Webcam.getDefault();
    }

    @Override
    public void motionDetected(WebcamMotionEvent wme) {
//        webcam.open();
        try {
            String time = System.currentTimeMillis() +".png";
            ImageIO.write(webcam.getImage(), "PNG", new File(time));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        webcam.close();
        System.out.println("Detected motion - here" + wme.getCog().getLocation());
    }
}
