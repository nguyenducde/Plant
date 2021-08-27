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
import org.pytorch.demo.vision.PlantSpecies;
import org.pytorch.demo.vision.PlantSpeciesAdapter;

import java.util.ArrayList;

public class PlantListSpecies extends AppCompatActivity {
    SearchView searchview_species_list;
    TextView txt_family_tab;
    TextView txt_genus_tab;
    TextView txt_species_tab;
    ListView custom_listview_plant_species;

    ArrayList<PlantSpecies> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list_species);
        createData();

        searchview_species_list = findViewById(R.id.searchview_species_list);
        txt_family_tab = findViewById(R.id.txt_species_list_family_tab);
        txt_genus_tab = findViewById(R.id.txt_species_list_genus_tab);
        txt_species_tab = findViewById(R.id.txt_species_list_species_tab);
        custom_listview_plant_species = findViewById(R.id.custom_listview_plant_species);

        SpannableString content = new SpannableString("LOÀI");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        txt_species_tab.setText(content);

        PlantSpeciesAdapter adapter = new PlantSpeciesAdapter(this, R.layout.custom_listview_plant_species, data);
        custom_listview_plant_species.setAdapter(adapter);

        txt_genus_tab.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantListSpecies.this, PlantListGenus.class));
        });

        txt_family_tab.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(PlantListSpecies.this, PlantListFamily.class));
        });
    }

    private void createData(){
        data = new ArrayList<PlantSpecies>();
        data.add(new PlantSpecies(R.drawable.plant_chi_ven_ven,"Vên vên", R.drawable.plant_chi_dau, "Dầu nước"));
        data.add(new PlantSpecies(R.drawable.plant_chi_sao,"Sao đen", R.drawable.plant_chi_chai, "Chai lá cong"));
        data.add(new PlantSpecies(R.drawable.plant_chi_tau,"Táu trắng", R.drawable.cuccanhmoi, "Cúc cánh mối"));
        data.add(new PlantSpecies(R.drawable.boconganh,"Bồ công anh", R.drawable.camtucau, "Cẩm tú cầu"));
    }
}