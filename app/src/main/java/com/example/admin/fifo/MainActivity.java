package com.example.admin.fifo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstName = findViewById(R.id.firstName);
        final EditText lastName = findViewById(R.id.lastName);

        Button hostButton = findViewById(R.id.host_button);
        Button customerButton = findViewById(R.id.customer_button);

        hostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstName.getText().toString();
                String last = lastName.getText().toString();

                Intent host = new Intent(getBaseContext(), ServerActivity.class);
                host.putExtra("first", first);
                host.putExtra("last", last);
                startActivity(host);
            }
        });

        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstName.getText().toString();
                String last = lastName.getText().toString();

                Intent customer = new Intent(getBaseContext(), ClientActivity.class);
                customer.putExtra("first", first);
                customer.putExtra("last", last);
                startActivity(customer);
            }
        });
    }
}