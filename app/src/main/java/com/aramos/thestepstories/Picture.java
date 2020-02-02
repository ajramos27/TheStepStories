package com.aramos.thestepstories;

import android.graphics.drawable.Drawable;

public class Picture {
    private Drawable pic;
    private String caption;
    private String name;

    public Picture(Drawable pic, String caption, String name) {
        this.pic = pic;
        this.caption = caption;
        this.name = name;
    }

    public Drawable getPic() {
        return pic;
    }

    public void setPic(Drawable pic) {
        this.pic = pic;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
