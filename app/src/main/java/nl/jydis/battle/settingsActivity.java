package nl.jydis.battle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.navUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class settingsActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
  }
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.game, menu);
    return true;
    }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    } return super.onOptionsItemSelected(item);
  }
  
  //navigate up to parent
  public void up (View view){
    NavUtils.navigateUpFromSameTask(this);
  }
}
    
