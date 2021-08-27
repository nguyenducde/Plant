package org.pytorch.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import org.pytorch.demo.vision.ImageClassificationActivity;

public class ChoiceModel extends AppCompatActivity {
    ImageView iv_FlowerChoice;
    ImageView iv_LeafChoice;
    ImageView iv_OtherChoice;

    Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_model);

        String action = getIntent().getExtras().getString("action");

        switch (action) {
            case "take-photo":
                intent = new Intent(ChoiceModel.this, TakePhoto.class);
                break;
            case "pick-camera":
                intent = new Intent(ChoiceModel.this, PickCamera.class);
                break;
            case "realtime":
                intent = new Intent(ChoiceModel.this, ImageClassificationActivity.class);
                break;
            default:
                break;
        }

        iv_FlowerChoice = findViewById(R.id.img_flower);
        iv_LeafChoice = findViewById(R.id.img_leaf);
        iv_OtherChoice = findViewById(R.id.img_other);

        iv_FlowerChoice.setClickable(true);
        iv_FlowerChoice.setOnClickListener(v -> {
            intent.putExtra("model", "flower");
            finish();
            startActivity(intent);
        });

        iv_LeafChoice.setOnClickListener(v -> {
            intent.putExtra("model", "leaf");
            finish();
            startActivity(intent);
        });

        iv_OtherChoice.setOnClickListener(v -> {
            intent.putExtra("model", "other");
            finish();
            startActivity(intent);
        });
    }
}