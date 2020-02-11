package com.example.quest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Play extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }


    public void OnClick(View view){
        Button button1 = findViewById(R.id.B2);
        Intent b;
        b = new Intent(Play.this, Beginning.class);
        startActivity(b);

        //Log.d("good", "job");
    }
    public void OnClickback(View view){
        Button button2 = findViewById(R.id.B3);

        Intent i;
        i = new Intent(Play.this, MainActivity.class);
        startActivity(i);
    }
}
