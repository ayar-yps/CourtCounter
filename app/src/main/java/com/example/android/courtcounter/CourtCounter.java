package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }

    public void addThreeA(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void addTwoA(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void addOneA(View v){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void addThreeB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void addTwoB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void addOneB(View v){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }

    /**
     * Muestra puntaje de Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Muestra puntaje de Team B
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
