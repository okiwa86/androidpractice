package com.example.Chapter03;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {

    private int mCount = 0;
    private static final String KEY_INDEX = "COUNT";
    private Button mAddBtn;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // save current state
        outState.putInt(KEY_INDEX, mCount);
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mAddBtn = (Button)findViewById(R.id.addBtn);
        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                Toast.makeText(getApplicationContext(), "Number is " + mCount , Toast.LENGTH_SHORT).show();
            }
        });

        if(savedInstanceState != null)
        {
            mCount = savedInstanceState.getInt(KEY_INDEX);
        }

    }
}
