package com.example.smsapplication;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText phone;
    private EditText message;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    /**
     *  initisalisation
     */
    private void initActivity(){
        phone = (EditText) findViewById(R.id.txtPhone);
        message = (EditText) findViewById(R.id.txtPhone);
        button = (Button) findViewById(R.id.btn);
        createOnClickEnvoiButton();
    }

    private void createOnClickEnvoiButton(){
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                SmsManager.getDefault().sendTextMessage(phone.getText().toString(),null,message.getText().toString(),null, null);
            }
        });
    }
}