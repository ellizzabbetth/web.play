package apps101.web.play;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find webView1
        myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.getSettings().setBuiltInZoomControls(true);
        //myWebView.getSettings().setJavaScriptEnabled(true);
        // Open asset/index.html
        myWebView.loadUrl("file:///android_asset/waroftheworlds.html");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    // hello

@Override
public boolean onKeyDown(int keyCode, KeyEvent event){
	 if((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
    	 myWebView.goBack();
     	return true;
    }
    return super.onKeyDown(keyCode, event);
 
}
}
