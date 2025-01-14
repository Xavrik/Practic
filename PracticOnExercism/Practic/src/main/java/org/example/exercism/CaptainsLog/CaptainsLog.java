package org.example.exercism.CaptainsLog;
import java.util.Random;

public class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        int shipNumber = 1000+random.nextInt(9000);
        return "NCC-"+ shipNumber;
    }

    double randomStardate() {
        return 41000.0+random.nextDouble(1000.0);
    }

    public static void main(String[] args) {
        CaptainsLog captainsLog = new CaptainsLog(new Random());
        //Task1
        System.out.println(captainsLog.randomPlanetClass());
        //Task2
        System.out.println(captainsLog.randomShipRegistryNumber());
        //Task3
        System.out.println(captainsLog.randomStardate());
    }

}
