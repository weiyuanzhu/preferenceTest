package weiyuan.preferencetest;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {

	
	public static final String Panel_Pref = "pref_panelList";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingFragment()).commit();
		
		
		
		
		
	}

	
	
	
	
}
