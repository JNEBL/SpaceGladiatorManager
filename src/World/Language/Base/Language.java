package World.Language.Base;

import java.util.ArrayList;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Language {
    private String name;
    private ArrayList<Language> mutuallyLingual = new ArrayList<>();
    public Language(String name,ArrayList<Language> mutuallyLingual){
        this.name = name;
        this.mutuallyLingual = mutuallyLingual;
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public ArrayList<Language> getMutuallyLingual() {
        return mutuallyLingual;
    }
}
