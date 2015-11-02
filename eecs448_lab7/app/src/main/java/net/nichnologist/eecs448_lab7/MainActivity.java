package net.nichnologist.eecs448_lab7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declare each of the buttons.
    Button red;
    Button blue;
    Button green;
    Button purple;
    Button shortToast;
    Button longToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Standard oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate each button with reference to XML object
        red = (Button) findViewById(R.id.red_button);
        blue = (Button) findViewById(R.id.blue_button);
        green = (Button) findViewById(R.id.green_button);
        purple = (Button) findViewById(R.id.purple_button);
        shortToast = (Button) findViewById(R.id.shortToast);
        longToast = (Button) findViewById(R.id.longToast);


        /*  Create listener with onClick action for each button. This could also be done
        /  over on the XML side, but I'm not a huge fan, and prefer to keep it all
        /  in nice, tidy java.
         */
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            //Set onCLick action
            public void onClick(View v) {
                //Change the background color of main_layout
                findViewById(R.id.main_layout).setBackgroundColor(0xFFFF0000);
                //Invalidate forces a redraw of main_layout
                findViewById(R.id.main_layout).invalidate();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFF0000FF);
                findViewById(R.id.main_layout).invalidate();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFF008000);
                findViewById(R.id.main_layout).invalidate();
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.main_layout).setBackgroundColor(0xFF800080);
                findViewById(R.id.main_layout).invalidate();
            }
        });

        //Listeners for toast-generating buttons
        shortToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    'Tools' is a class borrowed from net.nichnologist.hotspot, our major project
                    of the semester. It currently provides these static methods for generating toast
                    messages. They both take a String and a Context, so we have to pass it what
                    we want it to say and the context in which it will appear.
                 */

                Tools.toastShort("This is a quick toast message.", getApplicationContext());
            }
        });
        longToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.toastLong("This is a longer toast message.", getApplicationContext());
            }
        });
    }

}




