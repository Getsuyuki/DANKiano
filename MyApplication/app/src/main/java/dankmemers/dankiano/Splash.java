package dankmemers.dankiano;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by David on 04/10/2015.
 */
public class Splash extends Activity{
    private static int TIME_OUT = 3000;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, PianoMain.class);
                startActivity(i);

                finish();
            }
        }, TIME_OUT);
    }
}
