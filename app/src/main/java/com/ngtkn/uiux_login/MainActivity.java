package com.ngtkn.uiux_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialise the views
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        Button button = findViewById(R.id.login);

        // Set an onclicklistener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Username: " + username.getText().toString() + " Password: " +
                        password.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

