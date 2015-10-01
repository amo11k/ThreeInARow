package com.homeeditions.amo11k.threeinarow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private TextView turnView;
    private boolean player1 = true;  //true para 1P y false para 2p
    private static final String p1 = "First player turn:";
    private static final String p2 = "Second player turn:";
    private Collection<Integer> p1Combo = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turnView = (TextView) findViewById(R.id.turnView);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setTag(1);
        b2.setTag(2);
        b3.setTag(3);
        b4.setTag(4);
        b5.setTag(5);
        b6.setTag(6);
        b7.setTag(7);
        b8.setTag(8);
        b9.setTag(9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getTag() == 1) {
            if (player1) {
                b1.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b1.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 2) {
            if (player1) {
                b2.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b2.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 3) {
            if (player1) {
                b3.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b3.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 4) {
            if (player1) {
                b4.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b4.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 5) {
            if (player1) {
                b5.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b5.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 6) {
            if (player1) {
                b6.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b6.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 7) {
            if (player1) {
                b7.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b7.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 8) {
            if (player1) {
                b8.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b8.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
        if (v.getTag() == 9) {
            if (player1) {
                b9.setText("X");
                player1 = false;
                turnView.setText(p2);
            } else {
                b9.setText("0");
                player1 = true;
                turnView.setText(p1);
            }
        }
    }

    private boolean getPlayer() {
        return player1;
    }

    private boolean checkWin() {
        boolean win = false;

        return win;
    }
}
