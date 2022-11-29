
package com.geektech.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Sabyrgul","On create");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Sabyrgul","On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Sabyrgul","On resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Sabyrgul","On restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Sabyrgul","On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Sabyrgul","On stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Sabyrgul","On destroy");
    }
    public void onClickOpen(View view){
       Intent intent=new Intent(MainActivity.this,SecondActivity.class);
       String text=findViewById(R.id.edit_text).toString();
       intent.putExtra("key1",text);
   startActivity(intent);
        //finish();
    }
}