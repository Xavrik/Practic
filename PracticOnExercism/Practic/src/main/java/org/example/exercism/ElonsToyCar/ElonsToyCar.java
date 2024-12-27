package org.example.exercism.ElonsToyCar;

public class ElonsToyCar {
    private int drivenMeters;
    private int batteryPercentage = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return "Driven "+ drivenMeters + " meters";
    }

    public String batteryDisplay() {
        if(this.batteryPercentage == 0){
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage;
    }

    public void drive() {
        if(this.batteryPercentage != 0){
            this.drivenMeters +=20;
            this.batteryPercentage--;
        }
    }


}

