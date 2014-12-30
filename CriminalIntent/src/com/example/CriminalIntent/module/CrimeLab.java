package com.example.CriminalIntent.module;

/**
 * Created by Administrator on 2014-12-30.
 */
public class CrimeLab {


    private ArrayList



    private static CrimeLab _instance;

    public static CrimeLab getInstance() {
        if (_instance == null) {
            _instance = new CrimeLab();
        }

        return _instance;
    }

    private CrimeLab() {


    }

}
