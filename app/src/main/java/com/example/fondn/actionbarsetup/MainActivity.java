package com.example.fondn.actionbarsetup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, inputpasswords;
    Button login;
    TextView textView;
    static int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        name = (EditText) findViewById(R.id.edittextNameId);
        inputpasswords = (EditText) findViewById(R.id.passwordId);
        login = (Button) findViewById(R.id.btnID);
        textView = (TextView) findViewById(R.id.msgTextID);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String password = inputpasswords.getText().toString();

                if(username.equals("a") && password.equals("1")){
                    Intent i = new Intent(MainActivity.this,Second.class);
                    startActivity(i);
                }else {
                    counter--;
                    textView.setText("You have "+counter+"times");
                    if(counter==0){
                        login.setEnabled(false);
                    }

                }

            }
        });

    }
}
