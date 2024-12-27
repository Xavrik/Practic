package org.example.exercism.BirdWatcher;

class BirdWatcher {
    private final int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };



    //    public exercism.BirdWatcher(int[] birdsPerDay) {
//        this.birdsPerDay = birdsPerDay.clone();
//    }
public static void main(String[] args) {
    BirdWatcher birdWatcher = new BirdWatcher();
 //   System.out.println(Arrays.toString(birdWatcher.getLastWeek()));

    birdWatcher.getToday();
    birdWatcher.incrementTodaysCount();
    birdWatcher.hasDayWithoutBirds();
    birdWatcher.getCountForFirstDays(10);
    birdWatcher.getBusyDays();
}

    public int[] getLastWeek() {
        int startDate = birdsPerDay.length -7;
        int [] lastWeek = new int[7];
        int p =0;
        for (int i = startDate; i < 7  ; i++){
           lastWeek[p] = birdsPerDay[i];
           p++;
        }
        return lastWeek;
    }

    public int getToday() {
        int todayIndex = birdsPerDay.length-1;
        return birdsPerDay[todayIndex];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = true;
        for (int i =0; i <= birdsPerDay.length -1; i++){
            if (birdsPerDay[i] == 0){
                dayWithoutBirds = true;
                break;
            }
            else dayWithoutBirds = false;
        }
        return dayWithoutBirds;
    }

//    public int getCountForFirstDays(int numberOfDays) {
//    int countOfBirds =0;
//    if(numberOfDays <= birdsPerDay.length){
//
//        for (int i = 0; i < numberOfDays; i++) {
//            countOfBirds += birdsPerDay[i];
//        }
//    }
//    else {
//        numberOfDays = birdsPerDay.length;
//        for (int i = 0; i < numberOfDays; i++) {
//            countOfBirds += birdsPerDay[i];
//        }
//    }
//        return countOfBirds;
//    }
public int getCountForFirstDays(int numberOfDays) {
    int countOfBirds =0;
    if(numberOfDays > birdsPerDay.length){
        numberOfDays = birdsPerDay.length;
    }
        for (int i = 0; i < numberOfDays; i++) {
            countOfBirds += birdsPerDay[i];
        }
    return countOfBirds;
}

    public int getBusyDays() {
        int  busyDays = 0;
        for (int i = 0; i <= birdsPerDay.length -1; i++) {
           if(birdsPerDay[i] >= 5){
               busyDays ++;
           }
        }
        return busyDays;
    }
}
