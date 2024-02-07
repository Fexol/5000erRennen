package com.example.a5k;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    MenuItem isEditableMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);


        EditText wins1 = findViewById(R.id.wins1);
        EditText wins2 = findViewById(R.id.wins2);
        EditText wins3 = findViewById(R.id.wins3);
        EditText wins4 = findViewById(R.id.wins4);
        EditText player1 = findViewById(R.id.name1);
        EditText player2 = findViewById(R.id.name2);
        EditText player3 = findViewById(R.id.name3);
        EditText player4 = findViewById(R.id.name4);

        EditText player4Wins = findViewById(R.id.wins4);
        EditText player4Name = findViewById(R.id.name4);
        View player4WinsLine = findViewById(R.id.player4WinsLine);
        View player4NameLine = findViewById(R.id.player4NameLine);

        Button addScoreButton1 = findViewById(R.id.addCurrentRollButton1);
        Button addScoreButton2 = findViewById(R.id.addCurrentRollButton2);
        Button addScoreButton3 = findViewById(R.id.addCurrentRollButton3);
        Button addScoreButton4 = findViewById(R.id.addCurrentRollButton4);

        EditText currentRolls1 = findViewById(R.id.current_rolls_1);
        EditText currentRolls2 = findViewById(R.id.current_rolls_2);
        EditText currentRolls3 = findViewById(R.id.current_rolls_3);
        EditText currentRolls4 = findViewById(R.id.current_rolls_4);

        RelativeLayout rel = findViewById(R.id.relativeLayout);
        ScrollView currentRollsPlayer4ScrollView = findViewById(R.id.current_rolls_4_scroll);
        EditText currentRollsPlayer4 = findViewById(R.id.current_rolls_4);
        Button currentRollsButton4 = findViewById(R.id.addCurrentRollButton4);
        View totalScore4Line = findViewById(R.id.totalScore4Line);
        TextView totalScore4 = findViewById(R.id.total_score_4);
        TextView totalScore1 = findViewById(R.id.total_score_1);
        TextView totalScore2 = findViewById(R.id.total_score_2);
        TextView totalScore3 = findViewById(R.id.total_score_3);

        wins1.setText(prefs.getString("wins1", ""));
        wins2.setText(prefs.getString("wins2", ""));
        wins3.setText(prefs.getString("wins3", ""));
        wins4.setText(prefs.getString("wins4", ""));
        player1.setText(prefs.getString("player1", ""));
        player2.setText(prefs.getString("player2", ""));
        player3.setText(prefs.getString("player3", ""));
        player4.setText(prefs.getString("player4", ""));

        currentRolls1.setText(prefs.getString("currentRolls1", ""));
        currentRolls2.setText(prefs.getString("currentRolls2", ""));
        currentRolls3.setText(prefs.getString("currentRolls3", ""));
        currentRolls4.setText(prefs.getString("currentRolls4", ""));

        totalScore1.setText(prefs.getString("totalScore1", ""));
        totalScore2.setText(prefs.getString("totalScore2", ""));
        totalScore3.setText(prefs.getString("totalScore3", ""));
        totalScore4.setText(prefs.getString("totalScore4", ""));

        // nightMode off
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);




        wins1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("wins1", s.toString()).commit();
            }

        });

        wins2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("wins2", s.toString()).commit();
            }

        });

        wins3.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("wins3", s.toString()).commit();
            }

        });

        wins4.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("wins4", s.toString()).commit();
            }

        });

        player1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("player1", s.toString()).commit();
            }

        });

        player2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("player2", s.toString()).commit();
            }

        });

        player3.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("player3", s.toString()).commit();
            }

        });

        player4.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                prefs.edit().putString("player4", s.toString()).commit();
            }

        });

        //currentRolls1.setText("200" + "\n" + "400" + "\n" + "200" + "\n" + "400");

        String playerCount = prefs.getString("playerCount", "");

        if (playerCount.equals("3")) {
            int i = 0;

            player4Wins.setVisibility(View.GONE);
            player4Name.setVisibility(View.GONE);
            player4WinsLine.setVisibility(View.GONE);
            player4NameLine.setVisibility(View.GONE);

            currentRollsButton4.setVisibility(View.GONE);
            totalScore4.setVisibility(View.GONE);
            totalScore4Line.setVisibility(View.GONE);
            currentRollsPlayer4ScrollView.setVisibility(View.GONE);
            currentRollsPlayer4ScrollView.invalidate();
            currentRollsPlayer4ScrollView.requestLayout();
            rel.invalidate();
            rel.requestLayout();
        } else {
            player4Wins.setVisibility(View.VISIBLE);
            player4Name.setVisibility(View.VISIBLE);
            player4WinsLine.setVisibility(View.VISIBLE);
            player4NameLine.setVisibility(View.VISIBLE);

            currentRollsButton4.setVisibility(View.VISIBLE);
            totalScore4.setVisibility(View.VISIBLE);
            totalScore4Line.setVisibility(View.VISIBLE);
            currentRollsPlayer4ScrollView.setVisibility(View.VISIBLE);
            currentRollsPlayer4ScrollView.invalidate();
            currentRollsPlayer4ScrollView.requestLayout();
            rel.invalidate();
            rel.requestLayout();
        }

        String isEnabledCheck = prefs.getString("isEnabled", "").toString();

        if (isEnabledCheck.equals("") | isEnabledCheck.equals("0")) {
            currentRolls1.setEnabled(false);
            currentRolls2.setEnabled(false);
            currentRolls3.setEnabled(false);
            currentRolls4.setEnabled(false);
        } else {
            currentRolls1.setEnabled(true);
            currentRolls2.setEnabled(true);
            currentRolls3.setEnabled(true);
            currentRolls4.setEnabled(true);
        }

        addScoreButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_add_score, null);

                TextView addScore = mView.findViewById(R.id.add_score_textview);

                Button add1 = mView.findViewById(R.id.add_button_1);
                Button add2 = mView.findViewById(R.id.add_button_2);
                Button add3 = mView.findViewById(R.id.add_button_3);
                Button add4 = mView.findViewById(R.id.add_button_4);
                Button add5 = mView.findViewById(R.id.add_button_5);
                Button add6 = mView.findViewById(R.id.add_button_6);
                Button add7 = mView.findViewById(R.id.add_button_7);
                Button add8 = mView.findViewById(R.id.add_button_8);
                Button add9 = mView.findViewById(R.id.add_button_9);
                Button add50 = mView.findViewById(R.id.add_button_50);
                Button add0 = mView.findViewById(R.id.add_button_0);
                Button add00 = mView.findViewById(R.id.add_button_00);
                Button addOk = mView.findViewById(R.id.add_button_ok);
                Button addCancel = mView.findViewById(R.id.add_button_cancel);
                Button deleteScore = mView.findViewById(R.id.deleteScoreButton);
                TextView totalScore1 = findViewById(R.id.total_score_1);


                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                add1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "1");
                    }
                });

                add2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "2");
                    }
                });

                add3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "3");
                    }
                });

                add4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "4");
                    }
                });

                add5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "5");
                    }
                });

                add6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "6");
                    }
                });

                add7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "7");
                    }
                });

                add8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "8");
                    }
                });

                add9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "9");
                    }
                });

                add50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "50");
                    }
                });

                add0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "0");
                    }
                });

                add00.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "00");
                    }
                });

                addOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (addScore.getText().toString().equals("")) {
                            dialog.dismiss();
                        } else {
                            if (Integer.parseInt(addScore.getText().toString()) % 50 == 0 && Integer.parseInt(addScore.getText().toString()) >= 350) {
                                currentRolls1.setText(((currentRolls1.getText().toString().equals("")) ? (currentRolls1.getText().toString() + addScore.getText().toString()) : (currentRolls1.getText().toString() + "\n" + addScore.getText().toString())));
                                prefs.edit().putString("currentRolls1", currentRolls1.getText().toString()).commit();
                                Integer score = 0;
                                if (!currentRolls1.getText().toString().isEmpty()) {
                                    String segments[] = currentRolls1.getText().toString().split("\n");
                                    Integer number[] = new Integer[segments.length];
                                    for (int i = 0; i < segments.length; i++) {
                                        number[i] = Integer.parseInt(segments[i]);
                                    }
                                    for (int j = 0; j < number.length; j++) {
                                        score = score + number[j];
                                    }
                                }
                                totalScore1.setText(score.toString());
                                prefs.edit().putString("totalScore1", totalScore1.getText().toString()).commit();
                                dialog.dismiss();
                            } else {
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });

                addCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        //addScore.setText(addScore.getText().toString() + "1");
                    }
                });

                deleteScore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText((addScore.getText().toString().length() > 0) ? (addScore.getText().toString().substring(0, addScore.getText().toString().length() - 1)) : addScore.getText().toString());
                    }
                });
            }
        });

        addScoreButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_add_score, null);

                TextView addScore = mView.findViewById(R.id.add_score_textview);

                Button add1 = mView.findViewById(R.id.add_button_1);
                Button add2 = mView.findViewById(R.id.add_button_2);
                Button add3 = mView.findViewById(R.id.add_button_3);
                Button add4 = mView.findViewById(R.id.add_button_4);
                Button add5 = mView.findViewById(R.id.add_button_5);
                Button add6 = mView.findViewById(R.id.add_button_6);
                Button add7 = mView.findViewById(R.id.add_button_7);
                Button add8 = mView.findViewById(R.id.add_button_8);
                Button add9 = mView.findViewById(R.id.add_button_9);
                Button add50 = mView.findViewById(R.id.add_button_50);
                Button add0 = mView.findViewById(R.id.add_button_0);
                Button add00 = mView.findViewById(R.id.add_button_00);
                Button addOk = mView.findViewById(R.id.add_button_ok);
                Button addCancel = mView.findViewById(R.id.add_button_cancel);
                Button deleteScore = mView.findViewById(R.id.deleteScoreButton);
                TextView totalScore2 = findViewById(R.id.total_score_2);


                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                add1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "1");
                    }
                });

                add2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "2");
                    }
                });

                add3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "3");
                    }
                });

                add4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "4");
                    }
                });

                add5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "5");
                    }
                });

                add6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "6");
                    }
                });

                add7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "7");
                    }
                });

                add8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "8");
                    }
                });

                add9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "9");
                    }
                });

                add50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "50");
                    }
                });

                add0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "0");
                    }
                });

                add00.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "00");
                    }
                });

                addOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (addScore.getText().toString().equals("")) {
                            dialog.dismiss();
                        } else {
                            if (Integer.parseInt(addScore.getText().toString()) % 50 == 0 && Integer.parseInt(addScore.getText().toString()) >= 350) {
                                currentRolls2.setText(((currentRolls2.getText().toString().equals("")) ? (currentRolls2.getText().toString() + addScore.getText().toString()) : (currentRolls2.getText().toString() + "\n" + addScore.getText().toString())));
                                prefs.edit().putString("currentRolls2", currentRolls2.getText().toString()).commit();
                                Integer score = 0;
                                if (!currentRolls2.getText().toString().isEmpty()) {
                                    String segments[] = currentRolls2.getText().toString().split("\n");
                                    Integer number[] = new Integer[segments.length];
                                    for (int i = 0; i < segments.length; i++) {
                                        number[i] = Integer.parseInt(segments[i]);
                                    }
                                    for (int j = 0; j < number.length; j++) {
                                        score = score + number[j];
                                    }
                                }
                                totalScore2.setText(score.toString());
                                prefs.edit().putString("totalScore2", totalScore2.getText().toString()).commit();
                                dialog.dismiss();
                            } else {
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });

                addCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                deleteScore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText((addScore.getText().toString().length() > 0) ? (addScore.getText().toString().substring(0, addScore.getText().toString().length() - 1)) : addScore.getText().toString());
                    }
                });
            }
        });

        addScoreButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_add_score, null);

                TextView addScore = mView.findViewById(R.id.add_score_textview);

                Button add1 = mView.findViewById(R.id.add_button_1);
                Button add2 = mView.findViewById(R.id.add_button_2);
                Button add3 = mView.findViewById(R.id.add_button_3);
                Button add4 = mView.findViewById(R.id.add_button_4);
                Button add5 = mView.findViewById(R.id.add_button_5);
                Button add6 = mView.findViewById(R.id.add_button_6);
                Button add7 = mView.findViewById(R.id.add_button_7);
                Button add8 = mView.findViewById(R.id.add_button_8);
                Button add9 = mView.findViewById(R.id.add_button_9);
                Button add50 = mView.findViewById(R.id.add_button_50);
                Button add0 = mView.findViewById(R.id.add_button_0);
                Button add00 = mView.findViewById(R.id.add_button_00);
                Button addOk = mView.findViewById(R.id.add_button_ok);
                Button addCancel = mView.findViewById(R.id.add_button_cancel);
                Button deleteScore = mView.findViewById(R.id.deleteScoreButton);
                TextView totalScore3 = findViewById(R.id.total_score_3);


                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                add1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "1");
                    }
                });

                add2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "2");
                    }
                });

                add3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "3");
                    }
                });

                add4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "4");
                    }
                });

                add5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "5");
                    }
                });

                add6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "6");
                    }
                });

                add7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "7");
                    }
                });

                add8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "8");
                    }
                });

                add9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "9");
                    }
                });

                add50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "50");
                    }
                });

                add0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "0");
                    }
                });

                add00.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "00");
                    }
                });

                addOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (addScore.getText().toString().equals("")) {
                            dialog.dismiss();
                        } else {
                            if (Integer.parseInt(addScore.getText().toString()) % 50 == 0 && Integer.parseInt(addScore.getText().toString()) >= 350) {
                                currentRolls3.setText(((currentRolls3.getText().toString().equals("")) ? (currentRolls3.getText().toString() + addScore.getText().toString()) : (currentRolls3.getText().toString() + "\n" + addScore.getText().toString())));
                                prefs.edit().putString("currentRolls3", currentRolls3.getText().toString()).commit();
                                Integer score = 0;
                                if (!currentRolls3.getText().toString().isEmpty()) {
                                    String segments[] = currentRolls3.getText().toString().split("\n");
                                    Integer number[] = new Integer[segments.length];
                                    for (int i = 0; i < segments.length; i++) {
                                        number[i] = Integer.parseInt(segments[i]);
                                    }
                                    for (int j = 0; j < number.length; j++) {
                                        score = score + number[j];
                                    }
                                }
                                totalScore3.setText(score.toString());
                                prefs.edit().putString("totalScore3", totalScore3.getText().toString()).commit();
                                dialog.dismiss();
                            } else {
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });

                addCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                deleteScore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText((addScore.getText().toString().length() > 0) ? (addScore.getText().toString().substring(0, addScore.getText().toString().length() - 1)) : addScore.getText().toString());
                    }
                });
            }
        });

        addScoreButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_add_score, null);

                TextView addScore = mView.findViewById(R.id.add_score_textview);

                Button add1 = mView.findViewById(R.id.add_button_1);
                Button add2 = mView.findViewById(R.id.add_button_2);
                Button add3 = mView.findViewById(R.id.add_button_3);
                Button add4 = mView.findViewById(R.id.add_button_4);
                Button add5 = mView.findViewById(R.id.add_button_5);
                Button add6 = mView.findViewById(R.id.add_button_6);
                Button add7 = mView.findViewById(R.id.add_button_7);
                Button add8 = mView.findViewById(R.id.add_button_8);
                Button add9 = mView.findViewById(R.id.add_button_9);
                Button add50 = mView.findViewById(R.id.add_button_50);
                Button add0 = mView.findViewById(R.id.add_button_0);
                Button add00 = mView.findViewById(R.id.add_button_00);
                Button addOk = mView.findViewById(R.id.add_button_ok);
                Button addCancel = mView.findViewById(R.id.add_button_cancel);
                Button deleteScore = mView.findViewById(R.id.deleteScoreButton);
                TextView totalScore4 = findViewById(R.id.total_score_4);


                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                add1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "1");
                    }
                });

                add2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "2");
                    }
                });

                add3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "3");
                    }
                });

                add4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "4");
                    }
                });

                add5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "5");
                    }
                });

                add6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "6");
                    }
                });

                add7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "7");
                    }
                });

                add8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "8");
                    }
                });

                add9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "9");
                    }
                });

                add50.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "50");
                    }
                });

                add0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "0");
                    }
                });

                add00.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText(addScore.getText().toString() + "00");
                    }
                });

                addOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (addScore.getText().toString().equals("")) {
                            dialog.dismiss();
                        } else {
                            if (Integer.parseInt(addScore.getText().toString()) % 50 == 0 && Integer.parseInt(addScore.getText().toString()) >= 350) {
                                currentRolls4.setText(((currentRolls4.getText().toString().equals("")) ? (currentRolls4.getText().toString() + addScore.getText().toString()) : (currentRolls4.getText().toString() + "\n" + addScore.getText().toString())));
                                prefs.edit().putString("currentRolls4", currentRolls4.getText().toString()).commit();
                                Integer score = 0;
                                if (!currentRolls4.getText().toString().isEmpty()) {
                                    String segments[] = currentRolls4.getText().toString().split("\n");
                                    Integer number[] = new Integer[segments.length];
                                    for (int i = 0; i < segments.length; i++) {
                                        number[i] = Integer.parseInt(segments[i]);
                                    }
                                    for (int j = 0; j < number.length; j++) {
                                        score = score + number[j];
                                    }
                                }
                                totalScore4.setText(score.toString());
                                prefs.edit().putString("totalScore4", totalScore4.getText().toString()).commit();
                                dialog.dismiss();
                            } else {
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });

                addCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                deleteScore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addScore.setText((addScore.getText().toString().length() > 0) ? (addScore.getText().toString().substring(0, addScore.getText().toString().length() - 1)) : addScore.getText().toString());
                    }
                });
            }
        });

        wins1.setShowSoftInputOnFocus(false);
        wins1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.add_win, null);

                Button minus_win = mView.findViewById(R.id.minus_wins);
                Button add_win = mView.findViewById(R.id.add_wins);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                minus_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins1.getText().toString().equals("") | wins1.getText().toString().equals("0")) {
                            Toast.makeText(MainActivity.this, "Can't subtract from 0 wins!", Toast.LENGTH_SHORT).show();
                        } else {
                            wins1.setText(Integer.toString(Integer.parseInt(wins1.getText().toString()) - 1));
                            dialog.dismiss();
                        }
                    }
                });

                add_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins1.getText().toString().equals("")){
                            wins1.setText("1");
                            dialog.dismiss();
                        }
                        else {
                            wins1.setText(Integer.toString(Integer.parseInt(wins1.getText().toString()) + 1));
                            dialog.dismiss();
                        }
                    }
                });
            }
        });

        wins2.setShowSoftInputOnFocus(false);
        wins2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.add_win, null);

                Button minus_win = mView.findViewById(R.id.minus_wins);
                Button add_win = mView.findViewById(R.id.add_wins);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                minus_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins2.getText().toString().equals("") | wins2.getText().toString().equals("0")) {
                            Toast.makeText(MainActivity.this, "Can't subtract from 0 wins!", Toast.LENGTH_SHORT).show();
                        } else {
                            wins2.setText(Integer.toString(Integer.parseInt(wins2.getText().toString()) - 1));
                            dialog.dismiss();
                        }
                    }
                });

                add_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins2.getText().toString().equals("")){
                            wins2.setText("1");
                            dialog.dismiss();
                        }
                        else {
                            wins2.setText(Integer.toString(Integer.parseInt(wins2.getText().toString()) + 1));
                            dialog.dismiss();
                        }
                    }
                });
            }
        });

        wins3.setShowSoftInputOnFocus(false);
        wins3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.add_win, null);

                Button minus_win = mView.findViewById(R.id.minus_wins);
                Button add_win = mView.findViewById(R.id.add_wins);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                minus_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins3.getText().toString().equals("") | wins3.getText().toString().equals("0")) {
                            Toast.makeText(MainActivity.this, "Can't subtract from 0 wins!", Toast.LENGTH_SHORT).show();
                        } else {
                            wins3.setText(Integer.toString(Integer.parseInt(wins3.getText().toString()) - 1));
                            dialog.dismiss();
                        }
                    }
                });

                add_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins3.getText().toString().equals("")){
                            wins3.setText("1");
                            dialog.dismiss();
                        }
                        else {
                            wins3.setText(Integer.toString(Integer.parseInt(wins3.getText().toString()) + 1));
                            dialog.dismiss();
                        }
                    }
                });
            }
        });

        wins4.setShowSoftInputOnFocus(false);
        wins4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.add_win, null);

                Button minus_win = mView.findViewById(R.id.minus_wins);
                Button add_win = mView.findViewById(R.id.add_wins);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                minus_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins4.getText().toString().equals("") | wins4.getText().toString().equals("0")) {
                            Toast.makeText(MainActivity.this, "Can't subtract from 0 wins!", Toast.LENGTH_SHORT).show();
                        } else {
                            wins4.setText(Integer.toString(Integer.parseInt(wins4.getText().toString()) - 1));
                            dialog.dismiss();
                        }
                    }
                });

                add_win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (wins4.getText().toString().equals("")){
                            wins4.setText("1");
                            dialog.dismiss();
                        }
                        else {
                            wins4.setText(Integer.toString(Integer.parseInt(wins4.getText().toString()) + 1));
                            dialog.dismiss();
                        }
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        isEditableMenu = menu.findItem(R.id.action_edit_rolls);
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
        String isEditable = prefs.getString("isEditable", "");

        if (isEditable.equals("") | isEditable.equals("0")) {
            isEditableMenu.setTitle("Edit Rolls");
            prefs.edit().putString("isEditable", "0").commit();
        } else {
            isEditableMenu.setTitle("Edit Rolls");
            prefs.edit().putString("isEditable", "1").commit();
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        EditText wins1 = findViewById(R.id.wins1);
        EditText wins2 = findViewById(R.id.wins2);
        EditText wins3 = findViewById(R.id.wins3);
        EditText wins4 = findViewById(R.id.wins4);

        EditText player4Wins = findViewById(R.id.wins4);
        EditText player4Name = findViewById(R.id.name4);
        View player4WinsLine = findViewById(R.id.player4WinsLine);
        View player4NameLine = findViewById(R.id.player4NameLine);
        EditText currentRollsPlayer4 = findViewById(R.id.current_rolls_4);
        Button currentRollsButton4 = findViewById(R.id.addCurrentRollButton4);
        View totalScore4Line = findViewById(R.id.totalScore4Line);
        TextView totalScore4 = findViewById(R.id.total_score_4);


        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);

        if (id == R.id.action_reset_game) {
            AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.dialog_reset_game, null);
            Button mButton1 = (Button) mView.findViewById(R.id.button);
            Button mButton2 = (Button) mView.findViewById(R.id.button2);

            EditText currentRolls1 = findViewById(R.id.current_rolls_1);
            EditText currentRolls2 = findViewById(R.id.current_rolls_2);
            EditText currentRolls3 = findViewById(R.id.current_rolls_3);
            EditText currentRolls4 = findViewById(R.id.current_rolls_4);

            TextView totalScore1 = findViewById(R.id.total_score_1);
            TextView totalScore2 = findViewById(R.id.total_score_2);
            TextView totalScore3 = findViewById(R.id.total_score_3);


            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    currentRolls1.setText("");
                    currentRolls2.setText("");
                    currentRolls3.setText("");
                    currentRolls4.setText("");
                    totalScore1.setText("");
                    totalScore2.setText("");
                    totalScore3.setText("");
                    totalScore4.setText("");
                    prefs.edit().putString("currentRolls1", "").commit();
                    prefs.edit().putString("currentRolls2", "").commit();
                    prefs.edit().putString("currentRolls3", "").commit();
                    prefs.edit().putString("currentRolls4", "").commit();
                    prefs.edit().putString("totalScore1", "").commit();
                    prefs.edit().putString("totalScore2", "").commit();
                    prefs.edit().putString("totalScore3", "").commit();
                    prefs.edit().putString("totalScore4", "").commit();
                    dialog.dismiss();
                }
            });

            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_reset) {
            AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.dialog_reset, null);
            Button mButton1 = (Button) mView.findViewById(R.id.button);
            Button mButton2 = (Button) mView.findViewById(R.id.button2);

            EditText currentRolls1 = findViewById(R.id.current_rolls_1);
            EditText currentRolls2 = findViewById(R.id.current_rolls_2);
            EditText currentRolls3 = findViewById(R.id.current_rolls_3);
            EditText currentRolls4 = findViewById(R.id.current_rolls_4);

            TextView totalScore1 = findViewById(R.id.total_score_1);
            TextView totalScore2 = findViewById(R.id.total_score_2);
            TextView totalScore3 = findViewById(R.id.total_score_3);


            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    wins1.setText("");
                    wins2.setText("");
                    wins3.setText("");
                    wins4.setText("");
                    currentRolls1.setText("");
                    currentRolls2.setText("");
                    currentRolls3.setText("");
                    currentRolls4.setText("");
                    totalScore1.setText("");
                    totalScore2.setText("");
                    totalScore3.setText("");
                    totalScore4.setText("");
                    prefs.edit().putString("wins1", "").commit();
                    prefs.edit().putString("wins2", "").commit();
                    prefs.edit().putString("wins3", "").commit();
                    prefs.edit().putString("wins4", "").commit();
                    prefs.edit().putString("currentRolls1", "").commit();
                    prefs.edit().putString("currentRolls2", "").commit();
                    prefs.edit().putString("currentRolls3", "").commit();
                    prefs.edit().putString("currentRolls4", "").commit();
                    prefs.edit().putString("totalScore1", "").commit();
                    prefs.edit().putString("totalScore2", "").commit();
                    prefs.edit().putString("totalScore3", "").commit();
                    prefs.edit().putString("totalScore4", "").commit();
                    dialog.dismiss();
                }
            });

            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
        }

        if (id == R.id.action_change_player) {
            AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.dialog_playercount, null);
            Button mButton_player_three = (Button) mView.findViewById(R.id.button_player_three);
            Button mButton_player_four = (Button) mView.findViewById(R.id.button_player_four);


            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            mButton_player_three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                    player4Wins.setVisibility(View.GONE);
                    player4Name.setVisibility(View.GONE);
                    player4WinsLine.setVisibility(View.GONE);
                    player4NameLine.setVisibility(View.GONE);
                    currentRollsPlayer4.setVisibility(View.GONE);
                    currentRollsButton4.setVisibility(View.GONE);
                    totalScore4.setVisibility(View.GONE);
                    totalScore4Line.setVisibility(View.GONE);
                    prefs.edit().putString("playerCount", "3").commit();
                    dialog.dismiss();
                    recreate();
                    //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                }
            });

            mButton_player_four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                    player4Wins.setVisibility(View.VISIBLE);
                    player4Name.setVisibility(View.VISIBLE);
                    player4WinsLine.setVisibility(View.VISIBLE);
                    player4NameLine.setVisibility(View.VISIBLE);
                    currentRollsPlayer4.setVisibility(View.VISIBLE);
                    currentRollsButton4.setVisibility(View.VISIBLE);
                    totalScore4.setVisibility(View.VISIBLE);
                    totalScore4Line.setVisibility(View.VISIBLE);
                    prefs.edit().putString("playerCount", "4").commit();
                    dialog.dismiss();
                    recreate();
                    //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
            });
        }

        if (id == R.id.action_edit_rolls) {
            EditText currentRolls1 = findViewById(R.id.current_rolls_1);
            EditText currentRolls2 = findViewById(R.id.current_rolls_2);
            EditText currentRolls3 = findViewById(R.id.current_rolls_3);
            EditText currentRolls4 = findViewById(R.id.current_rolls_4);

            TextView totalScore1 = findViewById(R.id.total_score_1);
            TextView totalScore2 = findViewById(R.id.total_score_2);
            TextView totalScore3 = findViewById(R.id.total_score_3);

            String isEnab = prefs.getString("isEnabled", "").toString();

            if (isEnab.equals("") | isEnab.equals("0")) {
                item.setIcon(getDrawable(R.drawable.ic_drawing));
                currentRolls1.setEnabled(true);
                currentRolls2.setEnabled(true);
                currentRolls3.setEnabled(true);
                currentRolls4.setEnabled(true);
                isEditableMenu.setTitle("Edit Rolls");
                prefs.edit().putString("isEnabled", "1").commit();
            } else {
                item.setIcon(getDrawable(R.drawable.ic_edit_black_48dp));
                currentRolls1.setEnabled(false);
                currentRolls2.setEnabled(false);
                currentRolls3.setEnabled(false);
                currentRolls4.setEnabled(false);
                isEditableMenu.setTitle("Edit Rolls");
                prefs.edit().putString("isEnabled", "0").commit();

                prefs.edit().putString("currentRolls1", currentRolls1.getText().toString()).commit();
                prefs.edit().putString("currentRolls2", currentRolls2.getText().toString()).commit();
                prefs.edit().putString("currentRolls3", currentRolls3.getText().toString()).commit();
                prefs.edit().putString("currentRolls4", currentRolls4.getText().toString()).commit();

                Integer score1 = 0;
                Integer score2 = 0;
                Integer score3 = 0;
                Integer score4 = 0;
                Boolean isError1 = false;
                Boolean isError2 = false;
                Boolean isError3 = false;
                Boolean isError4 = false;

                if (!currentRolls1.getText().toString().isEmpty()) {
                    String segments[] = currentRolls1.getText().toString().split("\n");
                    Integer number[] = new Integer[segments.length];
                    try {
                        for (int i = 0; i < segments.length; i++) {
                            number[i] = Integer.parseInt(segments[i]);

                        }
                        for (int j = 0; j < number.length; j++) {
                            score1 = score1 + number[j];
                        }
                        for (int k = 0; k < number.length; k++) {
                            if (number[k] % 50 != 0 | number[k] < 250) {
                                isError1 = true;
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }
                    } catch (Exception e) {
                        isError1 = true;
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }

                }
                if (isError1 != true) {
                    totalScore1.setText(score1.toString());
                    prefs.edit().putString("totalScore1", totalScore1.getText().toString()).commit();
                } else {
                    totalScore1.setText("Error");
                    prefs.edit().putString("totalScore1", totalScore1.getText().toString()).commit();
                }


                if (!currentRolls2.getText().toString().isEmpty()) {
                    String segments[] = currentRolls2.getText().toString().split("\n");
                    Integer number[] = new Integer[segments.length];
                    try {
                        for (int i = 0; i < segments.length; i++) {
                            number[i] = Integer.parseInt(segments[i]);
                        }
                        for (int j = 0; j < number.length; j++) {
                            score2 = score2 + number[j];
                        }
                        for (int k = 0; k < number.length; k++) {
                            if (number[k] % 50 != 0 | number[k] < 250) {
                                isError2 = true;
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }
                    } catch (Exception e) {
                        isError2 = true;
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }
                }
                if (isError2 != true) {
                    totalScore2.setText(score2.toString());
                    prefs.edit().putString("totalScore2", totalScore2.getText().toString()).commit();
                } else {
                    totalScore2.setText("Error");
                    prefs.edit().putString("totalScore2", totalScore2.getText().toString()).commit();
                }

                if (!currentRolls3.getText().toString().isEmpty()) {
                    String segments[] = currentRolls3.getText().toString().split("\n");
                    Integer number[] = new Integer[segments.length];
                    try {
                        for (int i = 0; i < segments.length; i++) {
                            number[i] = Integer.parseInt(segments[i]);
                        }
                        for (int j = 0; j < number.length; j++) {
                            score3 = score3 + number[j];
                        }
                        for (int k = 0; k < number.length; k++) {
                            if (number[k] % 50 != 0 | number[k] < 250) {
                                isError3 = true;
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }
                    } catch (Exception e) {
                        isError3 = true;
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }

                }
                if (isError3 != true) {
                    totalScore3.setText(score3.toString());
                    prefs.edit().putString("totalScore3", totalScore3.getText().toString()).commit();
                } else {
                    totalScore3.setText("Error");
                    prefs.edit().putString("totalScore3", totalScore3.getText().toString()).commit();
                }

                if (!currentRolls4.getText().toString().isEmpty()) {
                    String segments[] = currentRolls4.getText().toString().split("\n");
                    Integer number[] = new Integer[segments.length];
                    try {
                        for (int i = 0; i < segments.length; i++) {
                            number[i] = Integer.parseInt(segments[i]);
                        }
                        for (int j = 0; j < number.length; j++) {
                            score4 = score4 + number[j];
                        }
                        for (int k = 0; k < number.length; k++) {
                            if (number[k] % 50 != 0 | number[k] < 250) {
                                isError4 = true;
                                Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }
                    } catch (Exception e) {
                        isError4 = true;
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }

                }
                if (isError4 != true) {
                    totalScore4.setText(score4.toString());
                    prefs.edit().putString("totalScore4", totalScore4.getText().toString()).commit();
                } else {
                    totalScore4.setText("Error");
                    prefs.edit().putString("totalScore4", totalScore4.getText().toString()).commit();
                }
            }
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }
}