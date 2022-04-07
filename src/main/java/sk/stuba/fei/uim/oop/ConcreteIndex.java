package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;


public class ConcreteIndex extends GenericIndex<Character, Message>{



    public void add(Message m) {
        this.put(m.getContent().charAt(0),m);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (var entry : this.index.entrySet()) {
            builder.append("---------------------\n");
            builder.append("Key: ").append(entry.getKey()).append("\n");

            for(Message m: entry.getValue()){
                builder.append("\tmessage: ").append(m.getContent()).append("\n");
            }
        }
        return builder.toString();
    }

}
