package com.example.codetribe.myquizapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseTopics extends AppCompatActivity {

    AlertDialog.Builder bBallAlert;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topics);

        bBallAlert = new AlertDialog.Builder(this);

    }


    public void basketBallTopic (View view)
    {
        bBallAlert.setTitle("Basketball");
        bBallAlert.setMessage(R.string.basketball_history);


        bBallAlert.setPositiveButton(R.string.continue_quiz, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id){

                Intent intent = new Intent(ChooseTopics.this, Basketball.class);

                startActivity(intent);

            }

        });

        bBallAlert.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {

                dialog.dismiss();
            }

        });

        bBallAlert.show();
    }
}
