package apps101.web.play;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {
	WebView myWebView;
	MediaPlayer sound;
	WebView jabber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);
		myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.loadUrl("file:///android_asset/jabberwocky.html");
		sound = MediaPlayer.create(this, R.raw.hal_game);	
	}
	
	public void openWiki(View v){
		String url = "http://en.wikipedia.org/wiki/Jabberwocky";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	public void openJabberImage(View V) {
		//setContentView(R.layout.activity_jabberwocky);
		jabber = (WebView) findViewById(R.id.webView1);
	//	myWebView.getSettings().setBuiltInZoomControls(true);
		jabber.loadUrl("file:///android_asset/jabber.jpg");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.e("Pickle", "onResume");
		sound = MediaPlayer.create(this, R.raw.hal_game);
		sound.setLooping(true);
		sound.start();

		
		super.onResume();
	}
	@Override 
	protected void onPause() { 
	 	Log.e("Pickle", "onPause"); 
	 	sound.stop(); 
	 	sound.release(); 
	 	super.onPause(); 
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jabberwocky, menu);
		return true;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event){
		 if((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
	    	 myWebView.goBack();
	     	return true;
	    }
	    return super.onKeyDown(keyCode, event);
	 
	}
	
	@Override
	public void onBackPressed() {
	   if (myWebView.canGoBack()) {
	        myWebView.goBack();
	   } else {
	       super.onBackPressed(); 
	   }
	}
}
