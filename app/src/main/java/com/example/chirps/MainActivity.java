package com.example.chirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etTemp;
    TextView tvPrompt,tvDisp;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTemp = findViewById(R.id.etTemp);
        tvDisp = findViewById(R.id.tvDisp);
        tvDisp.setVisibility(View.GONE);
        tvPrompt = findViewById(R.id.tvPrompt);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sCount = etTemp.getText().toString().trim();
                String status;
                int count = Integer.parseInt(sCount);
                double temp = count/3.0 + 4;
                if (temp > 28)
                    status = "it's really hot today!";
                else if (temp<22)
                    status = "it's chilling cold season!";
                else
                    status = "it's moderate climate";
                String result = "the approx. temp is :" + (int)temp + " degree Celsius" + getString(R.string.newline)
                        + status;
                tvDisp.setText(result);
                tvDisp.setVisibility(View.VISIBLE);
            }
        });
    }
}
