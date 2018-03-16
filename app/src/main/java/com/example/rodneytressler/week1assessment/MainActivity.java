package com.example.rodneytressler.week1assessment;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends Activity {

    private TextView textView;
    private EditText editText;
    private Button button;
    private Button otherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.my_text_view);
        editText = findViewById(R.id.my_edit_text);
        button = findViewById(R.id.button_submit);
        otherActivity = findViewById(R.id.next_activity);

        setListener();
    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Android is fun", Toast.LENGTH_LONG).show();
                String textInput = String.valueOf(editText);
                textView.setText( textInput);
                editText.setText("");

            }
        });
        otherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToAnotherActivity();
            }
        });
    }

    private void GoToAnotherActivity() {
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}