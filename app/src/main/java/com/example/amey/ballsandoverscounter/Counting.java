package com.example.amey.ballsandoverscounter;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by amey on 3/11/2017.
 */

public class Counting extends AppCompatActivity {

    EditText overs;
    EditText score, wickets2;
    String a, s;
    int add, sub;

    EditText completed;
    EditText balls,wickets1;
    ImageButton a1,a2,a3,a4,a5,a6,s1,s2,s3,s4,s5,s6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counteractivity);
        String over;
        String c;
        int cmplt;
        wickets1= (EditText) findViewById(R.id.wickets1);
        score= (EditText) findViewById(R.id.score);
        wickets2= (EditText) findViewById(R.id.wickets2);

        score.setText("0");
        wickets2.setText("0");
     //   wicketminus = (Button) findViewById(R.id.wicketsminus);
       // wicketplus = (Button) findViewById(R.id.wicketsplus);
        a1= (ImageButton) findViewById(R.id.add1);
        a2= (ImageButton) findViewById(R.id.add2);
        a3= (ImageButton) findViewById(R.id.add3);
        a4= (ImageButton) findViewById(R.id.add4);
        a5= (ImageButton) findViewById(R.id.add5);
        a6= (ImageButton) findViewById(R.id.add6);

        s1= (ImageButton) findViewById(R.id.sub1);
        s2= (ImageButton) findViewById(R.id.sub2);
        s3= (ImageButton) findViewById(R.id.sub3);
        s4= (ImageButton) findViewById(R.id.sub4);
        s5= (ImageButton) findViewById(R.id.sub5);
        s6= (ImageButton) findViewById(R.id.sub6);

        overs = (EditText) findViewById(R.id.overs);
        completed = (EditText) findViewById(R.id.completed);
        balls = (EditText) findViewById(R.id.balls);
        over = getIntent().getExtras().getString("ov");
        Log.d("over", over);
        overs.setText(over);
        completed.setText("0");
        balls.setText("0");
        wickets1.setText("0");
        c = String.valueOf(completed.getText());
        cmplt = Integer.parseInt(c);

        if (cmplt == Integer.parseInt(String.valueOf(overs.getText()))) {
            Toast.makeText(this, " All Overs completed", Toast.LENGTH_SHORT).show();
        }




        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add++;
                score.setText("" + add);

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add = add + 2;
                score.setText("" + add);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add = add + 3;
                score.setText("" + add);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add = add + 4;
                score.setText("" + add);
            }
        });


        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add = add + 5;
                score.setText("" + add);
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = score.getText().toString();
                add = Integer.parseInt(a);
                add = add + 6;
                score.setText("" + add);
            }
        });


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-1) < 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub - 1;
                    score.setText("" +sub);
                }
            }
        });


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-2) < 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub - 2;
                    score.setText("" +sub);
                }
            }
        });


        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-3)< 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub - 3;
                    score.setText("" +sub);
                }
            }
        });


        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-4) < 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub - 4;
                    score.setText("" +sub);
                }
            }
        });


        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-5) < 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub -5;
                    score.setText("" +sub);
                }
            }
        });


        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = score.getText().toString();
                sub = Integer.parseInt(s);
                if ((sub-6) < 0) {
                    Toast.makeText(Counting.this, "invalid operation", Toast.LENGTH_SHORT).show();
                } else {
                    sub = sub - 6;
                    score.setText("" +sub);
                }
            }
        });




    }


    public void plus(View view) {


        String b;
        int ball;
        String c;
        int cmplt;

        b = String.valueOf(balls.getText());
        ball = Integer.parseInt(b);
        c = String.valueOf(completed.getText());
        cmplt = Integer.parseInt(c);

        if (cmplt != Integer.parseInt(String.valueOf(overs.getText()))) {
            ball++;
            balls.setText("" + ball);


            if (ball == 6) {
                // balls.setText("" + ball);

                cmplt++;

                if (cmplt == 1) {
                    Toast.makeText(this, "" + cmplt + " over completed", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "" + cmplt + " overs completed", Toast.LENGTH_SHORT).show();
                }
                completed.setText("" + cmplt);


                if (cmplt == Integer.parseInt(String.valueOf(overs.getText()))) {
                    Toast.makeText(this, " All Overs completed", Toast.LENGTH_SHORT).show();
                }
                balls.setText("0");

            }
        } else if (cmplt == Integer.parseInt(String.valueOf(overs.getText()))) {
            Toast.makeText(this, " All Overs completed", Toast.LENGTH_SHORT).show();
        }

    }

    public void minus(View view) {
        String b;
        int ball;
        b = String.valueOf(balls.getText());
        ball = Integer.parseInt(b);

        if (ball != 0) {


            ball--;
            balls.setText("" + ball);
        } else {

        }
    }

    public void reset(View view) {

        balls.setText("0");
        completed.setText("0");
        overs.setText("0");

        Intent intent = new Intent(this, MainActivity.class);
        //   Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        //  startActivity(intent);
        startActivity(intent);
    }

    public void wicketplu(View view) {

        String w;
        int wickts;


              w= String.valueOf(wickets1.getText());
                wickts=Integer.parseInt(w);
                if(wickts==10)

                {
                    Toast.makeText(this, "all wickets have fallen", Toast.LENGTH_SHORT).show();

                }
                else {
                    wickts++;
                    wickets1.setText("" +wickts);
                    wickets2.setText("" +wickts);
                }










    }


public void wicketminu(View view)
{

    String w;
    int wickts;

    w= wickets1.getText().toString();
    wickts=Integer.parseInt(w);
    if(wickts==0)
    {
        Toast.makeText(this,  "Invalid operation", Toast.LENGTH_SHORT).show();

    }
    else {
        wickts--;
        wickets1.setText("" +wickts);
        wickets2.setText("" +wickts);
    }

}



}


