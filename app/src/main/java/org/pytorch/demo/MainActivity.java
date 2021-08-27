package org.pytorch.demo;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import org.pytorch.demo.vision.ImageClassificationActivity;
import org.pytorch.demo.vision.database.DataBaseHelper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  private Button btnShow;
  private Button btnCapture;
  private Button btnRealtime;
  private Button btnGetImage;
  ImageView IVPreviewImage;
  DataBaseHelper db=new DataBaseHelper(this);

  // constant to compare
  // the activity result code
  int SELECT_PICTURE = 200;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    //db.insertGenus_Plant();
    //System.out.print("Dữ liệu"+db.getDataGenus_Plant());
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//    findViewById(R.id.btnShow).setOnClickListener(v3 -> startActivities(new Intent[]{new Intent(MainActivity.this,Introduce.class)}));
    findViewById(R.id.btnShow).setOnClickListener(v3 -> startActivities(new Intent[]{new Intent(MainActivity.this, PlantListFamily.class)}));
    findViewById(R.id.btnGetImage).setOnClickListener(v1 -> startActivities(new Intent[]{new Intent(MainActivity.this, ChoiceModel.class).putExtra("action", "pick-camera")}));
    findViewById(R.id.btnRealtime).setOnClickListener(v -> startActivities(new Intent[]{new Intent(MainActivity.this,ChoiceModel.class).putExtra("action", "realtime")}));
    findViewById(R.id.btnCapture).setOnClickListener(v2 -> startActivities(new Intent[]{new Intent(MainActivity.this,TakePhoto.class)}));
  }
}