package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String SHOPINNG = "SHOPINNG TASK";

    public final Task createTask(String taskClass){
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Trip","Nurgburgring race track","Dodge Charger R/T 1968");
            case PAINTING:
                return new PaintingTask("Paint job","aluminium","My P-47D model");
            case SHOPINNG:
                return new ShopingTask("Daily shopping","Bread",1.0);
            default:
                    return null;
        }
    }
}
