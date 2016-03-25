package com.example.vohonglam.smarttripadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ClickMap1 (View View){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void Pictures1 (View View){
        Intent intent = new Intent(this, Pictures1.class);
        startActivity(intent);
    }

    public void ClickMap2 (View View){
        Intent intent = new Intent(this, MapsActivity2.class);
        startActivity(intent);
    }
    public void Pictures2 (View View){
        Intent intent = new Intent(this, Pictures2.class);
        startActivity(intent);
    }
    public void ClickMap3 (View View){
        Intent intent = new Intent(this, MapsActivity3.class);
        startActivity(intent);
    }
    public void Pictures3 (View View){
        Intent intent = new Intent(this, Pictures3.class);
        startActivity(intent);
    }
    public void ClickMap4 (View View){
        Intent intent = new Intent(this, MapsActivity4.class);
        startActivity(intent);
    }
    public void Pictures4 (View View){
        Intent intent = new Intent(this, Pictures4.class);
        startActivity(intent);
    }
    public void ClickMap5 (View View){
        Intent intent = new Intent(this, MapsActivity5.class);
        startActivity(intent);
    }
    public void Pictures5 (View View){
        Intent intent = new Intent(this, Pictures5.class);
        startActivity(intent);
    }
}
