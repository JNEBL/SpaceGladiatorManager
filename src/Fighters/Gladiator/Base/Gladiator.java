package Fighters.Gladiator.Base;

import Calculations.Calculation;
import Calculations.Value;
import Fighters.Races.Base.Race;

import java.util.ArrayList;

/**
 * Created by student5 on 5/4/17.
 */
public class Gladiator {
    private Race race;
    private int dexterity,strength,agility,stamina,acceleration,balance,toughness;
    private String name;
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
        statCalculator();
    }

    public ArrayList<Value> getAgilityComp() {
        return agilityComp;
    }
    public void addAgilityCompValue(Value value){
        agilityComp.add(value);
        statCalculator();
    }

    public ArrayList<Value> getBalanceComp() {
        return balanceComp;
    }
    public void addBalanceCompValue(Value value){
        balanceComp.add(value);
        statCalculator();
    }

    public ArrayList<Value> getDexterityComp() {
        return dexterityComp;
    }
    public void addDexterityCompValue(Value value){
        dexterityComp.add(value);
        statCalculator();
    }

    public ArrayList<Value> getStaminaComp() {
        return staminaComp;
    }
    public void addStaminaCompValue(Value value){
        staminaComp.add(value);
        statCalculator();
    }

    public ArrayList<Value> getStrengthComp() {
        return strengthComp;
    }
    public void addStrengthCompValue(Value value){
        strengthComp.add(value);
        statCalculator();
    }

    public ArrayList<Value> getToughnessComp() {
        return toughnessComp;
    }
    public void addToughnessCompValue(Value value){
        toughnessComp.add(value);
        statCalculator();
    }

    public int getAcceleration() {
        return acceleration;
    }
    private void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAgility() {
        return agility;
    }
    private void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBalance() {
        return balance;
    }
    private void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDexterity() {
        return dexterity;
    }
    private void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStamina() {
        return stamina;
    }
    private void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }
    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }
    private void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public Race getRace() {
        return race;
    }
    private void setRace(Race race) {
        this.race = race;
        if (allReadyExistantRaceChecker()){
            if (Calculation.arrayListGladiatorValueIndexFinder(accelerationComp,"Fighters.Gladiator.Base Value") != -1){
                accelerationComp.remove(Calculation.arrayListGladiatorValueIndexFinder(accelerationComp,"Fighters.Gladiator.Base Value"));
                accelerationComp.add(race.getAcceleration());
            }
            else
                accelerationComp.add(race.getAcceleration());
            if (Calculation.arrayListGladiatorValueIndexFinder(agilityComp,"Fighters.Gladiator.Base Value") != -1){
                agilityComp.remove(Calculation.arrayListGladiatorValueIndexFinder(agilityComp,"Fighters.Gladiator.Base Value"));
                agilityComp.add(race.getAgility());
            }
            else
                agilityComp.add(race.getAgility());
            if (Calculation.arrayListGladiatorValueIndexFinder(balanceComp,"Fighters.Gladiator.Base Value") != -1){
                balanceComp.remove(Calculation.arrayListGladiatorValueIndexFinder(balanceComp,"Fighters.Gladiator.Base Value"));
                balanceComp.add(race.getBalance());
            }
            else
                balanceComp.add(race.getBalance());
            if (Calculation.arrayListGladiatorValueIndexFinder(dexterityComp,"Fighters.Gladiator.Base Value") != -1){
                dexterityComp.remove(Calculation.arrayListGladiatorValueIndexFinder(dexterityComp,"Fighters.Gladiator.Base Value"));
                dexterityComp.add(race.getDexterity());
            }
            else
                dexterityComp.add(race.getDexterity());
            if (Calculation.arrayListGladiatorValueIndexFinder(staminaComp,"Fighters.Gladiator.Base Value") != -1){
                staminaComp.remove(Calculation.arrayListGladiatorValueIndexFinder(staminaComp,"Fighters.Gladiator.Base Value"));
                staminaComp.add(race.getStamina());
            }
            else
                staminaComp.add(race.getStamina());
            if (Calculation.arrayListGladiatorValueIndexFinder(strengthComp,"Fighters.Gladiator.Base Value") != -1){
                strengthComp.remove(Calculation.arrayListGladiatorValueIndexFinder(strengthComp,"Fighters.Gladiator.Base Value"));
                strengthComp.add(race.getStrength());
            }
            else
                strengthComp.add(race.getStrength());
            if (Calculation.arrayListGladiatorValueIndexFinder(toughnessComp,"Fighters.Gladiator.Base Value") != -1){
                toughnessComp.remove(Calculation.arrayListGladiatorValueIndexFinder(toughnessComp,"Fighters.Gladiator.Base Value"));
                toughnessComp.add(race.getToughness());
            }
            else
                toughnessComp.add(race.getToughness());
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
        if (Calculation.valueCheckerArrayList(accelerationComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(agilityComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(balanceComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(dexterityComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(staminaComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(strengthComp,"Fighters.Gladiator.Base Value"))
            return true;
        if (Calculation.valueCheckerArrayList(toughnessComp,"Fighters.Gladiator.Base Value"))
            return true;
        return false;
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
