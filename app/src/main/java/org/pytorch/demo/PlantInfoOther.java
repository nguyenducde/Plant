package org.pytorch.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class PlantInfoOther extends AppCompatActivity {
    ImageView iv_Flower;
    ImageView iv_Leaf;
    ImageView iv_Fruit;
    ImageView iv_Other;
    ImageView iv_Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_plant_info_other);

        iv_Flower = findViewById(R.id.img_OtherInfo_Flower);
        iv_Leaf = findViewById(R.id.img_OtherInfo_Leaf);
        iv_Fruit = findViewById(R.id.img_OtherInfo_Fruit);
        iv_Other = findViewById(R.id.img_OtherInfo_Other);
        iv_Detail = findViewById(R.id.img_OtherInfo_Detail);

        iv_Flower.setClickable(true);
        iv_Leaf.setClickable(true);
        iv_Fruit.setClickable(true);
        iv_Detail.setClickable(true);

        iv_Flower.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoOther.this, PlantInfoFlower.class));
        });

        iv_Leaf.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoOther.this, PlantInfoLeaf.class));
        });

        iv_Fruit.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoOther.this, PlantInfoFruit.class));
        });

        iv_Detail.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoOther.this, PlantInfoDetail.class));
        });
    }
}