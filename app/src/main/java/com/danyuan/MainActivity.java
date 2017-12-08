package com.danyuan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.app_tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testUI();
            }
        });
    }

    public void testUI() {

        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        tv.setText("hahahahahhaaaaaaaaaaaaaaaaaaa");
        testData();

    }
    public void testData() {

        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");
        Log.d("","haha");

    }
}
