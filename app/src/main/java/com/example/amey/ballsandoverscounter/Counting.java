package com.example.amey.ballsandoverscounter;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amey on 3/11/2017.
 */

public class Counting extends AppCompatActivity {

    EditText overs;
    EditText completed;
    EditText balls;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counteractivity);
        String over;
        String c;
        int cmplt;
        c= String.valueOf(completed.getText());
        cmplt=Integer.parseInt(c);
        overs= (EditText) findViewById(R.id.overs);
        completed= (EditText) findViewById(R.id.completed);
        balls= (EditText) findViewById(R.id.balls);
        over=getIntent().getExtras().getString("ov");
        Log.d("over",over);
        overs.setText(over);
        completed.setText("0");
        balls.setText("0");

        if (cmplt == Integer.parseInt(String.valueOf(overs.getText())))
        {
            Toast.makeText(this, " All Overs completed", Toast.LENGTH_SHORT).show();
        }
    }



    public void plus(View view)
    {

        String b;
        int ball;
        String c;
        int cmplt;

        b= String.valueOf(balls.getText());
        ball= Integer.parseInt(b);
        c= String.valueOf(completed.getText());
        cmplt=Integer.parseInt(c);

        if(cmplt!=Integer.parseInt(String.valueOf(overs.getText()))) {
            ball++;
            balls.setText(""+ball);
            if (ball == 6) {
                balls.setText("" + ball);
                cmplt++;

                completed.setText("" + cmplt);




                balls.setText("0");

            }
        }
        else if (cmplt == Integer.parseInt(String.valueOf(overs.getText())))
        {
            Toast.makeText(this, " All Overs completed", Toast.LENGTH_SHORT).show();
        }

    }

    public void minus(View view)
    {
String b;
        int ball;
        b= String.valueOf(balls.getText());
        ball= Integer.parseInt(b);

        if(ball!=0) {


            ball--;
            balls.setText(""+ball);
        }
        else {

        }
    }

    public void reset(View view)
    {

balls.setText("0");
        completed.setText("0");

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
