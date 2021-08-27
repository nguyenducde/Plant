package org.pytorch.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import org.pytorch.demo.vision.PlantFamily;
import org.pytorch.demo.vision.PlantFamilyAdapter;

import java.util.ArrayList;

public class PlantListFamily extends AppCompatActivity {
    SearchView searchview_family_list;
    TextView txt_family_tab;
    TextView txt_genus_tab;
    TextView txt_species_tab;
    ListView custom_listview_plant_family;

    ArrayList<PlantFamily> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list_family);
        createData();

        searchview_family_list = findViewById(R.id.searchview_family_list);
        txt_family_tab = findViewById(R.id.txt_family_list_family_tab);
        txt_genus_tab = findViewById(R.id.txt_family_list_genus_tab);
        txt_species_tab = findViewById(R.id.txt_family_list_species_tab);
        custom_listview_plant_family = findViewById(R.id.custom_listview_plant_family);

        SpannableString content = new SpannableString("HỌ");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        txt_family_tab.setText(content);

        PlantFamilyAdapter adapter = new PlantFamilyAdapter(this, R.layout.custom_listview_plant_family, data);
        custom_listview_plant_family.setAdapter(adapter);

        txt_genus_tab.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantListFamily.this, PlantListGenus.class));
        });

        txt_species_tab.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantListFamily.this, PlantListSpecies.class));
        });
    }

    private void createData(){
        data = new ArrayList<PlantFamily>();
        data.add(new PlantFamily(R.drawable.blechnum,"HỌ DẦU", "Dipterocarpaceae Blume, 1825", "6"));
        data.add(new PlantFamily(R.drawable.cucnghenau,"HỌ CÚC", "Lorem ispum bla, 1905", "13"));
        data.add(new PlantFamily(R.drawable.cucnghenau,"HỌ CÚC", "Lorem ispum bla, 1905", "14"));
        data.add(new PlantFamily(R.drawable.cucnghenau,"HỌ CÚC", "Lorem ispum bla, 1905", "15"));
        data.add(new PlantFamily(R.drawable.cucnghenau,"HỌ CÚC", "Lorem ispum bla, 1905", "16"));
        data.add(new PlantFamily(R.drawable.cucnghenau,"HỌ CÚC", "Lorem ispum bla, 1905", "17"));
    }
}