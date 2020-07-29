package com.example.firebaseexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private TextView tvName, tvSecName, tvEmail;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_show );
        init ();
        getIntentMain ();
    }

    private void init(){
        tvName = findViewById ( R.id.tvName );
        tvSecName = findViewById ( R.id.tvSecName );
        tvEmail = findViewById ( R.id.tvEmail );
    }

    private void getIntentMain(){
        Intent intent = getIntent ();
        if(intent != null){
            tvName.setText ( intent.getStringExtra ( Constant.USER_NAME ) );
            tvSecName.setText ( intent.getStringExtra ( Constant.USER_SEC_NAME ) );
            tvEmail.setText ( intent.getStringExtra ( Constant.USER_EMAIL ) );
        }
    }

}
