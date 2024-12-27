package org.example.exercism.NeedForSpeed;

class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int drivenMeters;
    private int batteryPercentage = 100;


    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryDrain > batteryPercentage;
    }

    public int distanceDriven() {
        return drivenMeters;
    }

    public void drive() {
        if(this.batteryDrain <= this.batteryPercentage) {
            this.drivenMeters += this.speed;
            this.batteryPercentage -= this.batteryDrain;
            distanceDriven();
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(10,2);
        RaceTrack raceTrack = new RaceTrack(100);

        System.out.println(raceTrack.canFinishRace(car));

    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (loop(car)){
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }

    private boolean loop (NeedForSpeed car){
        return car.distanceDriven() < this.distance && !car.batteryDrained();
    }
}

