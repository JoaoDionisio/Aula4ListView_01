package com.example.goddionisio.aula4listview_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView minhaListView;

    private ArrayAdapter<String> arrayAdapter;

    String[] disciplinas = {"Matematica", "Portugues", "Fisica", "Quimica", "Ingles",
                            "Geografia", "Historia", "Informatica", "Musica"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaListView = findViewById(R.id.listview);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, disciplinas);

        minhaListView.setAdapter(arrayAdapter);


    }
}
