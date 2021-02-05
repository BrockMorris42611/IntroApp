//Brock Morris tuj42611
//Karl Morris, Intro to App Dev
//2-4-21
package edu.temple.helloworld;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button text_change_button = findViewById(R.id.button); //we have a button with id: button that we need to find so we search by id

        text_change_button.setOnClickListener(new View.OnClickListener() { //now we set up a listener that waits for clicks
            @Override
            public void onClick(View v) { //when the listener is working and detects a press on the button then it moves to change the text
                TextView textBox = findViewById(R.id.text_box); //again i am searching for a TextView sincce we are looking for a text box. identify it by its id: text_box
                textBox.setText(R.string.new_text_mssg); //set that text in the box to the last string shown in the strings.xml
            }
        });
    }

}