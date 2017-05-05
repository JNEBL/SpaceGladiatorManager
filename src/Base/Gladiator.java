package Base;

import Calculations.Calculation;
import Calculations.Value;
import Races.Base.Race;

import java.util.ArrayList;

/**
 * Created by student5 on 5/4/17.
 */
public class Gladiator {
    private Race race;
    private int dexterity,strength,agility,stamina,acceleration,balance,toughness;
    private ArrayList<Value> dexterityComp = new ArrayList<>();
    private ArrayList<Value> strengthComp = new ArrayList<>();
    private ArrayList<Value> agilityComp = new ArrayList<>();
    private ArrayList<Value> staminaComp = new ArrayList<>();
    private ArrayList<Value> accelerationComp = new ArrayList<>();
    private ArrayList<Value> balanceComp = new ArrayList<>();
    private ArrayList<Value> toughnessComp = new ArrayList<>();
    public Gladiator(Race race){
        setRace(race);
    }

    public ArrayList<Value> getAccelerationComp() {
        return accelerationComp;
    }
    public ArrayList<Value> getAgilityComp() {
        return agilityComp;
    }
    public ArrayList<Value> getBalanceComp() {
        return balanceComp;
    }
    public ArrayList<Value> getDexterityComp() {
        return dexterityComp;
    }
    public ArrayList<Value> getStaminaComp() {
        return staminaComp;
    }
    public ArrayList<Value> getStrengthComp() {
        return strengthComp;
    }
    public ArrayList<Value> getToughnessComp() {
        return toughnessComp;
    }

    public int getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
        if (allReadyExistantRaceChecker()){
            if (arrayListValueIndexFinder(accelerationComp,"Base Value") != -1){
                accelerationComp.remove(arrayListValueIndexFinder(accelerationComp,"Base Value"));
                
            }

        }
        else{
            accelerationComp.add(race.getAcceleration());
            agilityComp.add(race.getAgility());
            balanceComp.add(race.getBalance());
            dexterityComp.add(race.getDexterity());
            staminaComp.add(race.getStamina());
            strengthComp.add(race.getStrength());
            toughnessComp.add(race.getToughness());
        }
    }

    private boolean allReadyExistantRaceChecker(){
        if (Calculation.valueCheckerArrayList(accelerationComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(agilityComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(balanceComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(dexterityComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(staminaComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(strengthComp,"Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(toughnessComp,"Base Value"))
            return true;
        return false;
    }
    public int arrayListValueIndexFinder(ArrayList<Value> arrayList,String purpose){
        for (int x = 0;x < arrayList.size();x++){
            if (Calculation.valueChecker(arrayList.get(x),purpose))
                return x;
        }
        return -1;
    }
    private void statCalculator(){

    }
}
