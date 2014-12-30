package com.example.Chapter03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Administrator on 2014-12-30.
 */
public class SubActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        Intent result = new Intent();
        result.putExtra("TEMP_RESULT", "test");
        setResult(Activity.RESULT_CANCELED, result);
    }
}