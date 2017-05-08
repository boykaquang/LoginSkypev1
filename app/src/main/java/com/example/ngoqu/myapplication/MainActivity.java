package com.example.ngoqu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS = (Button) findViewById(R.id.btb_s);
        btnS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btb_s:
                Intent intent = new Intent(MainActivity.this , DialogActivity.class);
                startActivity(intent);
                 break;
            default:
                break;
        }
    }
}
