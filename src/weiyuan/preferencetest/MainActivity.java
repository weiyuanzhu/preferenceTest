package weiyuan.preferencetest;
import java.util.Set;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.app_base_menu, menu);	
		
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId()){
			case R.id.menu_settings:
				startSettings();
				return true;
		
			default:
				return super.onOptionsItemSelected(item);
			
			
		}
		
		
	}
	
	private void startSettings()
	{
		
		Intent intent = new Intent(this,SettingsActivity.class);
		startActivity(intent);
		
	}

	/**
	 * @param view
	 */
	public void prefTest(View view)
	{
		System.out.println("test");
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
		String panelLitIP = sharedPref.getString(SettingsActivity.Panel_Pref, "");
		boolean test = sharedPref.getBoolean("pref_sync", false);
		Set<String> testSet = null;
		testSet = sharedPref.getStringSet("pref_multi_select_panelList", testSet);
		
		System.out.println("------------ip----------" + panelLitIP);
		
		System.out.println("------------boolean----------" + test);
		System.out.println("------------testStringSet---------" + testSet);
		
		
	}
}
