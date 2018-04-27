package com.tashfia.webviewprctice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnFB,btngoogle,btnGO;
    EditText etxtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFB=(Button)findViewById(R.id.btn_fb);
        btngoogle=(Button)findViewById(R.id.btn_google);
        btnGO=(Button)findViewById(R.id.btn_go);
        etxtUrl=(EditText)findViewById(R.id.etxt_url);

        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Url=etxtUrl.getText().toString();
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Url",Url);
                startActivity(intent);
            }
        });
        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Url","www.facebook.com");
                startActivity(intent);
            }
        });
        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Url","www.google.com");
                startActivity(intent);
            }
        });
    }
}
