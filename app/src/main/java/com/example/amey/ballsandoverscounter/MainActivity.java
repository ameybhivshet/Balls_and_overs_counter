package com.example.amey.ballsandoverscounter;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator{
    EditText minovers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        //minovers= (EditText) findViewById(R.id.minovers);

        FragmentManager manager = getFragmentManager();
        Mydialog mydialog = new Mydialog();
        mydialog.show(manager, "Mydialog");

    }

    @Override
    public void respond() {
      this.finish();
       // System.exit(0);
    }
   /*     public void done(View view)
    {
        Intent intent;
        intent=new Intent(this,Counting.class);
        if(minovers.getText().toString().matches("") ||Integer.parseInt(String.valueOf(minovers.getText()))==0 )
        {
            Toast.makeText(this, " enter a valid input ", Toast.LENGTH_SHORT).show();
        }
        else {

            intent.putExtra("ov", String.valueOf(minovers.getText()));
            Log.d("a", String.valueOf(minovers.getText()));
            startActivity(intent);
        }

    }







*/
}