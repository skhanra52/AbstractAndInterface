package com.skhanra52.interfaceexample;

public class Jet implements FlightEnable, Trackable{


    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off...");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing..");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying...");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are recorder.");
    }
    /*
    When ever you call a default method from override method you should call with super
    return FlightEnable.super.transition(stage);
     */
    public FlightStages transition (FlightStages stage){
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnable.super.transition(stage);
    }
}
