package sk.stuba.fei.uim.oop;

import java.util.List;

public class InterfaceIndex extends GenericIndex<Character, CharacterKey>{


    public List<CharacterKey> add(CharacterKey value) {
      return  this.put(value.getke(),value);
    }

}
