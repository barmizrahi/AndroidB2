
# TextFormatter Library
[![](https://jitpack.io/v/barmizrahi/AndroidB2.svg)](https://jitpack.io/#barmizrahi/AndroidB2)

The TextFormatter Library is an Android library that provides a ready-to-use TextFormatter for Android applications.

## Features

- Options to apply many styles on your text
- Options to change the text to upper or lower or capitalize Text
- Change the color of the text
- Easy integration into your Android projects

## Getting Started

### Installation

1. Add the JitPack repository to your project's build.gradle file:
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

2. Add the library dependency to your app's build.gradle file:
dependencies {
	        implementation 'com.github.barmizrahi:AndroidB2:1.0.0.1}

## Usage
1. To use the TextFormatter Library in your Android project, follow these steps:

cCreate a simple textView component in your layout XML file:
 <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        tools:text="Formatted Text" />

2. In your activity or fragment, find and initialize the textView component.
3. Crate new TextFormatter object.
4. Create the String to be send to the TextFormatter object.
5. Create new object of Spannable to support the new string the TextFormatter returns.
6. Display the new String on the TextView object.

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

## Sample App

The repository includes a sample app that demonstrates the usage of the TextFormatter Library. You can explore the sample app's source code to see how to integrate the library into your own projects.

## Contributions

Contributions are welcome! If you find any bugs or want to suggest new features, please open an issue or submit a pull request.

Feel free to customize this description based on your specific library's features, usage, and licensing information.
