package net.nichnologist.eecs448_lab7;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int value = 0;
    Button red;
    Button blue;
    Button green;
    Button purple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        red = (Button) findViewById(R.id.red_button);
        blue = (Button) findViewById(R.id.blue_button);
        green = (Button) findViewById(R.id.green_button);
        purple = (Button) findViewById(R.id.purple_button);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFFFF0000);
                findViewById(R.id.main_layout).invalidate();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFFFF0000);
                findViewById(R.id.main_layout).invalidate();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFFFF0000);
                findViewById(R.id.main_layout).invalidate();
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFFFF0000);
                findViewById(R.id.main_layout).invalidate();
            }
        });
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


}




