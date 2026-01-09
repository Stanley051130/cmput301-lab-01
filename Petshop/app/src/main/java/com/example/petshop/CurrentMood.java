package com.example.petshop;

import java.util.Date;

public abstract class CurrentMood {
    private Date moodDate;

    public CurrentMood(){
        this.moodDate = new Date();
    }

    public CurrentMood(Date moodDate){
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }
}
