package org.example.exercism.GottaSnatchEmAll;

import java.util.*;

public class GottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
       return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean myCards = false;
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                myCards = true;
                break;
            }
        }
        boolean aponentCard = false;
        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                aponentCard = true;
                break;
            }
        }
        return myCards && aponentCard;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> finishSet = new HashSet<>(collections.get(0));
        if(!collections.isEmpty()){
            for (Set<String> collection : collections){
            finishSet.retainAll(collection);
        }}
        return finishSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCollections = new HashSet<>();
        for(Set<String> collection : collections){
            allCollections.addAll(collection);
        }
        return allCollections;
    }

    public static void main(String[] args) {

        //Task1
        System.out.println("Task1");
        System.out.println(GottaSnatchEmAll.newCollection(List.of("Newthree", "Newthree", "Newthree")));

        //Task2
        List<String> list = new ArrayList<>();
        list.add("Newthree");
        list.add("test");
        Set<String> collection = GottaSnatchEmAll.newCollection(list);
        System.out.println("Task2");
        System.out.println(GottaSnatchEmAll.addCard("Scientuna",collection));
        // => true

        System.out.println(collection.contains("Scientuna"));
        // => true

        //Task3
        Set<String> myCollection = Set.of("Newthree");
        Set<String> theirCollection = Set.of("Scientuna");
        System.out.println("Task3");
        System.out.println(GottaSnatchEmAll.canTrade(myCollection, theirCollection));
        // => true

    }

}
