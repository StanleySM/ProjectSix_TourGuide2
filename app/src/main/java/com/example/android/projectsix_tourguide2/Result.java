package com.example.android.projectsix_tourguide2;

import static com.example.android.projectsix_tourguide2.R.id.firstSymbol;

/**
 * Created by StanleyPC on 15. 5. 2017.
 */

public class Result {

    private int mMainHeader;
    private int mFirstLineText;
    private int mSecondLineText;
    private int mMainInformationText;
    private int mMainImageView;
    private int mFirstSymbol;

    public Result(int mainHeader, int firstLineText, int secondLineText, int mainInformationText, int mainImageView, int firstSymbol){
        mMainHeader = mainHeader;
        mFirstLineText = firstLineText;
        mSecondLineText = secondLineText;
        mMainInformationText = mainInformationText;
        mMainImageView = mainImageView;
        mFirstSymbol = firstSymbol;
    }

    public int getMainHeader(){
        return mMainHeader;
    }

    public int getFirstLineText(){
        return mFirstLineText;
    }

    public int getSecondLineText(){
        return mSecondLineText;
    }

    public int getMainInformationText(){
        return mMainInformationText;
    }

    public int getMainImageView(){
        return mMainImageView;
    }

    public int getFirstSymbol(){
        return mFirstSymbol;
    }

}