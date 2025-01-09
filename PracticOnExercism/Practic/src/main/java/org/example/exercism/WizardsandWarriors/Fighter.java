package org.example.exercism.WizardsandWarriors;

public class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends  Fighter{

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter){

        return fighter.isVulnerable() ? 10 : 6;
    }
}
class Wizard extends Fighter{
    private boolean vulnerable = true;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    @Override
    public boolean isVulnerable(){
        return vulnerable;
    }
    public boolean prepareSpell(){
        return vulnerable = false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){

       // return fighter.isVulnerable() ? 3 : 12;
        return vulnerable ? 3 : 12;
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();

     //   System.out.println(wizard.prepareSpell());
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.getDamagePoints(warrior));

    }
        }
