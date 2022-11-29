package com.geektech.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("Sabyrgul","On create secondActivity");
        String text=getIntent().getStringExtra("key1");
        TextView textView=findViewById(R.id.text_view);
        textView.setText(text);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Sabyrgul","On start secondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Sabyrgul","On resume secondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Sabyrgul","On restart secondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Sabyrgul","On pause secondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Sabyrgul","On stop secondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Sabyrgul","On destroy secondActivity");
    }
}