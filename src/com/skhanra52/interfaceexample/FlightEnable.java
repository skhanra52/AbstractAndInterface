package com.skhanra52.interfaceexample;

public interface FlightEnable {
    /*
        Implicitly public, static, final. Which means they are really constant.
        When we use the final modifier, we prevent ny further modifications to that component.
         1. A final method means it can't be overridden by the subclasses.
         2. A final field means an object can't be re-assigned or given a different value after
            its initialization.
         3. A final static field is a class field that can't be re-assigned or given a different value
            after the class initialization process.
         4. A final class can't be overridden, means no class can use it in extends clause.
         5. A final variable in a block of code, means that once it's assign a value any remaining code
            in the block can't change it.
         6. A final parameter means you can't assign a different value to that parameter in the method block.

            double MILES_TO_KM = 1.60934;
            final double MILES_TO_KM = 1.60934;
            public final double MILES_TO_KM = 1.60934;
            public static double MILES_TO_KM = 1.60934;

            all the above declarations are same on interface.
     */
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    /*
        By default, all the methods in interface without body are
     public abstract so we do not need to declare these explicitly.

    Note 1 : If you omit an access modifier on a class member, its implicitly package private.
    If you omit an access modifier on an interface member, it's implicitly public.

    Below all three are same (redundant).
    --------------------------------------
    public abstract void takeOff();
    abstract void land();
    void fly();

    Note 2: Changing the access modifier to protected on an interface is a compiler error,
    whether the method is concrete or abstract.
    Note 3: Only a concrete method can have private access.
   */

    void takeOff();
    void land();
    void fly();

    /*
      Defined new abstract method in the interface, which will force all the class to implement this method
      Where ever the interface has been implemented.
     */
//    FlightStages transition(FlightStages stage);

    /*
     Java 8 provides a new way to add any method to the existing interface. That is a default interface.
     Which should have a body even though its empty body.

     Just like overriding a method on a class, you have three choices
     when you override a default method on an interface.
        1. You can choose not to override it at all.
        2. You can override the method and write code for it, so that the interface method isn't executed.
        3. Or you can write your own code, and invoke the method on the interface, as part of your implementation.

     */
    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on "
//                +this.getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to "+ nextStage);
        return  nextStage;
    };
}
