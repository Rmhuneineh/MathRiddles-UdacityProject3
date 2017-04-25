package com.example.android.mathriddles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when Submit button is pressed
     *
     * @param view
     */
    public void submitAnswers(View view) {
        EditText name = (EditText) findViewById(R.id.name_text);

        boolean flag = true;

        if (name.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter Your Name!", Toast.LENGTH_SHORT).show();
            flag = false;
        }

        if (flag) {
            score = 0;

            EditText text = (EditText) findViewById(R.id.first_answer);
            if (!text.getText().toString().isEmpty() && Integer.parseInt(text.getText().toString()) == 1) {
                score++;
            }

            text = (EditText) findViewById(R.id.second_answer);
            if (!text.getText().toString().isEmpty() && Integer.parseInt(text.getText().toString()) == 0) {
                score++;
            }

            text = (EditText) findViewById(R.id.third_answer);
            if (!text.getText().toString().isEmpty() && Integer.parseInt(text.getText().toString()) == 4) {
                score++;
            }

            text = (EditText) findViewById(R.id.fourth_answer);
            if (!text.getText().toString().isEmpty() && Integer.parseInt(text.getText().toString()) == 9) {
                score++;
            }

            text = (EditText) findViewById(R.id.fifth_answer);
            if (!text.getText().toString().isEmpty() && Integer.parseInt(text.getText().toString()) == 143547) {
                score++;
            }

            RadioButton radioButton = (RadioButton) findViewById(R.id.sixth_wednesday);
            if (radioButton.isChecked()) {
                score++;
            }

            radioButton = (RadioButton) findViewById(R.id.seventh_monday);
            if (radioButton.isChecked()) {
                score++;
            }

            radioButton = (RadioButton) findViewById(R.id.eighth_24);
            if (radioButton.isChecked()) {
                score++;
            }

            radioButton = (RadioButton) findViewById(R.id.ninth_54);
            if (radioButton.isChecked()) {
                score++;
            }

            radioButton = (RadioButton) findViewById(R.id.tenth_9);
            if (radioButton.isChecked()) {
                score++;
            }

            CheckBox ans1 = (CheckBox) findViewById(R.id.eleventh_nineThree);
            CheckBox ans2 = (CheckBox) findViewById(R.id.eleventh_threeOne);
            CheckBox ans3 = (CheckBox) findViewById(R.id.eleventh_sixOne);
            CheckBox ans4 = (CheckBox) findViewById(R.id.eleventh_sixTwo);
            if(ans1.isChecked() && !ans2.isChecked() && !ans3.isChecked() && ans4.isChecked()){
                score++;
            }

            ans1 = (CheckBox) findViewById(R.id.twelfth_fifteenTen);
            ans2 = (CheckBox) findViewById(R.id.twelfth_fourteenFourteen);
            ans3 = (CheckBox) findViewById(R.id.twelfth_seventeenEleven);
            ans4 = (CheckBox) findViewById(R.id.twelfth_sixteenTwelve);
            if(!ans1.isChecked() && ans2.isChecked() && ans3.isChecked() && ans4.isChecked()){
                score++;
            }

            ans1 = (CheckBox) findViewById(R.id.thirteenth_oneThree);
            ans2 = (CheckBox) findViewById(R.id.thirteenth_oneTwo);
            ans3 = (CheckBox) findViewById(R.id.thirteenth_sevenFive);
            ans4 = (CheckBox) findViewById(R.id.thirteenth_sevenSix);
            if(!ans1.isChecked() && ans2.isChecked() && ans3.isChecked() && !ans4.isChecked()){
                score++;
            }

            ans1 = (CheckBox) findViewById(R.id.fourteenth_elevenThirty);
            ans2 = (CheckBox) findViewById(R.id.fourteenth_tenTwenty);
            ans3 = (CheckBox) findViewById(R.id.fourteenth_thirtyEighty);
            ans4 = (CheckBox) findViewById(R.id.fourteenth_thirtyNinety);
            if(!ans1.isChecked() && ans2.isChecked() && ans3.isChecked() && !ans4.isChecked()){
                score++;
            }

            ans1 = (CheckBox) findViewById(R.id.fifteenth_fiveFive);
            ans2 = (CheckBox) findViewById(R.id.fifteenth_sevenTwoOne);
            ans3 = (CheckBox) findViewById(R.id.fifteenth_sixThreeTwo);
            ans4 = (CheckBox) findViewById(R.id.fifteenth_ten);
            if(ans1.isChecked() && ans2.isChecked() && !ans3.isChecked() && ans4.isChecked()){
                score++;
            }


            displayScore(score, name.getText().toString());
        }



    }

    /**
     * This method is responsible for showing the score through a toast message!
     *
     * @param score
     * @param name
     */
    public void displayScore(int score, String name) {
        String rating;
        if (score < 2) {
            rating = "Very Bad!";
        } else if (score >= 2 && score < 5) {
            rating = "Bad!";
        } else if (score >= 5 && score < 7) {
            rating = "Good!";
        } else if (score >= 7 && score <= 9) {
            rating = "Very Good!";
        } else if (score >= 10 && score <= 14){
            rating = "Excellent!";
        } else {
            rating = "GENIUS!";
        }

        Toast.makeText(this, name + "\'s Score = " + Integer.toString(score) + ". " + rating, Toast.LENGTH_SHORT).show();

    }


    /**
     * This method is called when the Reset button is clicked to erase everything
     */
    public void resetAll(View view) {
        score = 0;
        EditText text = (EditText) findViewById(R.id.first_answer);
        text.setText(null);

        text = (EditText) findViewById(R.id.second_answer);
        text.setText(null);

        text = (EditText) findViewById(R.id.third_answer);
        text.setText(null);

        text = (EditText) findViewById(R.id.fourth_answer);
        text.setText(null);

        text = (EditText) findViewById(R.id.fifth_answer);
        text.setText(null);

        text = (EditText) findViewById(R.id.name_text);
        text.setText(null);

        RadioButton radio = (RadioButton) findViewById(R.id.sixth_friday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.sixth_monday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.sixth_wednesday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.sixth_saturday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.seventh_monday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.seventh_tuesday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.seventh_Thursday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.seventh_sunday);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.eighth_25);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.eighth_29);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.eighth_24);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.eighth_20);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.ninth_100);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.ninth_54);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.ninth_46);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.ninth_58);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.tenth_314);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.tenth_3);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.tenth_2);
        radio.setChecked(false);

        radio = (RadioButton) findViewById(R.id.tenth_9);
        radio.setChecked(false);

        CheckBox ans1 = (CheckBox) findViewById(R.id.eleventh_nineThree);
        CheckBox ans2 = (CheckBox) findViewById(R.id.eleventh_threeOne);
        CheckBox ans3 = (CheckBox) findViewById(R.id.eleventh_sixOne);
        CheckBox ans4 = (CheckBox) findViewById(R.id.eleventh_sixTwo);
        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

        ans1 = (CheckBox) findViewById(R.id.twelfth_fifteenTen);
        ans2 = (CheckBox) findViewById(R.id.twelfth_fourteenFourteen);
        ans3 = (CheckBox) findViewById(R.id.twelfth_seventeenEleven);
        ans4 = (CheckBox) findViewById(R.id.twelfth_sixteenTwelve);
        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

        ans1 = (CheckBox) findViewById(R.id.thirteenth_oneThree);
        ans2 = (CheckBox) findViewById(R.id.thirteenth_oneTwo);
        ans3 = (CheckBox) findViewById(R.id.thirteenth_sevenFive);
        ans4 = (CheckBox) findViewById(R.id.thirteenth_sevenSix);
        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

        ans1 = (CheckBox) findViewById(R.id.fourteenth_elevenThirty);
        ans2 = (CheckBox) findViewById(R.id.fourteenth_tenTwenty);
        ans3 = (CheckBox) findViewById(R.id.fourteenth_thirtyEighty);
        ans4 = (CheckBox) findViewById(R.id.fourteenth_thirtyNinety);
        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);

        ans1 = (CheckBox) findViewById(R.id.fifteenth_fiveFive);
        ans2 = (CheckBox) findViewById(R.id.fifteenth_sevenTwoOne);
        ans3 = (CheckBox) findViewById(R.id.fifteenth_sixThreeTwo);
        ans4 = (CheckBox) findViewById(R.id.fifteenth_ten);
        ans1.setChecked(false);
        ans2.setChecked(false);
        ans3.setChecked(false);
        ans4.setChecked(false);
    }
}
