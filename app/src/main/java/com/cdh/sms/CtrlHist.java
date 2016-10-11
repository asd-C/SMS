package com.cdh.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class CtrlHist extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hist);

        ArrayList<String> itens = new ArrayList<>();
        itens.add("Sanduiche1");
        itens.add("Sanduiche2");
        itens.add("Sanduiche3");
        itens.add("Sanduiche4");
        itens.add("Sanduiche5");
        itens.add("Sanduiche6");
        itens.add("Sanduiche7");
        itens.add("Sanduiche8");
        itens.add("Sanduiche9");
        itens.add("Sanduiche10");
        itens.add("Sanduiche1");
        itens.add("Sanduiche2");
        itens.add("Sanduiche3");
        itens.add("Sanduiche4");
        itens.add("Sanduiche5");
        itens.add("Sanduiche6");
        itens.add("Sanduiche7");
        itens.add("Sanduiche8");
        itens.add("Sanduiche9");
        itens.add("Sanduiche10");

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setOnItemClickListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, itens);
        listView.setAdapter(adapter);

    }

    public void nextDe(View view) {
        startActivity(new Intent(this, CtrlMontar.class));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, CtrlDest.class));
    }
}
