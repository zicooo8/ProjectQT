package com.iit.glid.loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View V) {

        Log.i("Information", "Button clicked !!");
 
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Information", nameEditText.getText().toString());
        Log.i("Information", passwordEditText.getText().toString());

        Toast.makeText(this, "Hi "+nameEditText.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
