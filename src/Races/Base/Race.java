package Races.Base;

import Calculations.Value;

/**
 * Created by student5 on 5/4/17.
 */
public class Race {
    private Value strength,dexterity,agility,stamina,acceleration,balance,toughness;
    public Race(Value strength,Value dexterity,Value agility,Value stamina,Value acceleration,Value balance,
                Value toughness){

    }

    public Value getAcceleration() {
        return acceleration;
    }

    public Value getAgility() {
        return agility;
    }

    public Value getBalance() {
        return balance;
    }

    public Value getDexterity() {
        return dexterity;
    }

    public Value getStamina() {
        return stamina;
    }

    public Value getStrength() {
        return strength;
    }

    public Value getToughness() {
        return toughness;
    }
}
