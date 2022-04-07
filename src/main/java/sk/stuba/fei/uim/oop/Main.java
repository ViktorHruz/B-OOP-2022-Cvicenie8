package sk.stuba.fei.uim.oop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        InterfaceIndex ci = new InterfaceIndex();
        ci.add(new Message("hello"));
        ci.add(new Message("world"));
        ci.add(new Adress("hodzovo nam.", "80204"));
        var old = ci.add(new Message("hello world"));



        System.out.println(old);

    }


}
