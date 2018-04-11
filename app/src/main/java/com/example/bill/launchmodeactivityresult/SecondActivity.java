package com.example.bill.launchmodeactivityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void handleFinish(View view) {
        Intent intent = new Intent();
        intent.putExtra("data", "Hello");
        setResult(RESULT_OK, intent);
        finish();
    }
}
