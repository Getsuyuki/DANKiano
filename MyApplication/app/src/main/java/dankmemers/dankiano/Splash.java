package dankmemers.dankiano;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.content.res.Resources;

/**
 * Created by David on 04/10/2015.
 */
public class Splash extends Activity{
    private static int TIME_OUT = 3000;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final MediaPlayer start = new MediaPlayer();

        try{
            AssetFileDescriptor afd;
            afd = getAssets().openFd("CENA.wav");
            start.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            start.prepare();
            start.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, PianoMain.class);
                start.stop();

                startActivity(i);

                finish();
            }
        }, TIME_OUT);
    }
}
