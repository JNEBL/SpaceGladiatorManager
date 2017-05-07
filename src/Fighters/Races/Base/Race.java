package Fighters.Races.Base;

import Calculations.Value;

/**
 * Created by student5 on 5/4/17.
 */
public class Race {
    private Value strength,dexterity,agility,stamina,acceleration,balance,toughness;
    public Race(Value strength,Value dexterity,Value agility,Value stamina,Value acceleration,Value balance,
                Value toughness){
        setStrength(strength);
        setDexterity(dexterity);
        setAgility(agility);
        setStamina(stamina);
        setAcceleration(acceleration);
        setBalance(balance);
        setToughness(toughness);
    }

    public Value getAcceleration() {
        return acceleration;
    }
    private void setAcceleration(Value acceleration) {
        this.acceleration = acceleration;
    }

    public Value getAgility() {
        return agility;
    }
    private void setAgility(Value agility) {
        this.agility = agility;
    }

    public Value getBalance() {
        return balance;
    }
    private void setBalance(Value balance) {
        this.balance = balance;
    }

    public Value getDexterity() {
        return dexterity;
    }
    private void setDexterity(Value dexterity) {
        this.dexterity = dexterity;
    }

    public Value getStamina() {
        return stamina;
    }
    private void setStamina(Value stamina) {
        this.stamina = stamina;
    }

    public Value getStrength() {
        return strength;
    }
    private void setStrength(Value strength) {
        this.strength = strength;
    }

    public Value getToughness() {
        return toughness;
    }
    private void setToughness(Value toughness) {
        this.toughness = toughness;
    }
}
