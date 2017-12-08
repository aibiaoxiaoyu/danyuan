package com.libone;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cmcc on 2017/12/8.
 */

public class LibOneActivity extends Activity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
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

        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");
        Log.d("", "haha");

    }
}
