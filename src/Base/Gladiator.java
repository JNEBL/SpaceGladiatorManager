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
        statCalculator();
    }

    public ArrayList<Value> getAccelerationComp() {
        return accelerationComp;
    }
    public void addAccelerationCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getAgilityComp() {
        return agilityComp;
    }
    public void addAgilityCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getBalanceComp() {
        return balanceComp;
    }
    public void addBalanceCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getDexterityComp() {
        return dexterityComp;
    }
    public void addDexterityCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getStaminaComp() {
        return staminaComp;
    }
    public void addStaminaCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getStrengthComp() {
        return strengthComp;
    }
    public void addStrengthCompValue(Value value){
        accelerationComp.add(value);
    }

    public ArrayList<Value> getToughnessComp() {
        return toughnessComp;
    }
    public void addToughnessCompValue(Value value){
        accelerationComp.add(value);
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
                accelerationComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(agilityComp,"Base Value") != -1){
                agilityComp.remove(arrayListValueIndexFinder(agilityComp,"Base Value"));
                agilityComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(balanceComp,"Base Value") != -1){
                balanceComp.remove(arrayListValueIndexFinder(balanceComp,"Base Value"));
                balanceComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(dexterityComp,"Base Value") != -1){
                dexterityComp.remove(arrayListValueIndexFinder(dexterityComp,"Base Value"));
                dexterityComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(staminaComp,"Base Value") != -1){
                staminaComp.remove(arrayListValueIndexFinder(staminaComp,"Base Value"));
                staminaComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(strengthComp,"Base Value") != -1){
                strengthComp.remove(arrayListValueIndexFinder(strengthComp,"Base Value"));
                strengthComp.add(race.getAcceleration());
            }
            if (arrayListValueIndexFinder(toughnessComp,"Base Value") != -1){
                toughnessComp.remove(arrayListValueIndexFinder(toughnessComp,"Base Value"));
                toughnessComp.add(race.getAcceleration());
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
        int temp = 0;
        for (int x = 0;x < accelerationComp.size();x++){
            temp+=accelerationComp.get(x).getValue();
        }
        setAcceleration(temp);
        temp = 0;
        for (int x = 0;x < agilityComp.size();x++){
            temp+=agilityComp.get(x).getValue();
        }
        setAgility(temp);
        temp = 0;
        for (int x = 0;x < balanceComp.size();x++){
            temp+=balanceComp.get(x).getValue();
        }
        setBalance(temp);
        temp = 0;
        for (int x = 0;x < dexterityComp.size();x++){
            temp+=dexterityComp.get(x).getValue();
        }
        setDexterity(temp);
        temp = 0;
        for (int x = 0;x < staminaComp.size();x++){
            temp+=staminaComp.get(x).getValue();
        }
        setStamina(temp);
        temp = 0;
        for (int x = 0;x < strengthComp.size();x++){
            temp+=strengthComp.get(x).getValue();
        }
        setStrength(temp);
        temp = 0;
        for (int x = 0;x < toughnessComp.size();x++){
            temp+=toughnessComp.get(x).getValue();
        }
        setToughness(temp);
    }
}
