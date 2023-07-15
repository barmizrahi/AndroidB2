package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.widget.TextView;
import com.example.textformatter.*;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        TextFormatter textFormatter = new TextFormatter();
        // Format text with different options
        String text = "Welcome to the Text Formatter Library! *_This text_* is formatted with bold and italic styles. ^Here^ is an underlined text.";
        Spannable formattedText = textFormatter.formatText(text, false, true, false, "#FF0000");

        // Display the formatted text
        textView.setText(formattedText);
    }
}
