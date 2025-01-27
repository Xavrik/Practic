package org.example.exercism.WizardsandWarriors;

public class GameMaster {

    public String describe(Character character) {
    return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +" with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod ) {
        return switch (travelMethod){
            case WALKING -> "You're traveling to your destination by " + travelMethod.name().toLowerCase() + ".";
            case HORSEBACK -> "You're traveling to your destination on " + travelMethod.name().toLowerCase() + ".";
        };
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod ) {
        return describe(character) + " " + describe(travelMethod) + " "+ describe(destination);
    }

    public String describe(Character character, Destination destination ) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " "+ describe(destination);
    }


    public static void main(String[] args) {

        //Task1
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);
        System.out.println(new GameMaster().describe(character));

        //Task2
        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);
        System.out.println(new GameMaster().describe(destination));

        //Task3
        System.out.println(new GameMaster().describe(TravelMethod.HORSEBACK));

        //Task4
        Character character2 = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination2 = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        System.out.println(new GameMaster().describe(character2, destination2, TravelMethod.HORSEBACK));

        //Task5
        Character character3 = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination3 = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        System.out.println(new GameMaster().describe(character3, destination3));
    }


}
