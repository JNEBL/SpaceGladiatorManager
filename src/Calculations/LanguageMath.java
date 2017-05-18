package Calculations;

import World.Language.Base.Language;

import java.util.ArrayList;

/**
 * Created by student5 on 5/17/17.
 */
public class LanguageMath {
    private static boolean canTranslateNatively(ArrayList<Language> languagesKnown,Language language){
        for (int x = 0;x < languagesKnown.size();x++){
            if (languagesKnown.get(x).getName().equals(language.getName()))
                return true;
        }
        return false;
    }
    private static boolean mutuallyLinguableTranslatable(ArrayList<Language> languagesKnown,Language language){
        for (int x = 0;x < languagesKnown.size();x++){
            for (int y = 0;y < languagesKnown.get(x).getMutuallyLingual().size();y++){
                if (languagesKnown.get(x).getMutuallyLingual().get(y).getName().equals(language.getName()))
                    return true;
            }
        }
        return false;
    }
    private static boolean checkToSeeIfLetter(String letter){
        if (!(letter.length() == 1))
            return false;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return alphabet.contains(letter);
    }
    private static boolean checkToIfLetterIsCapital(String letter){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alphabet.contains(letter);
    }
    private static boolean checkToSeeIfNumber(String letter){
        if (!(letter.length() == 1))
            return false;
        String numeric = "1234567890";
        return numeric.contains(letter);
    }
    public static String translate(String message,ArrayList<Language> languagesKnown,Language language){
        if (canTranslateNatively(languagesKnown,language)){
            return message;
        }
        else if (mutuallyLinguableTranslatable(languagesKnown,language)){
            for (int x = 0;x < message.length();x++){
                if (Math.random() < .2){
                    String letter = message.substring(x,x+1);
                    if (checkToSeeIfLetter(letter)){
                        if (checkToIfLetterIsCapital(letter)){
                            String string = "ABCDEFGHIJKLMNOPQRSTUVWYZ";

                        }
                        else {

                        }
                    }
                    else if (checkToSeeIfNumber(letter)){

                    }
                }
            }
        }
        return message;
    }
}
