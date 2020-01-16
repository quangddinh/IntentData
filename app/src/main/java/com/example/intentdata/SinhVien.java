package com.example.intentdata;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class SinhVien implements Parcelable {

    private String ten;

    public SinhVien(String ten) {
        this.ten = ten;
    }

    protected SinhVien(Parcel in) {
        ten = in.readString();
    }

    public static final Creator<SinhVien> CREATOR = new Creator<SinhVien>() {
        @Override
        public SinhVien createFromParcel(Parcel in) {
            return new SinhVien(in);
        }

        @Override
        public SinhVien[] newArray(int size) {
            return new SinhVien[size];
        }
    };

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ten);
    }
}
