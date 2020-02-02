package com.aramos.thestepstories.ui.events;

import android.graphics.drawable.Drawable;

public class Event {
    private String name;
    private String date;
    private String time;
    private String location;
    private Drawable pic;

    public Event(String name, String date, String time, String location, Drawable pic) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.pic = pic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Drawable getPic() {
        return pic;
    }

    public void setPic(Drawable pic) {
        this.pic = pic;
    }
}
