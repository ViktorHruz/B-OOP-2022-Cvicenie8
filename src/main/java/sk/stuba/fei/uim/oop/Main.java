package sk.stuba.fei.uim.oop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        InterfaceIndex<Adress> ci = new InterfaceIndex<>();
        ci.add(new Adress("hodzovo nam.", "80204"));
        ci.add(new Adress("Hlavna ulica", "123456"));

        var old = ci.add(new Adress("hlinene nam.", "543210"));

        for(Adress a : old){
            System.out.println(a.getPsc() + " " + a.getAdress());
        }

    }


}
