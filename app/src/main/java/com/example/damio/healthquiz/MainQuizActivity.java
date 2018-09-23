package com.example.damio.healthquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainQuizActivity extends AppCompatActivity {

    CheckBox question_1a, question_1b, question_1c, question_4b, question_4c, question_6a,
            question_6c, question_6e, question_1d, question_1e, question_4a, question_4d,
            question_6b, question_6d;

    RadioButton question_2a, question_2b, question_5a, question_5b, question_7a, question_7b;
    boolean question_2, question_5, question_7, question_21, question_51, question_71,
            isTrueA1, isTrueB1, isTrueC1, isTrueD1, isTrueE1, isTrueA4, isTrueB4, isTrueC4,
            isTrueD4, isTrueA6, isTrueB6, isTrueC6, isTrueD6, isTrueE6;

    EditText question_3, question_8;

    Button submitButton;

    private long total = 0;
    private int numberOfDiabetes;
    private String nameOfOrgan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        question_2 = false;
        question_5 = false;
        question_7 = false;
        question_21 = false;
        question_51 = false;
        question_71 = false;


        question_1a = (CheckBox) findViewById(R.id.question_1a);
        question_1a.setOnClickListener(selectClickListener);

        question_1b = (CheckBox) findViewById(R.id.question_1b);
        question_1b.setOnClickListener(selectClickListener);

        question_1c = (CheckBox) findViewById(R.id.question_1c);
        question_1c.setOnClickListener(selectClickListener);

        question_4b = (CheckBox) findViewById(R.id.question_4b);
        question_4b.setOnClickListener(selectClickListener);

        question_4c = (CheckBox) findViewById(R.id.question_4c);
        question_4c.setOnClickListener(selectClickListener);

        question_6a = (CheckBox) findViewById(R.id.question_6a);
        question_6a.setOnClickListener(selectClickListener);

        question_6c = (CheckBox) findViewById(R.id.question_6c);
        question_6c.setOnClickListener(selectClickListener);

        question_6e = (CheckBox) findViewById(R.id.question_6e);
        question_6e.setOnClickListener(selectClickListener);

        question_2a = (RadioButton) findViewById(R.id.question_2a);
        question_2a.setOnClickListener(selectClickListener);

        question_2b = (RadioButton) findViewById(R.id.question_2b);
        question_2b.setOnClickListener(selectClickListener);

        question_5a = (RadioButton) findViewById(R.id.question_5a);
        question_5a.setOnClickListener(selectClickListener);

        question_5b = (RadioButton) findViewById(R.id.question_5b);
        question_5b.setOnClickListener(selectClickListener);

        question_7a = (RadioButton) findViewById(R.id.question_7a);
        question_7a.setOnClickListener(selectClickListener);

        question_7b = (RadioButton) findViewById(R.id.question_7b);
        question_7b.setOnClickListener(selectClickListener);

        question_3 = (EditText) findViewById((R.id.question_3));
        question_8 = (EditText) findViewById((R.id.question_8));
    }

    View.OnClickListener selectClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.question_1a:
                    if (question_1a.isChecked()) {
                        isTrueA1 = true;
                    } else {
                        isTrueA1 = false;
                    }
                    break;

                case R.id.question_1d:
                    if (question_1d.isChecked()) {
                        isTrueD1 = true;
                    } else {
                        isTrueD1 = false;
                    }
                    break;

                case R.id.question_1e:
                    if (question_1e.isChecked()) {
                        isTrueE1 = true;
                    } else {
                        isTrueE1 = false;
                    }
                    break;

                case R.id.question_1b:
                    if (question_1b.isChecked()) {
                        isTrueB1 = true;
                    } else {
                        isTrueB1 = false;
                    }
                    break;

                case R.id.question_1c:
                    if (question_1c.isChecked()) {
                        isTrueC1 = true;
                    } else {
                        isTrueC1 = false;
                    }
                    break;

                case R.id.question_4b:
                    if (question_4b.isChecked()) {
                        isTrueB4 = true;
                    } else {
                        isTrueB4 = false;
                    }
                    break;

                case R.id.question_4a:
                    if (question_4a.isChecked()) {
                        isTrueA4 = true;
                    } else {
                        isTrueA4 = false;
                    }
                    break;

                case R.id.question_4d:
                    if (question_4d.isChecked()) {
                        isTrueD4 = true;
                    } else {
                        isTrueD4 = false;
                    }
                    break;

                case R.id.question_4c:
                    if (question_4c.isChecked()) {
                        isTrueC4 = true;
                    } else {
                        isTrueC4 = false;
                    }
                    break;

                case R.id.question_6c:
                    if (question_6c.isChecked()) {
                        isTrueC6 = true;
                    } else {
                        isTrueC6 = false;
                    }
                    break;

                case R.id.question_6b:
                    if (question_6b.isChecked()) {
                        isTrueB6 = true;
                    } else {
                        isTrueB6 = false;
                    }
                    break;

                case R.id.question_6d:
                    if (question_6d.isChecked()) {
                        isTrueD6 = true;
                    } else {
                        isTrueD6 = false;
                    }
                    break;

                case R.id.question_6a:
                    if (question_6a.isChecked()) {
                        isTrueA6 = true;
                    } else {
                        isTrueA6 = false;
                    }
                    break;

                case R.id.question_6e:
                    if (question_6e.isChecked()) {
                        isTrueE6 = true;
                    } else {
                        isTrueE6 = false;
                    }
                    break;

                case R.id.question_2a:
                    if (question_2a.isChecked()) {
                        question_2 = true;
                        question_21 = false;
                    }
                    break;

                case R.id.question_2b:
                    if (question_2b.isChecked()) {
                        question_21 = true;
                        question_2 = false;
                    }
                    break;

                case R.id.question_5a:
                    if (question_5a.isChecked()) {
                        question_5 = true;
                        question_51 = false;
                    }
                    break;

                case R.id.question_5b:
                    if (question_5b.isChecked()) {
                        question_51 = true;
                        question_5 = false;
                    }
                    break;


                case R.id.question_7a:
                    if (question_7a.isChecked()) {
                        question_7 = true;
                        question_71 = false;
                    }
                    break;

                case R.id.question_7b:
                    if (question_7b.isChecked()) {
                        question_71 = true;
                        question_7 = false;
                    }
                    break;
            }
        }
    };

    public void submit_button(View view) {

        if (isTrueA1 && isTrueB1 && isTrueC1 && !isTrueD1 && !isTrueE1) {
            total += (Integer.valueOf(question_1a.getTag().toString()) + Integer.valueOf(question_1b.getTag().toString()) + Integer.valueOf(question_1c.getTag().toString()));
        }

        if (!isTrueA4 && isTrueB4 && isTrueC4 && !isTrueD4) {
            total += (Integer.valueOf(question_4b.getTag().toString()) + Integer.valueOf(question_4c.getTag().toString()));
        }

        if (isTrueA6 && !isTrueB6 && isTrueC6 && !isTrueD6 && isTrueE6) {
            total += (Integer.valueOf(question_6a.getTag().toString()) + Integer.valueOf(question_6c.getTag().toString()) + Integer.valueOf(question_6e.getTag().toString()));
        }

        if (question_2 && !question_21) {
            total = total + Integer.valueOf(question_2a.getTag().toString());
        }

        if (question_5 && !question_51) {
            total = total + Integer.valueOf(question_5a.getTag().toString());
        }

        if (question_7 && !question_71) {
            total = total + Integer.valueOf(question_7a.getTag().toString());
        }

        if (question_3.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(this, "Missing number in question 3", Toast.LENGTH_LONG).show();
            return;
        }

        if (question_8.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(this, "Please enter the name of the organ in question 8", Toast.LENGTH_LONG).show();

            return;
        }

        numberOfDiabetes = Integer.valueOf(question_3.getText().toString());

        if (numberOfDiabetes == 3) {
            total = total + Integer.valueOf(question_3.getTag().toString());
        } else {

            total = total;
        }

        nameOfOrgan = question_8.getText().toString();
        if (nameOfOrgan.equalsIgnoreCase("Pancreas")) {
            total = total + Integer.valueOf(question_8.getTag().toString());
        } else {

        }
        displayTotal(String.valueOf(total));
        total = 0;
    }

    public void displayTotal(final String newTotal) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                this);
        alertDialog.setCancelable(true);
        alertDialog.setMessage("Your total Score is: \t \t \t" + newTotal + "\n\n Click on OK to start the quiz all over.");
        Toast.makeText(this, "Your total Score is: \n \n  \t \t \t \t" + newTotal, Toast.LENGTH_SHORT).show();
        alertDialog.setNegativeButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, int which) {
                        dialog.cancel();
                        total = 0;
                    }
                });
        alertDialog.show();
    }
}
