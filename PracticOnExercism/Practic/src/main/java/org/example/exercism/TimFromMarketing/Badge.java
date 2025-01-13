package org.example.exercism.TimFromMarketing;

public class Badge {
    public String print(Integer id, String name, String department) {
        String badge= null;
        if (id != null && name != null && department != null ){
            badge = "["+ id + "] - " + name + " - " +  department.toUpperCase() ;
        }
        else if (id == null && name!= null && department == null){
            badge =  name + " - OWNER";
        }
        else if (department == null){
            badge =  "["+ id + "] - " +name + " - OWNER";
        }
        else if (id == null){
            badge = name + " - " + department.toUpperCase();
        }
       return badge;
    }

    public static void main(String[] args) {
        Badge badge = new Badge();
//        Task1
        System.out.println( badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
        // Task2
        System.out.println(badge.print(null ,"Ernest Johnny Payne", "Strategic Communication"));
        // Task3
        System.out.println(badge.print(null ,"Ernest Johnny Payne", null));
        System.out.println(badge.print(59 ,"Ernest Johnny Payne", null));




    }
}
