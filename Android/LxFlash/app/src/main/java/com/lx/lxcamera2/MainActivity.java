package com.lx.lxcamera2;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

  private Button btn;
  private TextView tv;
  private boolean hasFlash;
  private boolean isStarted;

  private CameraManager cameraManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tv = (TextView)findViewById(R.id.result);
    hasFlash = this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);
    btn = (Button) findViewById(R.id.cameras);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        try {
          tv.setText("");
          String[] cameraLists = cameraManager.getCameraIdList();
          for(String camera:cameraLists){
            tv.append(camera+"\n");
          }
        } catch (CameraAccessException e) {
          e.printStackTrace();
        }
      }
    });
  }

  private void startFlashing(){
  }

  private void stopFlashing(){

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
