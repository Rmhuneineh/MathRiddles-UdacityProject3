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

            checkBox = (CheckBox) findViewById(R.id.seventh_monday);
            if (checkBox.isChecked()) {
                score++;
            }

            checkBox = (CheckBox) findViewById(R.id.eighth_24);
            if (checkBox.isChecked()) {
                score++;
            }

            checkBox = (CheckBox) findViewById(R.id.ninth_54);
            if (checkBox.isChecked()) {
                score++;
            }

            checkBox = (CheckBox) findViewById(R.id.tenth_9);
            if (checkBox.isChecked()) {
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
        } else {
            rating = "Excellent!";
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

        CheckBox check = (CheckBox) findViewById(R.id.sixth_friday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.sixth_monday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.sixth_wednesday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.sixth_saturday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.seventh_monday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.seventh_tuesday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.seventh_Thursday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.seventh_sunday);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.eighth_25);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.eighth_29);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.eighth_24);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.eighth_20);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.ninth_100);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.ninth_54);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.ninth_46);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.ninth_58);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.tenth_314);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.tenth_3);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.tenth_2);
        check.setChecked(false);

        check = (CheckBox) findViewById(R.id.tenth_9);
        check.setChecked(false);
    }

    /**
     * This method is called when the Monday in sixth question is checked
     */
    public void sixthMon(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.sixth_monday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.sixth_saturday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.sixth_wednesday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.sixth_friday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Saturday in sixth question is checked
     *
     * @param view
     */
    public void sixthSat(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.sixth_saturday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.sixth_monday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.sixth_wednesday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.sixth_friday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Monday in sixth question is checked
     *
     * @param view
     */
    public void sixthWed(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.sixth_wednesday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.sixth_saturday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.sixth_monday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.sixth_friday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Monday in sixth question is checked
     *
     * @param view
     */
    public void sixthFri(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.sixth_friday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.sixth_saturday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.sixth_wednesday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.sixth_monday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Monday in seventh question is checked
     *
     * @param view
     */
    public void seventhMon(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.seventh_monday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.seventh_sunday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.seventh_Thursday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.seventh_tuesday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Sunday in seventh question is checked
     *
     * @param view
     */
    public void seventhSun(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.seventh_sunday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.seventh_monday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.seventh_Thursday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.seventh_tuesday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Monday in seventh question is checked
     *
     * @param view
     */
    public void seventhThur(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.seventh_Thursday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.seventh_sunday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.seventh_monday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.seventh_tuesday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the Tuesday in seventh question is checked
     *
     * @param view
     */
    public void seventhTues(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.seventh_tuesday);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.seventh_sunday);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.seventh_Thursday);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.seventh_monday);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 29 in eigth question is checked
     *
     * @param view
     */
    public void eighth29(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.eighth_29);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.eighth_20);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.eighth_24);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.eighth_25);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 20 in eigth question is checked
     *
     * @param view
     */
    public void eighth20(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.eighth_20);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.eighth_29);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.eighth_24);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.eighth_25);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 24 in eigth question is checked
     *
     * @param view
     */
    public void eighth24(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.eighth_24);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.eighth_20);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.eighth_29);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.eighth_25);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 25 in eigth question is checked
     *
     * @param view
     */
    public void eighth25(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.eighth_25);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.eighth_20);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.eighth_24);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.eighth_29);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 58 in ninth question is checked
     *
     * @param view
     */
    public void ninth58(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.ninth_58);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.ninth_46);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.ninth_54);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.ninth_100);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 46 in ninth question is checked
     *
     * @param view
     */
    public void ninth46(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.ninth_46);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.ninth_58);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.ninth_54);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.ninth_100);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 54 in ninth question is checked
     *
     * @param view
     */
    public void ninth54(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.ninth_54);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.ninth_46);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.ninth_58);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.ninth_100);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 100 in ninth question is checked
     *
     * @param view
     */
    public void ninth100(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.ninth_100);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.ninth_46);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.ninth_58);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.ninth_54);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 9 in tenth question is checked
     *
     * @param view
     */
    public void tenth9(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.tenth_9);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.tenth_2);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.tenth_3);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.tenth_314);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 2 in tenth question is checked
     *
     * @param view
     */
    public void tenth2(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.tenth_2);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.tenth_9);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.tenth_3);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.tenth_314);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 3 in tenth question is checked
     *
     * @param view
     */
    public void tenth3(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.tenth_3);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.tenth_2);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.tenth_9);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.tenth_314);
            friBox.setChecked(false);
        }
    }

    /**
     * This method is called when the 314 in tenth question is checked
     *
     * @param view
     */
    public void tenth314(View view) {
        CheckBox monBox = (CheckBox) findViewById(R.id.tenth_314);
        boolean sixMon = monBox.isChecked();

        if (sixMon) {
            CheckBox satBox = (CheckBox) findViewById(R.id.tenth_2);
            satBox.setChecked(false);

            CheckBox wedBox = (CheckBox) findViewById(R.id.tenth_3);
            wedBox.setChecked(false);

            CheckBox friBox = (CheckBox) findViewById(R.id.tenth_9);
            friBox.setChecked(false);
        }
    }
}
