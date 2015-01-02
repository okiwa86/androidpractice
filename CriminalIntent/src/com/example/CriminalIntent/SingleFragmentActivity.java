package com.example.CriminalIntent;

import android.os.Bundle;
import android.support.v4.app.*;

/**
 * Created by Administrator on 2014-12-31.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
            fragment = createFragment();
            fm.beginTransaction().
                    add(R.id.fragmentContainer, fragment).
                    commit();

        }
    }
}