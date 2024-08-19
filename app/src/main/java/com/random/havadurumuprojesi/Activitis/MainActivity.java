package com.random.havadurumuprojesi.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.random.havadurumuprojesi.Adapter.HourlyAdapter;
import com.random.havadurumuprojesi.Domains.Hourly;
import com.random.havadurumuprojesi.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        setVarisble();

    }

    private void setVarisble() {
        TextView nextBtn=findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TommorowActivty.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<Hourly> items = new ArrayList<>();
        items.add(new Hourly("10 pm", 28, "cloudy"));
        items.add(new Hourly("11 pm", 29, "sun"));
        items.add(new Hourly("12 pm", 30, "cloudy"));
        items.add(new Hourly("13 pm", 31, "wind"));
        items.add(new Hourly("14 pm", 32, "cloudy"));
        items.add(new Hourly("15 pm", 33, "rainy"));
        items.add(new Hourly("16 pm", 34, "cloudy"));

        // recyclerView'i findViewById ile bulmalısınız
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterHourly = new HourlyAdapter(items);
        recyclerView.setAdapter(adapterHourly);
    }

}
