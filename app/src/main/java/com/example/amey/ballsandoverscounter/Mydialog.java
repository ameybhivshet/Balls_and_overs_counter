package com.example.amey.ballsandoverscounter;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amey on 7/4/2017.
 */
public class Mydialog extends DialogFragment {

    Button done, exit;
    Communicator comm;
EditText minovers;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.dialog, container, false);
        getDialog().setTitle("no of overs");
        setCancelable(false);
        minovers= (EditText) rootview.findViewById(R.id.minovers);
        done = (Button) rootview.findViewById(R.id.done);
        exit = (Button) rootview.findViewById(R.id.exit);
        return rootview;
        //return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        comm = (Communicator) activity;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(getActivity(),Counting.class);
                if(minovers.getText().toString().matches("") ||Integer.parseInt(String.valueOf(minovers.getText()))==0 )
                {
                    Toast.makeText(getActivity(), " enter a valid input ", Toast.LENGTH_SHORT).show();
                }
                else {

                    intent.putExtra("ov", String.valueOf(minovers.getText()));
                    Log.d("a", String.valueOf(minovers.getText()));
                    startActivity(intent);
                }

            }
        });

       exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
comm.respond();
            }
        });


    }

    public interface Communicator {
         void respond();
    }

}

