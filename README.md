
# Login Page Library
[![](https://jitpack.io/v/barmizrahi/AndroidB2.svg)](https://jitpack.io/#barmizrahi/AndroidB2)

The Login Page Library is an Android library that provides a ready-to-use login page UI component for Android applications. It simplifies the process of creating a login page by offering a customizable and reusable login view.

## Features

- Clean and modern UI design for login page
- Input fields for email and password
- Remember me checkbox
- Forgot password link
- Sign up link
- Customizable colors, text, and button styles
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
	        implementation 'com.github.barmizrahi:AndroidB2:Tag'
	}

## Usage
1. To use the Login Page Library in your Android project, follow these steps:

Include the LoginView component in your layout XML file:
<com.example.loginlibrary.LoginView
    android:id="@+id/login_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

2. In your activity or fragment, find and initialize the LoginView:
import com.example.loginlibrary.LoginView;

public class LoginActivity extends AppCompatActivity {

    private LoginView loginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginView = findViewById(R.id.login_view);
    }
}

## Sample App

The repository includes a sample app that demonstrates the usage of the Login Page Library. You can explore the sample app's source code to see how to integrate the library into your own projects.

## Contributions

Contributions are welcome! If you find any bugs or want to suggest new features, please open an issue or submit a pull request.

Feel free to customize this description based on your specific library's features, usage, and licensing information.
