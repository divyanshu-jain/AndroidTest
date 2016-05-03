package com.example.divyanshujain.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class second3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);

        TextView tv = (TextView) findViewById(R.id.firstedittext);
        tv.setText(getIntent().getExtras().getString("keyforsendingtext"));

        Log.d("status","Done");
    }


}