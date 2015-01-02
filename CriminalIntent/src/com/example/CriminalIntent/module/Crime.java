package com.example.CriminalIntent.module;

import java.util.UUID;
import java.util.Date;

/**
 * Created by Administrator on 2014-12-30.
 */
public class Crime {

    private UUID id;
    private String title;
    private Date mDate;
    private boolean mSolved;

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime()
    {
        id = UUID.randomUUID();
        mDate = new Date();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}
