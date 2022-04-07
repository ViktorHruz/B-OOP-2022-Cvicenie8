package sk.stuba.fei.uim.oop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        ConcreteIndex concreteIndex = new ConcreteIndex();
        concreteIndex.add(new Message("hello"));
        concreteIndex.add(new Message("world"));
        concreteIndex.add(new Message("hello world"));
        System.out.println(concreteIndex.toString());
    }


}
