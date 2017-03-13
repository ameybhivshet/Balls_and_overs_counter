package com.example.amey.ballsandoverscounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText minovers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minovers= (EditText) findViewById(R.id.minovers);

    }
        public void done(View view)
    {
        Intent intent;
        intent=new Intent(this,Counting.class);
        intent.putExtra("ov",String.valueOf(minovers.getText()));
        Log.d("a",String.valueOf(minovers.getText()));
        startActivity(intent);

    }






}
