package com.example.divyanshujain.test;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class experiment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);

        final AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocompletetextview1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.activity_experiment2,COUNTRIES);
        actv.setAdapter(adapter);
    }
    static final String[] COUNTRIES = new String[]{"Hi", "Hello", "How"};
}