package com.yazlab.deneme;

public class Taxi {
    private int DOLocationID;
    private int PULocationID;
    private int passenger_count;
    private float total_amount;
    private String tpep_pickup_datetime;
    private String tpep_dropoff_datetime;
    private  float trip_distance;

    public Taxi() {
    }

    public Taxi(int DOLocationID, int PULocationID, int passenger_count, int total_amount, String tpep_pickup_datetime, String tpep_dropoff_datetime, int trip_distance) {
        this.DOLocationID = DOLocationID;
        this.PULocationID = PULocationID;
        this.passenger_count = passenger_count;
        this.total_amount = total_amount;
        this.tpep_pickup_datetime = tpep_pickup_datetime;
        this.tpep_dropoff_datetime = tpep_dropoff_datetime;
        this.trip_distance = trip_distance;
    }

    public int getDOLocationID() {
        return DOLocationID;
    }

    public void setDOLocationID(int DOLocationID) {
        this.DOLocationID = DOLocationID;
    }

    public int getPULocationID() {
        return PULocationID;
    }

    public void setPULocationID(int PULocationID) {
        this.PULocationID = PULocationID;
    }

    public String getTpep_dropoff_datetime() {
        return tpep_dropoff_datetime;
    }

    public void setTpep_dropoff_datetime(String tpep_dropoff_datetime) {
        this.tpep_dropoff_datetime = tpep_dropoff_datetime;
    }

    public int getPassenger_count() {
        return passenger_count;
    }

    public void setPassenger_count(int passenger_count) {
        this.passenger_count = passenger_count;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public float getTrip_distance() {
        return trip_distance;
    }



    public String getTpep_pickup_datetime() {
        return tpep_pickup_datetime;
    }

    public void setTpep_pickup_datetime(String tpep_pickup_datetime) {
        this.tpep_pickup_datetime = tpep_pickup_datetime;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    public void setTrip_distance(float trip_distance) {
        this.trip_distance = trip_distance;
    }
}
