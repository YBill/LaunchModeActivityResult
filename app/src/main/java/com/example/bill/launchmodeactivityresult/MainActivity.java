package com.example.bill.launchmodeactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * MainActivity 启动 SecondActivity 通过 startActivityForResult
 *
 * 在 4.x 手机上 SecondActivity 的 launchMode 为 singleTask 或 singleInstance 时，
 * 在 MainActivity 中调用 startActivityForResult启动SecondActivity后，在MainActivity中的onActivityResult的回调中立马执行了，
 * 返回的resultCode为RESULT_CANCELED.此时SecondActivity中执行finish()后MainActivity中onActivityResult不执行了.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("Bill", requestCode + "|" + resultCode);
        Log.e("Bill", "data:" + data);
//        Log.e("Bill", "data:" + data.getStringExtra("data"));
    }
}
