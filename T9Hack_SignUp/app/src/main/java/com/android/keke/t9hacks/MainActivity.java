package com.android.keke.t9hacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view){
        TextView message = findViewById(R.id.textView);
        EditText name = findViewById(R.id.editText);
        String nameValue =name.getText().toString();
        message.setText(nameValue + " You're all set!");
        ImageView t9 = findViewById(R.id.imageView);
        t9.setImageResource(R.drawable.t9hacks_sticker);
    }
}
