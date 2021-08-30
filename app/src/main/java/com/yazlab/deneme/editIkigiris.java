package com.yazlab.deneme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class editIkigiris extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isteriki_giris);
        final EditText e = (EditText) findViewById(R.id.edit1);
        final EditText e1 = (EditText) findViewById(R.id.edit2);
        final Button button = (Button)  findViewById(R.id.button11);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String da1 = e.getText().toString();
                String da2 = e1.getText().toString();
                Intent i = new Intent(editIkigiris.this, isterIki.class);
                i.putExtra("s1",da1);
                i.putExtra("s2",da2);
                startActivity(i);
                finish();
            }
        });

    }
}
