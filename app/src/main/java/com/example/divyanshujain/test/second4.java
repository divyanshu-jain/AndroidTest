package com.example.divyanshujain.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class second4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second4);

        ImageView iv = (ImageView) findViewById(R.id.Imageview1);
        iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));

    }


}
