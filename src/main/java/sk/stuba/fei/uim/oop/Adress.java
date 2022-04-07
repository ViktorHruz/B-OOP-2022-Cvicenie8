package sk.stuba.fei.uim.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Adress implements  CharacterKey{

    private String adress;
    private String psc;

    @Override
    public Character getke() {
        return adress.charAt(0);
    }
}
