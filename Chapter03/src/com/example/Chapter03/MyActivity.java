package com.example.Chapter03;

import android.app.Activity;
import android.content.Intent;
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(getApplicationContext(), "Message is " + data.getStringExtra("TEMP_RESULT"), Toast.LENGTH_SHORT).show();
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
                Intent i = new Intent(MyActivity.this, SubActivity.class);
                startActivityForResult(i, 0);
            }
        });

        if(savedInstanceState != null)
        {
            mCount = savedInstanceState.getInt(KEY_INDEX);
        }

    }
}
