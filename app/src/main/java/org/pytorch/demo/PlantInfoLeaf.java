package org.pytorch.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class PlantInfoLeaf extends AppCompatActivity {
    ImageView iv_Flower;
    ImageView iv_Leaf;
    ImageView iv_Fruit;
    ImageView iv_Other;
    ImageView iv_Detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_plant_info_leaf);

        iv_Flower = findViewById(R.id.img_LeafInfo_Flower);
        iv_Leaf = findViewById(R.id.img_LeafInfo_Leaf);
        iv_Fruit = findViewById(R.id.img_LeafInfo_Fruit);
        iv_Other = findViewById(R.id.img_LeafInfo_Other);
        iv_Detail = findViewById(R.id.img_LeafInfo_Detail);

        iv_Flower.setClickable(true);
        iv_Fruit.setClickable(true);
        iv_Other.setClickable(true);
        iv_Detail.setClickable(true);

        iv_Flower.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoLeaf.this, PlantInfoFlower.class));
        });

        iv_Fruit.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoLeaf.this, PlantInfoFruit.class));
        });

        iv_Other.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoLeaf.this, PlantInfoOther.class));
        });

        iv_Detail.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantInfoLeaf.this, PlantInfoDetail.class));
        });
    }
}