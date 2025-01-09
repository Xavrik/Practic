package org.example.exercism.CarsAssemble;

//import lombok.extern.slf4j.Slf4j;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        int producedEachHour = 221;
        double rate;
        rate = speed*producedEachHour;

        if(speed== 10){
            rate -= calculatePercentage(rate, 23);
        }
        else if (speed == 9){
            rate -= calculatePercentage(rate, 20);
        }

        else if (speed >= 5 && speed <= 8){
            rate -= calculatePercentage(rate, 10);
        }
        else if (speed >= 1 && speed <= 4){
            return rate;
        }

        return rate;
    }

    public int workingItemsPerMinute(int speed) {
       return (int) (productionRatePerHour(speed) / 60);
    }
    public double calculatePercentage(double obtained, double total) {
        return obtained / 100 * total;
    }
    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();

        System.out.println(carsAssemble.productionRatePerHour(6));
        System.out.println(carsAssemble.workingItemsPerMinute(6));
    }
}
