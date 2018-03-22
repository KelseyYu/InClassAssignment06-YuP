package com.example.mac.inclassassignment06_yup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MESSAGE";
    ;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        CheckBox hasSunroof = (CheckBox) findViewById(R.id.hasSunroof);
        boolean sunroof = hasSunroof.isChecked();
        Intent intent = new Intent(this, DisplayMessage.class);

        EditText brand = (EditText) findViewById(R.id.car_brand_edit_text);
        EditText color = (EditText) findViewById(R.id.color_edit_text);
        EditText moreInformation = (EditText) findViewById(R.id.information_edit_text);
        String message = "Car brand: " + brand.getText().toString() + "\nColor: " +
                color.getText().toString() + "\nDose it have a sunroof? " + sunroof +
                "\nAny additional information: " + moreInformation.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
