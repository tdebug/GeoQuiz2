package com.tdebug.geoquiz;

/**
 * Created by gkuzmin on 9/29/2014.
 */
public class TrueFalse {

    private int mQuestion;

    private boolean mTrueQuestion;

    private boolean mWasCheated;


    public boolean isWasCheated() {
        return mWasCheated;
    }

    public void setWasCheated(boolean mWasCheated) {
        this.mWasCheated = mWasCheated;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }


    public TrueFalse(int question, boolean trueQuestion, boolean wasCheated) {

        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mWasCheated = wasCheated;

    }


}
