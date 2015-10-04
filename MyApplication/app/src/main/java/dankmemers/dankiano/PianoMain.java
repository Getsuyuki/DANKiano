package dankmemers.dankiano;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.media.MediaPlayer;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;


public class PianoMain extends ActionBarActivity {
    final MediaPlayer mp1 = new MediaPlayer();
    final MediaPlayer mp2 = new MediaPlayer();
    final MediaPlayer mp3 = new MediaPlayer();
    final MediaPlayer mp4 = new MediaPlayer();
    final MediaPlayer mp5 = new MediaPlayer();
    final MediaPlayer mp6 = new MediaPlayer();
    final MediaPlayer mp7 = new MediaPlayer();
    final MediaPlayer mp8 = new MediaPlayer();
    final MediaPlayer mp9 = new MediaPlayer();
    final MediaPlayer mp10 = new MediaPlayer();
    final MediaPlayer mp11 = new MediaPlayer();
    final MediaPlayer mp12 = new MediaPlayer();
    final MediaPlayer mp13 = new MediaPlayer();

    String[] songlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_main);
        songlist = new String[13];
        songlist[0] = "bromance.wav";
        songlist[1] = "bruh.wav";
        songlist[2] = "darude.wav";
        songlist[3] = "dun.wav";
        songlist[4] = "hell.wav";
        songlist[5] = "jeff.wav";
        songlist[6] = "low.wav";
        songlist[7] = "lying.wav";
        songlist[8] = "never.wav";
        songlist[9] = "nicki.wav";
        songlist[10] = "pizza.wav";
        songlist[11] = "shia.wav";
        songlist[12] = "yas.wav";
        try {
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[0]);
            mp1.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_piano_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
<<<<<<< HEAD
=======
    
    public boolean onTouch1(View v, MotionEvent event)
    {
        switch (event.getAction())
        {

            case MotionEvent.ACTION_DOWN:
            {
                mp1.setLooping(true);
                mp1.start();
            }

            break;
            case MotionEvent.ACTION_UP:
            {
                mp1.stop();
                mp1.reset();
            }
            break;
        }

        return true;
    }

    public void onClick_whitekey1(View v, MotionEvent m)
    {
        if(mp1.isPlaying())
            mp1.stop();
        try {
            mp1.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[0]);
            mp1.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp1.prepare();
            mp1.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey2(View v)
    {
        if(mp2.isPlaying())
            mp2.stop();
        try {
            mp2.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[1]);
            mp2.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp2.prepare();
            mp2.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey3(View v)
    {
        if(mp3.isPlaying())
            mp3.stop();
        try {
            mp3.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[2]);
            mp3.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp3.prepare();
            mp3.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey4(View v)
    {
        if(mp4.isPlaying())
            mp4.stop();
        try {
            mp4.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[3]);
            mp4.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp4.prepare();
            mp4.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey5(View v)
    {
        if(mp5.isPlaying())
            mp5.stop();
        try {
            mp5.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[4]);
            mp5.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp5.prepare();
            mp5.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey6(View v)
    {
        if(mp6.isPlaying())
            mp6.stop();
        try {
            mp6.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[5]);
            mp6.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp6.prepare();
            mp6.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey7(View v)
    {
        if(mp7.isPlaying())
            mp7.stop();
        try {
            mp7.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[6]);
            mp7.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp7.prepare();
            mp7.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_whitekey8(View v)
    {
        if(mp8.isPlaying())
            mp8.stop();
        try {
            mp8.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[7]);
            mp8.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp8.prepare();
            mp8.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_blackkey1(View v)
    {
        if(mp9.isPlaying())
            mp9.stop();
        try {
            mp9.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[8]);
            mp9.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp9.prepare();
            mp9.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_blackkey2(View v)
    {
        if(mp10.isPlaying())
            mp10.stop();
        try {
            mp10.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[9]);
            mp10.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp10.prepare();
            mp10.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_blackkey3(View v)
    {
        if(mp11.isPlaying())
            mp11.stop();
        try {
            mp11.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[10]);
            mp11.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp11.prepare();
            mp11.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_blackkey4(View v)
    {
        if(mp12.isPlaying())
            mp12.stop();
        try {
            mp12.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[11]);
            mp12.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp12.prepare();
            mp12.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onClick_blackkey5(View v)
    {
        if(mp13.isPlaying())
            mp13.stop();
        try {
            mp13.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(songlist[12]);
            mp13.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mp13.prepare();
            mp13.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
>>>>>>> origin/master
}
