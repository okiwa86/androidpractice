package com.example.CriminalIntent.module;

import android.content.Context;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Administrator on 2014-12-30.
 */
public class CrimeLab {


    private ArrayList<Crime> mCrimes;
    private Context mAppContext;
    private static CrimeLab _instance;

    public static CrimeLab getInstance(Context _context) {
        if (_instance == null) {
            _instance = new CrimeLab(_context);
        }

        return _instance;
    }

    private CrimeLab(Context _context) {
        mAppContext = _context;

        // add 100
        mCrimes = new ArrayList<Crime>();
        for(int i = 0 ; i < 100 ; i++) {
            Crime c = new Crime();
            c.setTitle("범죄 #" + i);
            c.setmSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public ArrayList<Crime> getmCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id)
    {
        for(Crime c : mCrimes) {

            if(c.getId().equals(id))  {
                return c;
            }
        }
        return null;
    }


}
