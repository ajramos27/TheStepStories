package com.aramos.thestepstories.ui.stories;

import android.graphics.drawable.Drawable;

public class Story {

    private String story;
    private String name;
    private String info;
    private Drawable pic;

    public Story(String story, String name, String info, Drawable pic) {
        this.story = story;
        this.name = name;
        this.info = info;
        this.pic = pic;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Drawable getPic() {
        return pic;
    }

    public void setPic(Drawable pic) {
        this.pic = pic;
    }
}
