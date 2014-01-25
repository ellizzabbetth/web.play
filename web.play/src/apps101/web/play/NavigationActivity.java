package apps101.web.play;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class NavigationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.navigation, menu);
		return true;
	}
	
	public void warButton(View v){
		Intent intent = new Intent(this, WarActivity.class);
		startActivity(intent);
		}
	
	public void jabberwockyButton(View v){
		Intent intent = new Intent(this, JabberwockyActivity.class);
		startActivity(intent);
		}
	
	public void nasaButton(View v){
		Intent intent = new Intent(this, NasaActivity.class);
		startActivity(intent);
		}
	
	public void roundballButton(View v){
		Intent intent = new Intent(this, RoundballActivity.class);
		startActivity(intent);
		}
	
	

}
