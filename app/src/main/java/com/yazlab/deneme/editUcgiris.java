package com.yazlab.deneme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class editUcgiris extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isteruc_giris);
        final EditText et = (EditText) findViewById(R.id.edit31);
        final Button button = (Button)  findViewById(R.id.button31);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String das1 = et.getText().toString();
                Intent i = new Intent(editUcgiris.this, isterUc.class);
                i.putExtra("s31",das1);

                startActivity(i);
                finish();
            }
        });
    }
}