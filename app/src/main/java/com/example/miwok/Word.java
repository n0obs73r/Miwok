package com.example.miwok;

public class Word {

    private final String defaultTranslation;
    private final String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResourceId ;


    public Word(String Dt, String Mt, int image, int audio)
    {
        this.defaultTranslation = Dt;
        this.miwokTranslation = Mt;
        this.imageResourceId = image;
        this.audioResourceId = audio;

    }
    public Word(String Dt, String Mt, int audio)
    {
        this.defaultTranslation = Dt;
        this.miwokTranslation = Mt;
        this.audioResourceId = audio;
    }
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getImageResourceId() { return imageResourceId; }
    public int getAudioResourceIdResourceId() { return audioResourceId; }
    public String getDefaultTranslation(){ return defaultTranslation; }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }


}
