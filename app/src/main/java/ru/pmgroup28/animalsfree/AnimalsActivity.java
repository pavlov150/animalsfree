package ru.pmgroup28.animalsfree;

import ru.pmgroup28.animalsfree.R;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AnimalsActivity extends Activity implements OnClickListener {

	private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anmals);


        setVolumeControlStream(AudioManager.STREAM_MUSIC);
	      findViewById(R.id.bear).setOnClickListener(this);
	      findViewById(R.id.bee).setOnClickListener(this);   
	      findViewById(R.id.cat).setOnClickListener(this);  
	      findViewById(R.id.chicken).setOnClickListener(this);  
	      findViewById(R.id.cobra).setOnClickListener(this);  
	      findViewById(R.id.cock).setOnClickListener(this);  
	      findViewById(R.id.cow).setOnClickListener(this);  
	      findViewById(R.id.crane).setOnClickListener(this); 
	      findViewById(R.id.crocodile).setOnClickListener(this); 
	      findViewById(R.id.crow).setOnClickListener(this); 
	      findViewById(R.id.cuckoo).setOnClickListener(this); 
	      findViewById(R.id.dog).setOnClickListener(this); 
	      findViewById(R.id.dolphin).setOnClickListener(this); 
	      findViewById(R.id.donkey).setOnClickListener(this); 
	      findViewById(R.id.dove).setOnClickListener(this); 
	      findViewById(R.id.duck).setOnClickListener(this); 
	      findViewById(R.id.eagle).setOnClickListener(this); 
	      findViewById(R.id.elephant).setOnClickListener(this); 
	      findViewById(R.id.flamingo).setOnClickListener(this); 
	      findViewById(R.id.fly).setOnClickListener(this); 
	      findViewById(R.id.fox).setOnClickListener(this); 
	      
    }

	   public void onClick(View v) {
		      int resId;
		      switch (v.getId()) {
		      case R.id.bear: resId = R.raw.bear; break;
		      case R.id.bee: resId = R.raw.bee; break;
		      case R.id.cat: resId = R.raw.cat; break;
		      case R.id.chicken: resId = R.raw.chicken; break;
		      case R.id.cobra: resId = R.raw.cobra; break;
		      case R.id.cock: resId = R.raw.cock; break;
		      case R.id.cow: resId = R.raw.cow; break;
		      case R.id.crane: resId = R.raw.crane; break;
		      case R.id.crocodile: resId = R.raw.crocodile; break;
		      case R.id.crow: resId = R.raw.crow; break;
		      case R.id.cuckoo: resId = R.raw.cuckoo; break;
		      case R.id.dog: resId = R.raw.dog; break;
		      case R.id.dolphin: resId = R.raw.dolphin; break;
		      case R.id.donkey: resId = R.raw.donkey; break;
		      case R.id.dove: resId = R.raw.dove; break;
		      case R.id.duck: resId = R.raw.duck; break;
		      case R.id.eagle: resId = R.raw.eagle; break;
		      case R.id.elephant: resId = R.raw.elephant; break;
		      case R.id.flamingo: resId = R.raw.flamingo; break;
		      case R.id.fly: resId = R.raw.fly; break;
		      case R.id.fox: resId = R.raw.fox; break;
		      default:            resId = R.raw.bear; break;
		      }
		      if (mp != null) {
		          mp.release(); 
		       }
		       // Create a new MediaPlayer to play this sound
		       mp = MediaPlayer.create(this, resId); 
		       mp.start();

		   }
	   

	   @Override 
	   public void onStop(){ 
	   super.onStop(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   
	   }
	   
	   @Override 
	   public void onDestroy(){ 
	   super.onDestroy(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   }
	   
	   @Override 
	   public void onPause(){ 
	   super.onPause(); 
	   if (mp != null) {
		   mp.stop(); 
	       }
	   }


	   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.anmals, menu);
        return true;
    }
    
}
