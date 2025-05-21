package com.skhanra52.interfaceexample;

public class Track implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are recorder.");
    }
}
