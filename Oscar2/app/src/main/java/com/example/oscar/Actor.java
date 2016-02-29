package com.example.oscar;

/**
 * Created by nat on 2/29/16.
 */
public class Actor {
    private String mName;
    private String mDOB;
    private int mNoOfOscarsWon=0;

    public Actor(String name, String DOB, int noOfOscarsWon) {
        mName = name;
        mDOB = DOB;
        mNoOfOscarsWon = noOfOscarsWon;
    }

    public Actor(){

    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDOB() {
        return mDOB;
    }

    public void setDOB(String DOB) {
        mDOB = DOB;
    }

    public int getNoOfOscarsWon() {
        return mNoOfOscarsWon;
    }

    public void setNoOfOscarsWon(int noOfOscarsWon) {
        mNoOfOscarsWon = noOfOscarsWon;
    }
}
