package com.example.barbershop_1;

import android.graphics.Bitmap;

public class barber {
    private int barberPhoto;
    private String name;
    private String info;
    private String phone;
    private int review;

    public int getBarberPhoto() {
        return barberPhoto;
    }

    public void setBarberPhoto(int barberPhoto) {
        this.barberPhoto = barberPhoto;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public barber(int barberPhoto, String name, String info, String phone, int review) {
        this.barberPhoto = barberPhoto;
        this.name = name;
        this.info = info;
        this.phone = phone;
        this.review = review;
    }




}
