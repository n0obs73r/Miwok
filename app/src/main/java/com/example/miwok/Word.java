package com.example.miwok;

public class Word {

    private final String defaultTranslation;
    private final String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String Dt, String Mt, int image)
    {
        this.defaultTranslation = Dt;
        this.miwokTranslation = Mt;
        this.imageResourceId = image;

    }
    public Word(String Dt, String Mt)
    {
        this.defaultTranslation = Dt;
        this.miwokTranslation = Mt;
    }
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getImageResourceId() { return imageResourceId; }
    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }


}
