package com.example.CriminalIntent;

import android.os.Bundle;
import android.support.v4.app.*;

/**
 * Created by Administrator on 2014-12-30.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}