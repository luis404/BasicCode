package com.lx.demolauncher;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.util.LongSparseArray;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("lx", "lxDemoLauncher , onCreate");
    boolean lx = false;
    testHashMapAndSparseArray();
    if(!lx){
      Intent it = new Intent(this, Welcome.class);
      startActivity(it);
      finish();
      return;
    }

    Log.d("lx", "can you");
    findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        dispatchTakePictureIntent();
      }
    });
  }

  @Override
  public void onStart(){
    super.onStart();
    Log.d("lx", "lxDemoLauncher , onStart");
  }

  @Override
  public void onResume(){
    super.onResume();
    Log.d("lx", "lxDemoLauncher , onResume");
  }
  @Override
  public void onPause(){
    super.onPause();
    Log.d("lx", "lxDemoLauncher , onPause");
  }
  @Override
  public void onStop(){
    super.onStop();
    Log.d("lx", "lxDemoLauncher , onStop");
  }
  @Override
  public void onDestroy(){
    super.onDestroy();
    Log.d("lx", "lxDemoLauncher , onDestroy");
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

  private void dispatchTakePictureIntent() {
    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
      startActivityForResult(takePictureIntent, 1);
    }
  }

  private void testHashMapAndSparseArray(){
    HashMap<Long, Info> hashMapA = new HashMap<>();
    HashMap<Long, Info> hashMapB = new HashMap<>();

    ArrayList<Info> a = new ArrayList<>();
    for(int i= 0; i<3; i++){
      Info x = new Info();
      x.value = i;
      hashMapA.put(new Long(i), x);
    }
    hashMapB.putAll(hashMapA);

    for(Info z: hashMapA.values()){ z.value += 100;}
    Log.d("LXhashmap", hashMapA.toString());
    Log.d("LXhashmap", hashMapB.toString());

    LongSparseArray<Info> sparseArrayA = new LongSparseArray<>();
    LongSparseArray<Info> sparseArrayB = new LongSparseArray<>();
    for(int i= 0; i<3; i++){
      Info x = new Info();
      x.value = i;
      sparseArrayA.put(new Long(i), x);
    }

    sparseArrayB = sparseArrayA.clone();
      for(int i= 0; i<3; i++){
        sparseArrayA.valueAt(i).value += 200;
      }
    Log.d("LXsparsearray", sparseArrayA.toString());
    Log.d("LXsparsearray", sparseArrayB.toString());
  }
}
