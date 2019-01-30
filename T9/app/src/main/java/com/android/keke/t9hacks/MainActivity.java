package com.android.keke.t9hacks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the user tab the Register button
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayActivity.class);
        EditText nameText = findViewById(R.id.editText);
        String name = nameText.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
