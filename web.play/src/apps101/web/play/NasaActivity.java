package apps101.web.play;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;

public class NasaActivity extends Activity {
	WebView myWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_nasa);
		setContentView(R.layout.activity_main);
		myWebView = (WebView) findViewById(R.id.webView1);
 		myWebView.getSettings().setBuiltInZoomControls(true);
		   //myWebView.getSettings().setJavaScriptEnabled(true);
		// Open asset/index.html
		myWebView.loadUrl("file:///android_asset/uofi-at-nasa.html");
		   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nasa, menu);
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
}
