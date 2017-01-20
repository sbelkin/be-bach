package io.sbelkin.bebach.motion;

import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;

/**
 * Created by sbelkin on 12/2/2016.
 */
public class SimpleMotionListener implements WebcamMotionListener {

    @Override
    public void motionDetected(WebcamMotionEvent wme) {
        System.out.println("Detected motion - here");
    }
}
