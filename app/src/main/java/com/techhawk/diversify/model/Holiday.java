package com.techhawk.diversify.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;
/**
 * Created by Yidi Wu on 22/3/18.
 */

@IgnoreExtraProperties
public class Holiday implements Parcelable {
    // Instance variable
    private String imgUrl;
    private String type;
    private String comments;
    private String history;
    private String name;

    public Holiday() {
    }

    public Holiday(String imgUrl, String type, String comments, String history, String name) {
        this.imgUrl = imgUrl;
        this.type = type;
        this.comments = comments;
        this.history = history;
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imgUrl);
        dest.writeString(this.type);
        dest.writeString(this.comments);
        dest.writeString(this.history);
        dest.writeString(this.name);
    }

    protected Holiday(Parcel in) {
        this.imgUrl = in.readString();
        this.type = in.readString();
        this.comments = in.readString();
        this.history = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<Holiday> CREATOR = new Parcelable.Creator<Holiday>() {
        @Override
        public Holiday createFromParcel(Parcel source) {
            return new Holiday(source);
        }

        @Override
        public Holiday[] newArray(int size) {
            return new Holiday[size];
        }
    };
}
