package com.example.CriminalIntent;

import android.app.Activity;
import android.support.v4.app.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.example.CriminalIntent.module.Crime;
import com.example.CriminalIntent.module.CrimeLab;

import java.util.*;

/**
 * Created by Administrator on 2014-12-30.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> mCrimes;
    private static final String TAG = "CrimeListFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("리스트 프래그먼트");

        mCrimes = CrimeLab.getInstance(getActivity()).getmCrimes();


        CrimeAdapter adapter = new CrimeAdapter(mCrimes);


        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Crime c = ((CrimeAdapter)(getListAdapter())).getItem(position);
        Log.d(TAG, c.getTitle() + " was clicked!");
    }

    private class CrimeAdapter extends ArrayAdapter<Crime>
    {
        public CrimeAdapter(ArrayList<Crime> crimes)
        {
            super(getActivity(), 0, crimes);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {

                convertView = ((Activity)getContext()).getLayoutInflater()
                        .inflate(R.layout.list_item_crime, null);

                Crime c = getItem(position);

                TextView titleTextView = (TextView)convertView.findViewById(R.id.crime_list_item_title);
                titleTextView.setText(c.getTitle());

                TextView dateTextView = (TextView)convertView.findViewById(R.id.crime_list_item_date);
                dateTextView.setText(c.getmDate().toString());

                CheckBox solvedCheckBox = (CheckBox)convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
                solvedCheckBox.setChecked(c.ismSolved());

            }


            return convertView;
        }
    }
}