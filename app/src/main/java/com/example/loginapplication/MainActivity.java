package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button login;
    private EditText name,pwd;
    private String uname;
    private String upwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button) findViewById(R.id.btnlogin);
        name=(EditText) findViewById(R.id.etname);
        pwd=(EditText) findViewById(R.id.etpwd);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Validate(name.getText().toString(),pwd.getText().toString());
    }

    public void Validate (String uname, String upwd){
        if(uname.equals("admin") && upwd.equals("1234")){
            Intent intent =new Intent(this,SuccessActivity.class);
            startActivity(intent);
        }
        else{
            Toast toast=Toast.makeText(getApplicationContext(),"Failed Attempt!",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}