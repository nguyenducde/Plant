package org.pytorch.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class PlantInfoFruit extends AppCompatActivity {
    ImageView iv_Flower;
    ImageView iv_Leaf;
    ImageView iv_Fruit;
    ImageView iv_Other;
    ImageView iv_Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_plant_info_fruit);

        iv_Flower = findViewById(R.id.img_FruitInfo_Flower);
        iv_Leaf = findViewById(R.id.img_FruitInfo_Leaf);
        iv_Fruit = findViewById(R.id.img_FruitInfo_Fruit);
        iv_Other = findViewById(R.id.img_FruitInfo_Other);
        iv_Detail = findViewById(R.id.img_FruitInfo_Detail);

        iv_Flower.setClickable(true);
        iv_Leaf.setClickable(true);
        iv_Other.setClickable(true);
        iv_Detail.setClickable(true);

        iv_Flower.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoFruit.this, PlantInfoFlower.class));
        });

        iv_Leaf.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoFruit.this, PlantInfoLeaf.class));
        });

        iv_Other.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoFruit.this, PlantInfoOther.class));
        });

        iv_Detail.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoFruit.this, PlantInfoDetail.class));
        });
    }
}