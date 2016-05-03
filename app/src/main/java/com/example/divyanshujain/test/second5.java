package com.example.divyanshujain.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class second5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second5);

        ImageView iv = (ImageView) findViewById(R.id.Imageview2);
        iv.setImageResource(R.mipmap.amsterdam);
    }


}
