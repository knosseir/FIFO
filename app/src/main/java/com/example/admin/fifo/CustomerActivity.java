package com.example.admin.fifo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_main);

        TextView displayName = findViewById(R.id.displayName);
        TextView position = findViewById(R.id.position);
        TextView status = findViewById(R.id.status);

        String display = "Welcome, " + getIntent().getStringExtra("first") + " " + getIntent().getStringExtra("last") + "!";

        displayName.setText(display);
    }
}
