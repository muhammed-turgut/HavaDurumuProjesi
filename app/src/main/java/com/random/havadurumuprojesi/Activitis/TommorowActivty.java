package com.random.havadurumuprojesi.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.random.havadurumuprojesi.Adapter.TommorowAdapter;
import com.random.havadurumuprojesi.Domains.TommorowDomain;
import com.random.havadurumuprojesi.R;

import java.util.ArrayList;

public class TommorowActivty extends AppCompatActivity {
    private RecyclerView.Adapter adapterTomorrow;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tommorow_activty);
        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TommorowActivty.this, MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<TommorowDomain> items = new ArrayList<>();
        items.add(new TommorowDomain("Pzt.", "storm", "storm", 25, 10));
        items.add(new TommorowDomain("Sal.", "cloudy", "rainy_sunny", 26, 11));
        items.add(new TommorowDomain("Çar.", "cloudy", "cloudy", 27, 12));
        items.add(new TommorowDomain("Per.", "cloudy_3", "cloudy_sunny", 28, 13));
        items.add(new TommorowDomain("Cum.", "cloudy_sunny", "storm", 29, 14));
        items.add(new TommorowDomain("Cmt.", "sun", "sunny", 30, 15));
        items.add(new TommorowDomain("Paz.", "rainy", "rainy", 25, 10));

        recyclerView = findViewById(R.id.View2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterTomorrow = new TommorowAdapter(items);
        recyclerView.setAdapter(adapterTomorrow);
    }
}

