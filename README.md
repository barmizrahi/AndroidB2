
# Custom Rating Bar Library for Android (Java)

The Custom Rating Bar library provides a custom view that emulates the functionality of a Rating Bar for Android applications developed in Java. It allows users to rate something by clicking on stars.


## Installation

To use the Custom Rating Bar library in your Android Java project, follow these steps:

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

   ```xml
   <LinearLayout
       xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:orientation="vertical">

       <!-- Add your other views here -->

       <com.example.yourpackage.RatingBar
           android:id="@+id/ratingBar"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:max="5" />
       
       <!-- Add more views if needed -->

   </LinearLayout>
   ```

4. In your Java code (e.g., in your activity or fragment), you can access the `RatingBar` view by its ID and interact with it as needed:

   ```java
   import android.app.Activity;
   import android.os.Bundle;
   import android.widget.Toast;

   public class MainActivity extends Activity {

       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           RatingBar ratingBar = findViewById(R.id.ratingBar);
           ratingBar.setMaxStars(5);
           ratingBar.setRating(3); // Set the initial rating

           ratingBar.setOnRatingChangedListener(rating -> {
               // Handle the rating change event here
               Toast.makeText(this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
           });
       }
   }
   ```

## Customization

The Custom Rating Bar library provides the following customization options:

- `setMaxStars(int maxStars)`: Set the maximum number of stars in the Rating Bar. The default is 5 stars.
- `setRating(float rating)`: Set the initial rating of the Rating Bar. The default is 0.
- `setOnRatingChangedListener(OnRatingChangedListener listener)`: Set a listener to receive rating change events.

## License

This library is licensed under the [MIT License](LICENSE).

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


If you find this library useful or have suggestions for improvements, feel free to contribute or reach out!

Happy coding! 🚀
```
