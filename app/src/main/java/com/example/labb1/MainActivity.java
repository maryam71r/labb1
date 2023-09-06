package com.example.labb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    TextView receiver_msg;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        send_button= findViewById(R.id.send_button_id);
        send_text = findViewById(R.id.send_text_id);
        receiver_msg = (TextView) findViewById(R.id.received_value_id);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    send_button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String str = send_text.getText().toString();
            receiver_msg.setText("hello,"+str);
        }
    });

    }

}