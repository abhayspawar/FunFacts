package com.abhayapps.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactActivity extends ActionBarActivity {

    public static final String TAG=FunFactActivity.class.getSimpleName();
    private FactBook mFactBook=new FactBook();
    private ColorWheel mColors=new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        final TextView factLabel = (TextView) findViewById(R.id.FunFactTextView);
        final Button showFactButton = (Button) findViewById(R.id.ShowFactButton);
        final RelativeLayout bgColor= (RelativeLayout) findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code to update when the button is clicked
                String fact=mFactBook.getFact();
                factLabel.setText(fact);
                int color = mColors.getColor();
                bgColor.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        Toast.makeText(this,"The App has been started!",Toast.LENGTH_LONG).show();
        Log.d(TAG,"Voila! This is the onCreate() method");
    }
}

//Folowing code is not really needed. Required for setting tab on the top
/*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_fact, menu);
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
*/


/*
                if (randomNumber==0){
                    fact="Ants Stretch when they wake up in the morning.";
                }
                else if (randomNumber==1){
                    fact="Ostrich runs faster than Horse.";
                }
                else if (randomNumber==2){
                    fact="Olympic gold medals are actually mostly made of silver.";
                }
                else if (randomNumber==3){
                    fact="Google is on of the biggest internet companies in the world.";
                }
                else if (randomNumber==4){
                    fact="Bata in not an Indian Company.";
                }
                else {
                    fact = "Sorry there was an error";
                }
*/
