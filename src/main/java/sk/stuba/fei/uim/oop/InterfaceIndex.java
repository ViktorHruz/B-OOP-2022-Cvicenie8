package sk.stuba.fei.uim.oop;

import java.util.List;

public class InterfaceIndex<VALUE_TYPE extends  CharacterKey> extends GenericIndex<Character, VALUE_TYPE>{


    public List<VALUE_TYPE> add(VALUE_TYPE value) {
      return  this.put(value.getke(),value);
    }

}
