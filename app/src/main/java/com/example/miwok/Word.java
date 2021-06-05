package com.example.miwok;

public class Word {

    private final String defaultTranslation;
    private final String miwokTranslation;

    public Word(String Dt, String Mt)
    {
        this.defaultTranslation = Dt;
        this.miwokTranslation = Mt;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }


}
