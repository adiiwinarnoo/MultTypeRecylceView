package com.example.multitypeview.models;

public class  Trip {
    private int tripimage;
    private String triptittle, trip;

    public Trip(int tripimage, String triptittle, String trip) {
        this.tripimage = tripimage;
        this.triptittle = triptittle;
        this.trip = trip;
    }

    public int getTripimage() {
        return tripimage;
    }

    public String getTriptittle() {
        return triptittle;
    }

    public String getTrip() {
        return trip;
    }
}
