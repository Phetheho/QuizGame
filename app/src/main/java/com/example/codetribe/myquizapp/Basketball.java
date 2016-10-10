package com.example.codetribe.myquizapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Basketball extends AppCompatActivity {


    String[] basketballQuestions = new String []{"Retired NBA player who has killed a lion:",
                                                "Has the largest shoe size:",
                                                "Current NBA Champions:",
                                                "He’s half Swiss, half South African:",
                                                "He is known as “The Black Mamba” in the NBA:"};


    String[] questionOneOptions = new String [] {"Thabo Sefolosha","Dikembe Mutombo","Manute Bol","Bismack Biyombo"};

    String[] questionTwoOptions = new String [] {"Tim Duncan","Shaquille O’Neal","Yao Ming","Russell Westbrook"};

    String[] questionThreeOptions = new String [] {"Cleveland Cavaliers","Los Angela’s Lakers","Golden State Warriors","Oklahoma City Thunder"};

    String[] questionFourOptions = new String [] {"Serge Ibaka","Thabo Sefolosha","Steve Nash","Festus Ezeli"};

    String[] questionFiveOptions = new String [] {"LeBron James","Kevin Durant","Steve Curry","Kobe Bryant"};


    String[] answers = new String [] {"Manute Bol","Shaquille O’Neal","Cleveland Cavaliers","Thabo Sefolosha","Kobe Bryant"};

    String[] rightAnswerMessage = new String[] {"Born into the Dinka tribe of the Nile Valley region of Africa, Manute Bol once killed a lion with a spear because it attacked his family’s cattle.",
                                        "Shaquille O’Neal has every player beat with a shoe size of 24-EEE. The largest in NBA history.",
                                        "Cleveland Cavaliers ",
                                        "Sefolosha was born in Vevey, Switzerland to Patrick Sefolosha, a South African musician, and Christine Sefolosha, a Swiss artist.",
                                        "After the sexual assault allegations back in 2003, Kobe Bryant adopted the nickname/alter ego, Black Mamba, as a way of coping with the ordeal that" +
                                                " almost derailed his career as a superstar in the NBA."};



    int questionId;
    int score;
    int currentQustion;


    //Defining components

    TextView questionTextView;
    RadioButton option1;
    RadioButton option2;
    RadioButton option3;
    RadioButton option4;

    FloatingActionButton myFab;

    AlertDialog.Builder rightAnswerAlert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        currentQustion = 0;

        loadNewQuestion();

        rightAnswerAlert = new AlertDialog.Builder(this);
    }


    public void loadNewQuestion(){

        myFab = (FloatingActionButton) findViewById(R.id.fab);

        myFab.setVisibility(View.INVISIBLE);


        questionTextView = (TextView) findViewById(R.id.qustion_text_view);

        option1 = (RadioButton) findViewById(R.id.option_1);
        option2 = (RadioButton) findViewById(R.id.option_2);
        option3 = (RadioButton) findViewById(R.id.option_3);
        option4 = (RadioButton) findViewById(R.id.option_4);



        questionTextView.setText(basketballQuestions[currentQustion]);


        switch (currentQustion){
            case 0:
            {
                option1.setText(questionOneOptions[0]);
                option2.setText(questionOneOptions[1]);
                option3.setText(questionOneOptions[2]);
                option4.setText(questionOneOptions[3]);
            }
            break;

            case 1:
            {
                option1.setText(questionTwoOptions[0]);
                option2.setText(questionTwoOptions[1]);
                option3.setText(questionTwoOptions[2]);
                option4.setText(questionTwoOptions[3]);
            }
            break;

            case 2:
            {
                option1.setText(questionThreeOptions[0]);
                option2.setText(questionThreeOptions[1]);
                option3.setText(questionThreeOptions[2]);
                option4.setText(questionThreeOptions[3]);
            }
            break;

            case 3:
            {
                option1.setText(questionFourOptions[0]);
                option2.setText(questionFourOptions[1]);
                option3.setText(questionFourOptions[2]);
                option4.setText(questionFourOptions[3]);
            }
            break;

            case 4:
            {
                option1.setText(questionFiveOptions[0]);
                option2.setText(questionFiveOptions[1]);
                option3.setText(questionFiveOptions[2]);
                option4.setText(questionFiveOptions[3]);
            }
            break;
        }

        option1.setChecked(false);
        option2.setChecked(false);
        option3.setChecked(false);
        option4.setChecked(false);

    }

    public void radioButtonOnClick (View view){

        boolean checked = ((RadioButton)view).isChecked();

        Toast toast;

        Context context = getApplicationContext();

        int duration = Toast.LENGTH_LONG;

        String message;

        score = 0;

        String possibleAnswer;

        option1 = (RadioButton) findViewById(R.id.option_1);
        option2 = (RadioButton) findViewById(R.id.option_2);
        option3 = (RadioButton) findViewById(R.id.option_3);
        option4 = (RadioButton) findViewById(R.id.option_4);


        rightAnswerAlert.setTitle("Correct answer");
        rightAnswerAlert.setMessage(rightAnswerMessage[currentQustion]);






        switch (view.getId()){
            case R.id.option_1:
                if (checked){
                    possibleAnswer = option1.getText().toString();

                    if (possibleAnswer == answers[currentQustion]){
                        score = 20;
                        message = "Correct Answer + " + score + " Points";

                        toast = Toast.makeText(context,message,duration);
                        toast.show();

                        currentQustion++;

                        myFab.setVisibility(View.VISIBLE);
                    }
                    else{

                        currentQustion++;

                        rightAnswerAlert.setPositiveButton("Next Question", new DialogInterface.OnClickListener(){

                            public void onClick (DialogInterface dialog, int id){

                                loadNewQuestion();

                            }
                        });

                        rightAnswerAlert.show();
                    }

                }
                break;
            case R.id.option_2:
                if (checked){
                    possibleAnswer = option2.getText().toString();

                    if (possibleAnswer == answers[currentQustion]){
                        score = 20;
                        message = "Correct Answer + " + score + " Points";

                        toast = Toast.makeText(context,message,duration);
                        toast.show();


                        currentQustion++;

                        myFab.setVisibility(View.VISIBLE);
                    }
                    else{

                        currentQustion++;

                        rightAnswerAlert.setPositiveButton("Next Question", new DialogInterface.OnClickListener(){

                            public void onClick (DialogInterface dialog, int id){

                                loadNewQuestion();

                            }
                        });

                        rightAnswerAlert.show();
                    }

                }
                break;
            case R.id.option_3:
                if (checked){
                    possibleAnswer = option3.getText().toString();

                    if (possibleAnswer == answers[currentQustion]){
                        score = 20;
                        message = "Correct Answer + " + score + " Points";

                        toast = Toast.makeText(context,message,duration);
                        toast.show();

                        currentQustion++;

                        myFab.setVisibility(View.VISIBLE);
                    }
                    else{

                        currentQustion++;

                        rightAnswerAlert.setPositiveButton("Next Question", new DialogInterface.OnClickListener(){

                            public void onClick (DialogInterface dialog, int id){

                                loadNewQuestion();

                            }
                        });

                        rightAnswerAlert.show();
                    }
                }
                break;
            case R.id.option_4:
                if (checked){
                    possibleAnswer = option4.getText().toString();

                    if (possibleAnswer == answers[currentQustion]){
                        score = 20;
                        message = "Correct Answer + " + score + " Points";
                        
                        toast = Toast.makeText(context,message,duration);
                        toast.show();

                        currentQustion++;

                        myFab.setVisibility(View.VISIBLE);
                    }
                    else{

                        currentQustion++;

                        rightAnswerAlert.setPositiveButton("Next Question", new DialogInterface.OnClickListener(){

                            public void onClick (DialogInterface dialog, int id){

                                loadNewQuestion();

                            }
                        });

                        rightAnswerAlert.show();
                    }

                }
                break;
        }
    }

    public void nextQuestion (View view){

        loadNewQuestion();
    }


}


