package com.skhanra52.interfaceexample;

/*
   Both records and enums can implement interfaces. But they can't extend classes, abstract or not.
  */

public enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    /**
     * Values() returns the list of enum const,
     * and original() returns the index of element.
     * @return This method to get the next enum type.
     */
    public FlightStages getNextStage(){
        FlightStages [] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}