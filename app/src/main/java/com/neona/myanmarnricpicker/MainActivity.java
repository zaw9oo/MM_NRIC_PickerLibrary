package com.neona.myanmarnricpicker;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textNIRC;
    //TextView textState;
    TextView textCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCity = findViewById(R.id.text_city);
        textNIRC = findViewById(R.id.text_NRIC);

        final NRIC_View nricView = findViewById(R.id.NRIC_view);

        // submit button listener
        Button submit_btn = findViewById(R.id.submit);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textCity.setText(nricView.getCityName());
                textNIRC.setText(nricView.getNRICText());

            }
        });

    }
}