package sk.stuba.fei.uim.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Message implements CharacterKey{
    private String content;

    @Override
    public Character getke() {
        return this.getContent().charAt(0);
    }
}
