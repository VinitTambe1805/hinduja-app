package com.example.hinduja_health_first;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class RecycleActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        spinner = findViewById(R.id.spinner);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);



        List<item> items = new ArrayList<item>();
        items.add(new item("Cardiologist", R.drawable.c));
        items.add(new item("Dermatologist", R.drawable.dt));
        items.add(new item("Dermatologist", R.drawable.dm));
        items.add(new item("Diabetologist", R.drawable.db));
        items.add(new item("Gastroenterologist", R.drawable.g));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.options_List,
                android.R.layout.activity_list_item);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        }



    }
