package sk.stuba.fei.uim.oop;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Message> messages = new ArrayList<>();

        messages.add(new Message("hello"));
        messages.add(new Message("world"));

        for(Message m: messages){
            System.out.println(m.getContent());
        }
    }
}
