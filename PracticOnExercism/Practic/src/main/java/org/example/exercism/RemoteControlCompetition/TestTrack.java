package org.example.exercism.RemoteControlCompetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
       car.drive();

    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }

    public static void main(String[] args) {
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        System.out.println(rankings.get(0));
        System.out.println(rankings.get(1));
        System.out.println(prc1.getNumberOfVictories());
        System.out.println(prc2.getNumberOfVictories());
    }
}

